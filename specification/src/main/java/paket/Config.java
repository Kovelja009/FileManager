package paket;

import Data.MyException;

import java.io.IOException;

public interface Config {
    /**
     *
     * @param path
     * @param name
     * @return
     * @throws IOException
     */
     boolean createRoot(String path, String name) throws MyException;
     boolean createRoot(String path, String name, int file_n) throws MyException;

    /**
     *
     * @param path
     * @param name
     * @param configuration
     * @return
     * @throws IOException
     */
     boolean createRoot(String path,String name, Configuration configuration) throws MyException;

    boolean createRoot(String path, String name, Configuration configuration, int file_n) throws MyException;

    /**
     *
     * @param path
     * @param num
     */
     void addFile_n(String path, Integer num) throws MyException;

    /**
     *
     */
    // u implementaciji da sacuva u json
     void saveConfig() throws MyException;

}
