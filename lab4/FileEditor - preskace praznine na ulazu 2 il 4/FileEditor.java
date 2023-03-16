import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

class FileEditor {
    public static void processFile(Path inputFile,Path outputFile) throws IOException {
        Scanner sc=new Scanner(inputFile);
        PrintWriter pw=new PrintWriter(new FileWriter(outputFile.toFile()),true);
        while(sc.hasNext()) {
            String line=sc.nextLine();
            if(line.startsWith("    ")) {
                pw.println("\t\t"+line.substring(4));
            }
            else if(line.startsWith("  ")) {
                pw.println("\t"+line.substring(2));
            }
            else {
                pw.println(line);
            }
        }
    }
}