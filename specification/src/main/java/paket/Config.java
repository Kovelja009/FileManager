package paket;

import java.io.IOException;

public interface Config {
     boolean createRoot(String path, String name) throws IOException;
     boolean createRoot(String path,String name, Configuration configuration) throws IOException;
     void setSize(long size);
     void addExtension(String extension);
     void setFile_n(int maxNumber);
    // u implementaciji da sacuva u json
     void saveConfig(String path);

}
