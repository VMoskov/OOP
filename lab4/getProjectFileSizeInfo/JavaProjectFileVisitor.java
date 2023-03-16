import java.io.IOException;
import java.util.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


class JavaProjectFileVisitor extends SimpleFileVisitor<Path>{
    Map<String, Long> paths = new LinkedHashMap<>();
    Long size = (long) 0;
    Set<String> extensionFilter;


    public JavaProjectFileVisitor(Set<String> extensionFilter) {
        this.extensionFilter = extensionFilter;
    }

    public Map<String, Long> getProjectFileSizeInfo() {
        return paths;
    }

    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (!attrs.isDirectory()) {
            String filename = file.getFileName().toString();
            int index = filename.lastIndexOf('.');
            if (index!=-1) {
                String extension = filename.substring(index);
                Path pathToFile = file.getParent().resolve(filename);

                if (paths.containsKey(extension) && extensionFilter.contains(extension)) {
                    size = paths.get(extension);
                    size += (long) Files.size(pathToFile);
                    paths.put(extension, size);
                } else if (extensionFilter.contains(extension)){
                    size = (long) Files.size(pathToFile);
                    paths.put(extension, size);
                }

            }
        }
        return FileVisitResult.CONTINUE;
    }


}