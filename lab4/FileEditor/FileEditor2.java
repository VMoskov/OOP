class FileEditor {
    /**
     * Reads input file encoded in UTF-8, process content and writes it to output file.
     * @param inputFile input file
     * @param outputFile output file
     * @throws IOException
     */
    public static void processFile(Path inputFile, Path outputFile) throws IOException{
        StringBuilder text = new StringBuilder();
        for(String line : Files.readAllLines(inputFile)){
            text.append(line).append("\r\n");
        }
        String output = text.toString();

        try(BufferedWriter writer = Files.newBufferedWriter(outputFile)){
            writer.write(output);
        }
        catch (Exception e){
            throw new FileSystemException("aaaaa");
        }

    }
}