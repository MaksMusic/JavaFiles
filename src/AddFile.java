import java.io.File;

public class AddFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\maksm\\IdeaProjects\\JavaFiles");
        String stokaOnline = "Hello";
        stokaOnline = stokaOnline.substring(0, stokaOnline.length() - 1);
        System.out.println(stokaOnline);


    }
}
