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
     boolean createRoot(String path, String name);
     boolean createRoot(String path, String name, int file_n);

    /**
     *
     * @param path
     * @param name
     * @param configuration
     * @return
     * @throws IOException
     */
     boolean createRoot(String path,String name, Configuration configuration);

    boolean createRoot(String path, String name, Configuration configuration, int file_n);

    /**
     *
     * @param path
     * @param num
     */
     void addFile_n(String path, Integer num);

    /**
     *
     */
    // u implementaciji da sacuva u json
     void saveConfig();

}
