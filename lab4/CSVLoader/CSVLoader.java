class CSVLoader {
    public static CSVData loadCSVFile(String path) throws java.io.FileNotFoundException, IndexOutOfBoundsException {
        java.io.File file = new java.io.File(path);
        if(!file.exists()) return new CSVData();

        java.util.Scanner reader = new java.util.Scanner(file);

        var data = new CSVData();

        String lineString = reader.nextLine();
        String[] headers = lineString.split(", ");
        int originalLineLength = headers.length;
        data.addHeaders(Arrays.asList(headers));

        CSVLine line;
        String[] lineSplit;
        while (reader.hasNextLine()) {
            lineString = reader.nextLine();
            lineSplit = lineString.split(", ");

            if (lineSplit.length > originalLineLength) {
                reader.close();
                throw new IndexOutOfBoundsException();
            }

            line = new CSVLine();

            for (int i = 0; i < originalLineLength &&  i < lineSplit.length; i++) {
                line.addElement(headers[i], lineSplit[i]);
            }

            data.addLine(line);
        }

        reader.close();

        return data;
    }
}