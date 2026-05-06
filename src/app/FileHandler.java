package app;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    public String writeFile(String path, String fileContent) {
        try (FileWriter fw = new FileWriter(path)) {
            fw.write(fileContent);
            return "Success.";
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }

    public String readFile(String path) {
        try (FileReader fr = new FileReader(path)) {
            int sym;
            StringBuilder sb = new StringBuilder();
            while ((sym = fr.read()) != -1) {
                sb.append((char) sym);
            }
            return sb.toString();
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}