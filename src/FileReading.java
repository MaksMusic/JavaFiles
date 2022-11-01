import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReading {
    public static void main1(String[] args) throws Exception {

        //прочитать файл
        //найти файл
        FileReader fileReader = new FileReader("C:\\Users\\maksm\\IdeaProjects\\JavaFiles\\src\\text.txt");

        // в с принимаем каждый символ из файла в формате числа из таблицы юникод
        //если нет символа вернет -1
        int c;

        while((c = fileReader.read()) != -1) {
            System.out.print((char)c);
        }
    }


    public static void main(String[] args) throws IOException{
        fileReaderaddArray();
    }

    public static  void fileReaderaddArray() throws IOException {

        char [] box = new char[25];
        FileReader fileReader = new FileReader("C:\\Users\\maksm\\IdeaProjects\\JavaFiles\\src\\text.txt");
        int c;

        while ((c = fileReader.read(box)) > 0){
            if(c < 25){
                box = Arrays.copyOf(box,c);

            }
        }

        System.out.println(Arrays.toString(box));
    }
}

