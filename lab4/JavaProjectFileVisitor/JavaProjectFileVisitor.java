import java.util.HashMap;
import java.util.HashSet;


class JavaProjectFileVisitor extends SimpleFileVisitor<Path> {

    Map<String, Set<String>> niz;

    public JavaProjectFileVisitor(Set<String> extensionFilter) {
        
        niz = new HashMap<String, Set<String>>();
        
        for (String index : extensionFilter) {
            
            niz.put(index, new HashSet<String>());
        
        }
    
    };

    public Map<String, Set<String>> getProjectNamesPerExtension() {
        return niz;
    };

    public FileVisitResult visitFile(Path f, BasicFileAttributes attrs) {
        String van = "." + f.getFileName().toString().substring(f.getFileName().toString().lastIndexOf(".") + 1);

        if (niz.containsKey(van))
            niz.get(van).add(f.getFileName().toString());

        return FileVisitResult.CONTINUE;
    }
}