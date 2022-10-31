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
     * make new directory with name on root
     * @param name
     * @return
     */
    boolean mkdir (String name);

    /**
     * make new directories with names on root
     * @param names
     * @return
     */
    boolean mkdir(List<String> names);

    /**
     * make n new directories with name formated "name i" i goes from 1 to n on root
     * @param name
     * @param n
     * @return
     */
    boolean mkdir(String name, int n);

    /**
     * delete file or directory
     * @param path
     * @return
     */
    boolean delete(String path);

    /**
     * moving file or directory from oldPath to newPath
     * @param oldPath
     * @param newPath
     * @return
     */
    boolean move(String oldPath, String newPath);

    /**
     *
     * @param item path of item for downloading
     * @param destination directory path in local repository
     * @return true, if file is dowloaded, false if not
     */
    boolean download(String item, String destination);


    /**
     *
     * @param item path of item for uploading
     * @param destination directory path in local repository
     * @return true, if file is uploaded, false if not
     */
    boolean upload(String item, String destination);

    /**
     *
     * @param path file or directory path
     * @param newName new name for file or directory
     * @return true, if file is renamed
     */
    boolean rename(String path, String newName);
}
