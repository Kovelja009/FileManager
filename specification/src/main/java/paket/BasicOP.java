package paket;

import java.util.List;

public interface BasicOP{
    boolean mkdir(String path, String name);
    boolean mkdir(String path, List<String> names);
    boolean mkdir(String path, String name, int n);
    boolean mkdir (String name);
    boolean mkdir(List<String> names);
    boolean mkdir(String name, int n);
    boolean delete(String path);
    boolean move(String oldPath, String newPath);
    boolean download(String item, String destination);
    boolean rename(String path, String newName);
}
