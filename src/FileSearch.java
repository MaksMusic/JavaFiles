import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileSearch {
    public static void main(String[] args) {

        File src = new File ("C:\\Users\\maksm\\IdeaProjects\\JavaFiles\\src");
        File file = new File("C:\\Users\\maksm\\IdeaProjects\\JavaFiles\\src\\text.txt");

        System.out.println(Arrays.toString(src.listFiles())); // показать список файлов
        System.out.println(file.isFile());                   //проверить является ли файлом или папкой


        //поиск файла по расширению
        for (File fileStr : src.listFiles()) {
            if (fileStr.getName().endsWith(".txt")){
                System.out.println(fileStr.getName());
            }
        }
    }
}
