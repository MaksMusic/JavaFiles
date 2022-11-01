import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
//получить данные из файла и поместить в лист

public class FileParsing {
    public static void main(String[] args) {
        ArrayList<Year>  years = new ArrayList<>(); //куда записать данные
        Path paths = Paths.get("C:\\Users\\maksm\\IdeaProjects\\JavaFiles\\src\\text.txt");
        boolean fileExists =  Files.exists(paths);
        if (fileExists) {
            try {
                List<String> strings = Files.readAllLines(paths); // получить лист из файла (кажда строка - отдельная ячейка)
                for (String string : strings) {
                   final String  [] listElements = string.split(",");
                    Year year = new Year(
                            listElements[0],
                            Integer.parseInt(listElements[1]),
                            Boolean.parseBoolean(listElements[2])
                    );
                    years.add(year);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println("нету файла");
        }


        for (Year year : years) {
            System.out.println(year.nameYear + " " + year.cYear + " " + year.enabledYear);
        }
    }



    static class Year {
        String nameYear;
        int cYear;
        boolean enabledYear;

        public Year(String nameYear, int cYear, boolean enabledYear) {
            this.nameYear = nameYear;
            this.cYear = cYear;
            this.enabledYear = enabledYear;
        }
    }
}

