package paket;

import Data.MyFile;

import java.time.LocalDateTime;
import java.util.List;

public interface Search {
    /**
     * list all files in directory
     * @param path directory path relative
     * @return all files in directory
     */
    List<MyFile> searchDir(String path);

    /**
     *
     * @param path directory path
     * @return all files in every subdirectory of directory
     */
    List<MyFile> searchSubDir(String path);

    /**
     *
     * @param path directory path
     * @return all files in directory including every subdirectory
     */
    List<MyFile> searchAll(String path);

    /**
     *
     * @param ext extension for filter
     * @return files with extension in whole storage
     */
    List<MyFile> filterByExt(String ext);

    /**
     *
     * @param path directory path
     * @param ext extension for filter
     * @return files with extension in directory
     */
    List<MyFile> filterByExt(String path, String ext);

    /**
     *
     * @param substr part of name of file
     * @return files which contains substring in name
     */
    List<MyFile> searchSubstring(String substr);

    /**
     *
     * @param path directory path
     * @param name file name
     * @return does directory contain file with name
     */
    boolean existName(String path, String name);

    /**
     *
     * @param path directory path
     * @param names list of names for files
     * @return does directory contain all files with names
     */
    boolean existListOfName(String path, List<String> names);

    /**
     *
     * @param name file name
     * @return list of paths of directories with named file
     */
    List<String> getParentPath(String name);

    /**
     *
     * @param files files for sorting
     * @param metadata
     *  sorted list of files by metadata
     */
    void sortBy(List<MyFile> files, Metadata metadata);
 //TODO included in print
    /**
     *
     * @param files files for filter
     * @param metadata list of metadata which included in print
     * @return shows only data listed in metadata for files
     */
    List<String> filterData(List<MyFile> files, List<Metadata> metadata);


    /**
     *
     * @param path directory path
     * @param StartDate
     * @param EndDate
     * @param modified created(true) or modified(false)
     * @return files modified or created in period in directory
     */
    List<MyFile> filterByPeriod(String path, LocalDateTime StartDate, LocalDateTime EndDate, boolean modified);

}
