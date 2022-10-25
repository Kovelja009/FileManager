package paket;

import java.util.Date;
import java.util.List;

public interface Search {
    List<String> searchDir(String path);
    List<String> searchSubDir(String path);
    List<String> searchAll(String path);
    List<String> filterByExt(String ext);
    List<String> filterByExt(String path, String ext);
    List<String> searchSubstring(String substr);
    boolean existName(String path, String name);
    boolean existListOfName(String path, List<String> names);
    List<String> getParentPath(String name);
    List<String> sortBy(List<String> paths, Metadata metadata);
    List<String> filterData(List<String> paths, List<Metadata> metadata);
//    modified false -> znaci da je created true
    List<String> filterByPeriod(String path, Date StartDate, Date EndDate, boolean modified);

}
