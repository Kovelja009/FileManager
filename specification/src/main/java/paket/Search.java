package paket;

import Data.MyFile;

import java.util.Date;
import java.util.List;

public interface Search {
    List<MyFile> searchDir(String path);
    List<MyFile> searchSubDir(String path);
    List<MyFile> searchAll(String path);
    List<MyFile> filterByExt(String ext);
    List<MyFile> filterByExt(String path, String ext);
    List<MyFile> searchSubstring(String substr);
    boolean existName(String path, String name);
    boolean existListOfName(String path, List<String> names);
    List<String> getParentPath(String name);
    List<MyFile> sortBy(List<String> paths, Metadata metadata);
    List<String> filterData(List<String> paths, List<Metadata> metadata);
//    modified false -> znaci da je createdDate true
    List<MyFile> filterByPeriod(String path, Date StartDate, Date EndDate, boolean modified);

}
