package paket;


public interface Config {
    /**
     *
     * @param path full path
     * @param name name of the root
     * @return whether root was created or not
     */
     boolean createRoot(String path, String name);
    /**
     *
     * @param path full path
     * @param name name of the root
     * @param file_n number of files constraint
     * @return whether root was created or not
     */
     boolean createRoot(String path, String name, int file_n);

    /**
     *
     * @param path full path
     * @param name name of the root
     * @param configuration configuration with constraints
     * @return whether root was created or not
     */
     boolean createRoot(String path,String name, Configuration configuration);

    /**
     *
     * @param path full path
     * @param name name of the root
     * @param configuration configuration with constraints
     * @param file_n number of files constraint
     * @return whether root was created or not
     */
    boolean createRoot(String path, String name, Configuration configuration, int file_n);

    /**
     * configures how many files certain directory will have
     * @param path
     * @param num
     */
     void addFile_n(String path, Integer num);

    /**
     *  saves configuration in the root of the storage in json format
     */
     void saveConfig();

}
