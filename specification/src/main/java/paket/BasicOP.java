package paket;

import java.util.List;

public interface BasicOP{
    /**
     *
     * @param path
     * @param name
     * @return
     */
    boolean mkdir(String path, String name);

    /**
     *
     * @param path
     * @param names
     * @return
     */
    boolean mkdir(String path, List<String> names);

    /**
     *
     * @param path
     * @param name
     * @param n
     * @return
     */
    boolean mkdir(String path, String name, int n);

    /**
     *
     * @param name
     * @return
     */
    boolean mkdir (String name);

    /**
     *
     * @param names
     * @return
     */
    boolean mkdir(List<String> names);

    /**
     *
     * @param name
     * @param n
     * @return
     */
    boolean mkdir(String name, int n);

    /**
     *
     * @param path
     * @return
     */
    boolean delete(String path);

    /**
     *
     * @param oldPath
     * @param newPath
     * @return
     */
    boolean move(String oldPath, String newPath);

    /**
     *
     * @param item
     * @param destination
     * @return
     */
    boolean download(String item, String destination);

    /**
     *
     * @param path
     * @param newName
     * @return
     */
    boolean rename(String path, String newName);
}
