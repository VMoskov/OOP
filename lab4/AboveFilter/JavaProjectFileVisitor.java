import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;
import java.util.Set;

class JavaProjectFileVisitor extends SimpleFileVisitor<Path> {

    private int fileSizeFilter;
    private int dirSizeFilter;
    private Set<String> files;
    private Set<String> folders;

    public JavaProjectFileVisitor(int fileSizeFilter, int dirSizeFilter) {
        this.fileSizeFilter = fileSizeFilter;
        this.dirSizeFilter = dirSizeFilter;
        this.files = new HashSet<String>();
        this.folders = new HashSet<String>();
    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
        var file = path.toFile();
        if (file.getName().length() > fileSizeFilter) {
            files.add(file.getName());
        }

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes attrs) throws IOException {
        var file = path.toFile();
        if (file.getName().length() > dirSizeFilter) {
            folders.add(file.getName());
        }
        return FileVisitResult.CONTINUE;
    }

    public Set<String> getFilesAboveFilter() {
        return files;
    }

    public Set<String> getDirsAboveFilter() {
        return folders;
    }
}