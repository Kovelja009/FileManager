package paket;

import java.io.IOException;

public interface Config {
    public boolean createRoot(String path, String name) throws IOException;
    public boolean createRoot(String path,String name, Configuration configuration) throws IOException;
    public void setSize(long size);
    public void addExtension(String extension);
    public void setFile_n(int maxNumber);
    // u implementaciji da sacuva u txt
    public void saveConfig(String path);

}
