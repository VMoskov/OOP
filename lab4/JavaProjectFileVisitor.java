package samostalnilabos4_3;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class JavaProjectFileVisitor extends SimpleFileVisitor<Path>{

    Set<String> extensionFilter;
    Map<String, Set<Path>> p= new LinkedHashMap<>();

    public JavaProjectFileVisitor(Set<String> extensionFilter) {
        this.extensionFilter=extensionFilter;
    }


    public Map<String, Set<Path>> getProjectPathsPerExtension() {
        return p;
    }

    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (!attrs.isDirectory()) {
            String fname=file.getFileName().toString();
            int i=fname.lastIndexOf('.');
            if (i>0) {
                String nastavak=fname.substring(i);
                if (!extensionFilter.contains(nastavak)) {
                    Set <Path> ujme;
                    if (!p.containsKey(nastavak)) {
                        ujme=new TreeSet<>();
                        Path ptf=file.getParent().resolve(fname);
                        ujme.add(ptf);
                    } else {
                        Path ptf=file.getParent().resolve(fname);
                        ujme=p.get(nastavak);
                        ujme.add(ptf);
                    }
                    p.put(nastavak, ujme);
                }
            }
        }
        return FileVisitResult.CONTINUE;
    }
}