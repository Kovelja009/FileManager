package Data;

import lombok.Getter;

import java.util.Date;



@Getter
/**
 *
 */
public class MyFile {
    private String path;
    private String name;
    private long size;
    private Date lastModified;
    private Date timeCreated;
    private String ext;


    public MyFile(String path, String name, long size, Date lastModified, Date timeCreated, String ext) {
        this.path = path;
        this.name = name;
        this.size = size;
        this.lastModified = lastModified;
        this.timeCreated = timeCreated;
        this.ext = ext;
    }
}
