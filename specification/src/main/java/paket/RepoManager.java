package paket;

public class RepoManager {
    private static FileManager fileManager;

    public static void registerManager(FileManager fileManager){
        RepoManager.fileManager=fileManager;
    }
}
