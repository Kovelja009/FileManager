package Data;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Date;



@Getter
/**
 *
 */
public class MyFile {
    private String path;
    private String name;
    private long size;
    private LocalDateTime lastModified;
    private LocalDateTime timeCreated;
    private String ext;


    public MyFile(String path, String name, long size, LocalDateTime lastModified, LocalDateTime timeCreated, String ext) {
        this.path = path;
        this.name = name;
        this.size = size;
        this.lastModified = lastModified;
        this.timeCreated = timeCreated;
        this.ext = ext;
    }
}
