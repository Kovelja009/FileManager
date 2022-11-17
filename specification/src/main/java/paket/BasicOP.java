package paket;

import java.util.List;

public interface BasicOP{
    /**
     * creates directory
     * @param path relative path
     * @param name name of directory
     * @return whether it was created or not
     */
    boolean mkdir(String path, String name);

    /**
     * creates directories
     * @param path relative path
     * @param names list of names
     * @return whether it was created or not
     */
    boolean mkdir(String path, List<String> names);
    boolean mkdir(String path, List<String> names,int file_n);

    /**
     *
     * @param path relative path
     * @param name name of directory
     * @param n number of filse
     * @param file_n if true then its used as dir no constraint, else as no of folders to be created
     * @return whether it was created or not
     */
    boolean mkdir(String path, String name, int n, boolean file_n);

    /**
     *
     * @param path relative path
     * @param name name of directory
     * @param n number of filse
     * @param file_n dir no constraint
     * @return whether it was created or not
     */
    boolean mkdir(String path, String name, int n, int file_n);

    /**
     * make new directory with name on root
     * @param name name of directory
     * @return whether it was created or not
     */
    boolean mkdir (String name);

    /**
     * make new directories with names on root
     * @param names List of names
     * @return whether it was created or not
     */
    boolean mkdir(List<String> names);

    /**
     * make n new directories with name formated "name_i", i goes from 1 to n on root
     * @param name name of directory
     * @param n no of directories
     * @return whether it was created or not
     */
    boolean mkdir(String name, int n);

    /**
     * delete file or directory
     * @param path relative path
     * @return
     */
    boolean delete(String path);

    /**
     * moving file or directory from oldPath to newPath
     * @param oldPath relative path
     * @param newPath destination of the directory to be placed
     * @return whether it was moved or not
     */
    boolean move(String oldPath, String newPath);

    /**
     *  downloads file on the local machine
     * @param item path of item for downloading
     * @param destination directory path in local repository
     * @return true, if file is dowloaded, false if not
     */
    boolean download(String item, String destination);


    /**
     * uploads file from the local machine
     * @param item path of item for uploading
     * @param destination directory path in repository relative
     * @return true, if file is uploaded, false if not
     */
    boolean upload(String item, String destination);

    /**
     * renames file/directory
     * @param path file or directory path
     * @param newName new name for file or directory
     * @return true, if file is renamed
     */
    boolean rename(String path, String newName);
}
