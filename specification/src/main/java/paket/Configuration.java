package paket;

import lombok.Getter;
import lombok.Setter;

import java.io.File;

import java.util.*;


@Getter
@Setter
public class Configuration {
    /**
     * file n je path i num path je apsolutna putanja
     */
    private long size;
     // u svakom direktorijumu maks broj fajlova
    private Set<String> excludedExt;
    private Map<String,Integer> file_n;

    public Configuration(){
        excludedExt = new HashSet<>();
        size = 1500000000; // 1.5 GB
        file_n = new HashMap<>();
    }

    public Configuration(long size, Map<String,Integer>  file_n, Set<String> excludedExt) {
        this.size = size;
        this.file_n = file_n;
        this.excludedExt = excludedExt;
    }

}
