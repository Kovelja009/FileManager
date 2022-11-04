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
    boolean mkdir(String path, List<String> names,int file_n);

    /**
     *
     * @param path
     * @param name
     * @param n
     * @param file_n true onda se n odnosi na file_n ako je false name1name2name3
     * @return
     */
    boolean mkdir(String path, String name, int n, boolean file_n);

    // pravi name1name2name3i u sve dodaje file_n
    boolean mkdir(String path, String name, int n, int file_n);

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
