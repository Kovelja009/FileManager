package paket;

import Data.MyFile;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

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
     * @return all files in every subdirectory of a directory
     */
    List<MyFile> searchSubDir(String path);

    /**
     *
     * @param path directory path
     * @return all files in directory including every subdirectory
     */
    List<MyFile> searchAll(String path);

    /**
     * returns all the files with certain extension
     * @param ext extension for filter
     * @return files with extension in a whole storage
     */
    List<MyFile> filterByExt(String ext);

    /**
     * returns all the files with certain extension in a certain directory
     * @param path directory path
     * @param ext extension for filter
     * @return files with extension in directory
     */
    List<MyFile> filterByExt(String path, String ext);

    /**
     * returns files which contain given substring in a name
     * @param substr part of name of file
     * @return files which contains substring in a name
     */
    List<MyFile> searchSubstring(String substr);

    /**
     * returns whether directory contains file with a certain name or not
     * @param path directory path
     * @param name file name
     * @return does directory contain file with name
     */
    boolean existName(String path, String name);

    /**
     * returns whether directory contains files with a certain names or not
     * @param path directory path
     * @param names list of names for files
     * @return does directory contain all files with names
     */
    boolean existListOfName(String path, List<String> names);

    /**
     * returns list of directories with names file
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
    /**
     *
     * @param files files for filter
     * @param metadata list of metadata which included in print
     * @return shows only data listed in metadata for files
     */
    List<String> filterData(List<MyFile> files, Set<Metadata> metadata);


    /**
     *
     * @param path directory path
     * @param StartDate can be created or modified date
     * @param EndDate can be created or modified date
     * @param modified created(false) or modified(true)
     * @return files modified or created in period in directory
     */
    List<MyFile> filterByPeriod(String path, LocalDateTime StartDate, LocalDateTime EndDate, boolean modified);

}
