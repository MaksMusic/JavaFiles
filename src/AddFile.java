import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;

public class AddFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\maksm\\IdeaProjects\\JavaFiles");

        try{
            FileWriter writer = new FileWriter("listUser",false);    //создать новый файл
            writer.write("name:Tomas , age:21 ");    //добавить строку
            writer.flush();         // добавить все изменения в файл

            writer.append('=');     //добавить сивол на ту же строку
            writer.flush();         // добавить все изменения в файл

        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
