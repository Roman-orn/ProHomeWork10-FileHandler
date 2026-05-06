package app;

public class Main {

    private static final String BASE_PATH = "files/";

    static void main(String[] args) {

        String fileName = "myFile.txt";
        String fileContent = "My very important information.";
        String path = BASE_PATH + fileName;

        FileHandler handler = new FileHandler();
        String result = handler.writeFile(path, fileContent);
        String content = handler.readFile(path);

        getOutput("RESULT: " + result);
        getOutput("FILE CONTENT: " + content);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
