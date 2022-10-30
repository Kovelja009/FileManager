package paket;

import Data.MyFile;

import java.util.Date;
import java.util.List;

public interface Search {
    /**
     * list all files in directory
     * @param path directory path
     * @return all files in directory
     */
    List<MyFile> searchDir(String path);

    /**
     *
     * @param path
     * @return all files in every subdirectory of directory
     */
    List<MyFile> searchSubDir(String path);

    /**
     *
     * @param path
     * @return all files in directory including every subdirectory
     */
    List<MyFile> searchAll(String path);

    /**
     *
     * @param ext
     * @return files with extension in whole storage
     */
    List<MyFile> filterByExt(String ext);

    /**
     *
     * @param path
     * @param ext
     * @return files with extension in directory
     */
    List<MyFile> filterByExt(String path, String ext);

    /**
     *
     * @param substr
     * @return files which contains substring in name
     */
    List<MyFile> searchSubstring(String substr);

    /**
     *
     * @param path
     * @param name
     * @return does directory contains file with name
     */
    boolean existName(String path, String name);

    /**
     *
     * @param path
     * @param names
     * @return does directory contains all files with names
     */
    boolean existListOfName(String path, List<String> names);

    /**
     *
     * @param name
     * @return list of paths of directories with named file
     */
    List<String> getParentPath(String name);

    /**
     *
     * @param files
     * @param metadata
     * @return sorted list of files by metadata
     */
    List<MyFile> sortBy(List<MyFile> files, Metadata metadata);

    /**
     *
     * @param files
     * @param metadata
     * @return shows only data listed in metadata for files
     */
    List<String> filterData(List<MyFile> files, List<Metadata> metadata);
//    modified false -> znaci da je createdDate true

    /**
     *
     * @param path directory path
     * @param StartDate
     * @param EndDate
     * @param modified created(true) or modified(false)
     * @return files modified or created in period in directory
     */
    List<MyFile> filterByPeriod(String path, Date StartDate, Date EndDate, boolean modified);

}
