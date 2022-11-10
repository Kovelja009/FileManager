package Data;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Date;



@Getter
/**
 *
 */
public class MyFile{

    private String path; // destinacija sa imenom apsolutna
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

    @Override
    public String toString() {
        return "path='" + path +
                ", name='" + name +
                ", size=" + size +
                ", lastModified=" + lastModified +
                ", timeCreated=" + timeCreated +
                ", ext='" + ext  +
                '\n';
    }
}
