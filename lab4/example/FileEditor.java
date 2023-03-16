import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

class FileEditor{
    Path inputFile;
    Path outputFile;
    public FileEditor(Path inputFile, Path outputFile) {
        this.inputFile=inputFile;
        this.outputFile=outputFile;
    }
    public static void processFile(Path inputFile, Path outputFile) throws IOException {


        PrintWriter writer = new PrintWriter(outputFile.toFile());
        try{
            Scanner inputStream = new Scanner(inputFile.toFile());
            String data="";
            while(inputStream.hasNext()) {
                data += inputStream.nextLine();
                data += "\n";
            }

            String pom = data.replace("\t", ",");
            pom = pom.strip();
            writer.print(pom);
            inputStream.close();
            writer.close();
        }
        catch(FileNotFoundException e){
        }
    }
}