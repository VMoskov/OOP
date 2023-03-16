class JavaProjectFileVisitor extends SimpleFileVisitor<Path> {
    Map<String, Integer> filesCount = new HashMap<>();
    Set<String> extensionFilter;

    public JavaProjectFileVisitor(Set<String> extensionFilter) {
        this.extensionFilter = extensionFilter;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (!attrs.isDirectory()) {
            String extension = file.getFileName().toString().substring(file.getFileName().toString().lastIndexOf('.'));

            if (extensionFilter.contains(extension)) {
                var count = filesCount.getOrDefault(extension, 0);

                count += 1;

                filesCount.put(extension, count);
            }

        }

        return super.visitFile(file, attrs);
    }

    public Map<String, Integer> getNumFilesPerExtension() {
        return filesCount;
    }
}