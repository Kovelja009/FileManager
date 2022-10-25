package paket;

public interface Config {
    public boolean createRoot(String path);
    public boolean createRoot(String path, Configuration configuration);
    public void setSize(long size);
    public void addExtension(String extension);
    public void setFile_n(int maxNumber);
    public void saveConfig(String path);

}
