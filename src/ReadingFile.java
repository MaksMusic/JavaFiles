import java.io.FileReader;
import java.util.concurrent.ExecutionException;

public class ReadingFile {
    public static void main(String[] args) throws Exception {
        //найти файл
        FileReader fileReader = new FileReader("C:\\Users\\maksm\\IdeaProjects\\JavaFiles\\src\\text.txt");
        int c;

        // в с принимаем каждый символ из файла в формате числа из таблицы юникод
        //если нет символа вернет -1

        while((c = fileReader.read()) != -1) {
            System.out.print((char)c);
        }
    }
}

