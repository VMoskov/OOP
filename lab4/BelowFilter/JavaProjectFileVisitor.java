import java.io.File;
import java.nio.file.Path;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.util.*;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.Path;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Files;
import java.io.File;

class JavaProjectFileVisitor extends SimpleFileVisitor<Path> {

    private int fileSizeFilter;
    private int dirSizeFilter;
    private Set<Path> files;
    private Set<Path> folders;

    public JavaProjectFileVisitor(int fileSizeFilter, int dirSizeFilter) {
        this.fileSizeFilter = fileSizeFilter;
        this.dirSizeFilter = dirSizeFilter;
        this.files = new HashSet<Path>();
        this.folders = new HashSet<Path>();
    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
        var file = path.toFile();
        if (file.getName().length() < fileSizeFilter) {
            files.add(path);
        }

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes attrs) throws IOException {
        var file = path.toFile();
        if (file.getName().length() < dirSizeFilter) {
            folders.add(path);
        }

        return FileVisitResult.CONTINUE;
    }

    public Set<Path> getFilesBelowFilter() {
        return files;
    };

    public Set<Path> getDirsBelowFilter() {
        return folders;
    };
}