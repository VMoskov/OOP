import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class JavaProjectFileVisitor extends SimpleFileVisitor<Path> {

    Map<String, Set<Path>> mapa = new LinkedHashMap<>();

    public Map<String, Set<Path>> getProjectPathsPerExtension() {
        return mapa;
    }

    public FileVisitResult visitFile(Path file, BasicFileAttributes atributi) {

        if (!atributi.isDirectory()) {
            String fileName = file.getFileName().toString();
            int ind = fileName.lastIndexOf('.');
            if (ind != -1) {
                String ext = fileName.substring(ind);
                Set<Path> pom = new TreeSet<>();
                if (!mapa.containsKey(ext)) {
                    Path fileExtended = file.getParent().resolve(fileName);
                    pom.add(fileExtended);
                } else {
                    Path fileExtended = file.getParent().resolve(fileName);
                    pom = mapa.get(ext);
                    pom.add(fileExtended);
                }
                mapa.put(ext, pom);
            }
        }
        return FileVisitResult.CONTINUE;
    }

}