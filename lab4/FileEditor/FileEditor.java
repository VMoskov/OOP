import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class FileEditor {
    public static void processFile(Path inputFile, Path outputFile) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new BufferedInputStream(new FileInputStream(String.valueOf(inputFile.toAbsolutePath()))), StandardCharsets.UTF_8));
        Writer bw = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(String.valueOf(outputFile.toAbsolutePath()))), StandardCharsets.UTF_8));

        String line;
        String edited;
        while (true) {
            line = br.readLine();
            if (line == null) break;

            String edited_line = line.split("// TODO")[0];
            bw.write(edited_line+"\n");
        }

        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        Path inputFile = Path.of("PUTANJA DO FAJLA");
        Path outputFile = Path.of("UTANJA DO FAJLA");

        FileEditor.processFile(inputFile, outputFile);
    }
}