package paket;

import java.io.IOException;

public interface Config {
    /**
     *
     * @param path
     * @param name
     * @return
     * @throws IOException
     */
     boolean createRoot(String path, String name) throws IOException;

    /**
     *
     * @param path
     * @param name
     * @param configuration
     * @return
     * @throws IOException
     */
     boolean createRoot(String path,String name, Configuration configuration) throws IOException;

    /**
     *
     * @param size
     */
     void setSize(long size);

    /**
     *
     * @param extension
     */
     void addExtension(String extension);

    /**
     *
     * @param maxNumber
     */
     void setFile_n(int maxNumber);

    /**
     *
     * @param path
     */
    // u implementaciji da sacuva u json
     void saveConfig(String path);

}
