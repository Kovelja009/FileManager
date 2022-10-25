package paket;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Locale;

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

    abstract boolean checkConfig(String parentPath, String ext, long size);
//    public void globabladd(T file){
//        if(checkConfig(file))
//            add(file);
//    }

    @Override
    // u implementaciji postaviti polja konfiguracije
    public boolean createRoot(String path) {
        Configuration configuration1 = new Configuration();
        if(createRoot(path, configuration1)){
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
    // TODO da baca exception ako vec sadrži u listi
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

    String formatItem(String name, String ext, long size, String lastModified, String created){
        return String.format(Locale.US, "%-25s %-5s %-10d %-12s %-10s%n", name, ext, size, lastModified, created);
    }
}
