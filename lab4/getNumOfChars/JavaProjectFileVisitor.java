import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class JavaProjectFileVisitor extends SimpleFileVisitor<Path> {

    int numOfCharsForFiles;
    int numOfCharsForDirs;

    public JavaProjectFileVisitor() {
        this.numOfCharsForFiles = 0;
        this.numOfCharsForDirs = 0;
    }


    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        String filename = dir.getFileName().toString();

        numOfCharsForDirs += filename.length();

        return FileVisitResult.CONTINUE;

    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) {

        String filename = path.getFileName().toString();

        numOfCharsForFiles += filename.length();

        return FileVisitResult.CONTINUE;
    }


    public int getNumOfCharsForFiles() {
        return numOfCharsForFiles;
    }

    public int getNumOfCharsForDirs() {
        return numOfCharsForDirs;
    }
}