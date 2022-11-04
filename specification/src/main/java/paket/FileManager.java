package paket;

import Data.MyFile;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public abstract class FileManager implements BasicOP, Search, Config{
    protected Configuration configuration;
    protected String rootPath;
    protected long currSize = 0L;


    public FileManager(){
    }

    /**
     *
     * @param parentPath
     * @param ext
     * @param size
     * @return
     */
    protected abstract boolean checkConfig(String parentPath, String ext, long size);

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
        return createRoot(path, name, configuration1);
    }

    @Override
    public boolean createRoot(String path, String name, int file_n) throws IOException {
        Configuration configuration = new Configuration();
        if(createRoot(path,name,configuration)){
            addFile_n(getFullPath(path+ File.separator+name),file_n);
            return true;
        }
        return false;
    }

    @Override
    public void addFile_n(String path, Integer num) {
        configuration.getFile_n().put(path,num);
    }

    @Override
    public boolean mkdir(String path, List<String> names) {
        for(String name:names){
            if(!mkdir(path,name))
                return false;
        }
        return true;
    }

    @Override
    public boolean mkdir(String path, List<String> names, int file_n) {
        for(String name:names){
            if(!mkdir(path,name))
                return false;
            addFile_n(getFullPath(path+File.separator+name),file_n);
        }
        return true;
    }

    @Override
    public boolean mkdir(String path, String name, int n, boolean file_n) {
        if(!file_n){
            for(int i=1;i<=n;i++){
                if(!mkdir(path,name+"_"+ i ))
                    return false;
            }
            return true;
        }else{
            if(mkdir(path,name)){
                addFile_n(getFullPath(path+File.separator+name),n);
                return true;
            }
            return false;
        }

    }

    @Override
    public boolean mkdir(String path, String name, int n, int file_n) {
        for(int i=1;i<=n;i++){
            if(!mkdir(path,name+"_"+ i ))
                return false;
            addFile_n(getFullPath(path+File.separator+name+"_"+i),file_n);
        }
        return true;
    }

    @Override
    public boolean mkdir(String name) {
        return mkdir("", name);
    }

    @Override
    public boolean mkdir(List<String> names) {
        return mkdir("", names);
    }

    @Override
    public boolean mkdir(String name, int n) {
        return mkdir("", name, n,false);
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

    protected abstract String getFullPath(String path);


}
