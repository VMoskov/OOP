class JavaProjectFileVisitor extends SimpleFileVisitor<Path> {

    // public static void main(String[] args) {
    // Set<String> s = new HashSet<>();

    // s.add(".txt");
    // s.add(".java");
    // s.add(".class");

    // JavaProjectFileVisitor visitor = new JavaProjectFileVisitor(s);
    // File f = new
    // File("/Users/nitkonitkic/Documents/oop-fer/predavanje_2/artifactId/src/main/java/fer2/folder1");

    // try {
    // Files.walkFileTree(f.toPath(), visitor);
    // } catch (Exception e) {
    // }

    // Map<String, Integer> map = visitor.getProjectFileOcuranceInfo();
    // for (String key : map.keySet())
    // System.out.println("Key: " + key + " - " + map.get(key));
    // }

    Map<String, Integer> s;

    public JavaProjectFileVisitor(Set<String> extensionFilter) {
        s = new HashMap<String, Integer>();
        for (String i : extensionFilter) {
            s.put(i, 0);
        }
    };

    public Map<String, Integer> getProjectFileOcuranceInfo() {
        return s;
    };

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        String ext = "." + file.getFileName().toString().substring(file.getFileName().toString().lastIndexOf(".") + 1);

        System.out.println(ext);

        if (s.containsKey(ext))
            s.put(ext, s.get(ext) + 1);

        return FileVisitResult.CONTINUE;
    }
}