package paket;

import Data.MyFile;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
//TODO ukljuciti u settings.xml i pom.xml mogucnost da povlacis package sa github-a
<dependency>
  <groupId>com.komponente.project</groupId>
  <artifactId>specification</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
*/

@Getter
@Setter
public abstract class FileManager implements BasicOP, Search, Config{
    private Configuration configuration;
    private String rootPath;

    // TODO napraviti save config koja čuva konfiguraciju na zadatoj lokaciji -> u oba konstruktora
    // TODO pre svega napraviti da se provera da li na zadatoj putanji već postoji konfiguracija -> možda zajednička metoda?
    // TODO ako postoji onda nju učitati, inače napraviti novu
    public FileManager(){
    }

    public abstract boolean checkConfig(String parentPath, String ext, long size, int n_number);
//    public void globabladd(T file){
//        if(checkConfig(file))
//            add(file);
//    }
    /**
     * Save object in the specified collection of the storage.
     *
     * @param path nesto mojeeeesad sdfasfasfasdfsdaf
     * @param name
     */
    @Override
    // u implementaciji postaviti polja konfiguracije i pozvati saveConfig
    public boolean createRoot(String path, String name) throws IOException {
        Configuration configuration1 = new Configuration();
        if(createRoot(path, name, configuration1)){
            rootPath = path;
            configuration = configuration1;
            saveConfig(path);
            return true;
        }
        return false;
    }

    @Override
    public void setSize(long size) {
        configuration.setSize(size);
    }

    @Override
    public void addExtension(String extension) {
        if(!configuration.getExcludedExt().contains(extension))
            configuration.getExcludedExt().add(extension);
    }

    @Override
    public void setFile_n(int file_n) {
        configuration.setFile_n(file_n);
    }

    @Override
    public boolean mkdir(String name) {
        return mkdir(rootPath, name);
    }

    @Override
    public boolean mkdir(List<String> names) {
        return mkdir(rootPath, names);
    }

    @Override
    public boolean mkdir(String name, int n) {
        return mkdir(rootPath, name, n);
    }

    @Override
    public List<MyFile> searchAll(String path) {
        List<MyFile> listFile = new ArrayList<>(searchDir(path));
        listFile.addAll(searchSubDir(path));
        return listFile;
    }

    @Override
    public List<MyFile> filterByExt(String ext) {
        return filterByExt(rootPath, ext);
    }

    // ako ne sadrzi barem jedno od imena iz liste, vraca false
    @Override
    public boolean existListOfName(String path, List<String> names) {
        for(String name:names){
            if(!existName(path, name))
                return false;
        }
        return false;
    }



}
