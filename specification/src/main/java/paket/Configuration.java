package paket;

import lombok.Getter;
import lombok.Setter;

import java.io.File;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class Configuration {
    /**
     *
     */
    private long size;
    private int file_n;
    private List<String> excludedExt;

    public Configuration(){
        excludedExt = new ArrayList<>();
        size = 1500000000; // 1.5 GB
        file_n = 1024;
    }

    public Configuration(long size, int file_n, List<String> excludedExt) {
        this.size = size;
        this.file_n = file_n;
        this.excludedExt = excludedExt;
    }
}
