package paket;

import Data.MyFile;
import java.io.File;
import java.util.*;


public abstract class FileManager implements BasicOP, Search, Config{
    protected Configuration configuration;
    protected String rootPath;
    protected long currSize = 0L;


    public FileManager(){
    }

    /**
     *
     * @param parentPath apsolutna putanja
     * @param ext
     * @param size
     * @return
     */
    protected abstract boolean checkConfig(String parentPath, String ext, long size) throws MyException;

    /**
     * Save object in the specified collection of the storage
     * @param path nesto mojeeeesad sdfasfasfasdfsdaf
     * @param name
     */
    @Override
    // u implementaciji postaviti polja konfiguracije i pozvati saveConfig
    public boolean createRoot(String path, String name) throws MyException {
        Configuration configuration1 = new Configuration();
        return createRoot(path, name, configuration1);
    }

    @Override
    public boolean createRoot(String path, String name, int file_n) throws MyException {
        Configuration configuration = new Configuration();
        if(createRoot(path,name,configuration)){
            addFile_n(getFullPath(path+ File.separator+name),file_n);
            return true;
        }
        return false;
    }

    @Override
    public boolean createRoot(String path, String name, Configuration configuration, int file_n) throws MyException{
        if(!createRoot(path, name, configuration))
            return false;
        addFile_n(getFullPath(path+ File.separator+name),file_n);
        return true;
    }

    @Override
    public void addFile_n(String path, Integer num) throws MyException {
        configuration.getFile_n().put(path,num);
    }

    @Override
    public boolean mkdir(String path, List<String> names) throws MyException {
        for(String name:names){
            if(!mkdir(path,name))
                return false;
        }
        return true;
    }

    @Override
    public boolean mkdir(String path, List<String> names, int file_n) throws MyException {
        for(String name:names){
            if(!mkdir(path,name))
                return false;
            addFile_n(getFullPath(path+File.separator+name),file_n);
        }
        return true;
    }

    @Override
    public boolean mkdir(String path, String name, int n, boolean file_n) throws MyException{
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
    public boolean mkdir(String path, String name, int n, int file_n) throws MyException{
        for(int i=1;i<=n;i++){
            if(!mkdir(path,name+"_"+ i ))
                return false;
            addFile_n(getFullPath(path+File.separator+name+"_"+i),file_n);
        }
        return true;
    }

    @Override
    public boolean mkdir(String name) throws MyException {
        return mkdir("", name);
    }

    @Override
    public boolean mkdir(List<String> names) throws MyException {
        return mkdir("", names);
    }

    @Override
    public boolean mkdir(String name, int n) throws MyException {
        return mkdir("", name, n,false);
    }

    @Override
    public List<MyFile> searchAll(String path) throws MyException {
        List<MyFile> listFile = new ArrayList<>(searchDir(path));
        listFile.addAll(searchSubDir(path));
        return listFile;
    }

    @Override
    public List<MyFile> filterByExt(String ext) throws MyException {
        return filterByExt(rootPath, ext);
    }

    // ako ne sadrzi barem jedno od imena iz liste, vraca false
    @Override
    public boolean existListOfName(String path, List<String> names) throws MyException {
        for(String name:names){
            if(!existName(path, name))
                return false;
        }
        return false;
    }

    protected abstract String getFullPath(String path) throws MyException;

    private Comparator<MyFile> getComparator(Metadata metadata) throws MyException{
        return (o1, o2) -> switch (metadata) {
            case FULL_NAME -> o1.getPath().compareTo(o2.getPath());
            case NAME -> o1.getName().compareTo(o2.getName());
            case EXTENSION -> o1.getExt().compareTo(o2.getExt());
            case SIZE -> Long.compare(o1.getSize(), o2.getSize());
            case DATE_MODIFIED -> o1.getLastModified().compareTo(o2.getLastModified());
            case DATE_CREATED -> o1.getTimeCreated().compareTo(o2.getTimeCreated());
        };
    }

    @Override
    public void sortBy(List<MyFile> files, Metadata metadata) throws MyException {
        files.sort(getComparator(metadata));
    }

    @Override
    public List<String> filterData(List<MyFile> files, List<Metadata> metadata) throws MyException {
        List<String> fil = new ArrayList<>();
        for(MyFile myFile:files){
            StringBuilder str= new StringBuilder("File:");
            for(Metadata m:metadata){
                str.append(" ");
                switch (m){
                    case FULL_NAME:     str.append(myFile.getPath());
                    case NAME:          str.append(myFile.getName());
                    case SIZE:          str.append(myFile.getSize());
                    case DATE_CREATED:  str.append(myFile.getTimeCreated());
                    case DATE_MODIFIED: str.append(myFile.getLastModified());
                    case EXTENSION:     str.append(myFile.getExt());
                }
            }
            fil.add(String.valueOf(str));
        }
        return fil;
    }


}
