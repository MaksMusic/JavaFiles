package FilePathFiles.File;

import java.io.File;
import java.util.Arrays;

public class File_FileSearch {
    public static void main(String[] args){
        //Класс File работа с каталогами

        File fileCategory = new File("C:\\Users\\maksm\\IdeaProjects\\JavaFiles\\src\\FilePathFiles");
        System.out.println(fileCategory.mkdir());

        // создать новый каталог (несколько каталогов)
        File file1 = new File("C:\\Users\\maksm\\IdeaProjects\\JavaFiles\\src\\new\\1\\2\\3\\4\\5");
        System.out.println(file1.mkdir() + " mkdir");     //вернут true если папка создастя

        // создать новый файл
        File fileNew = new File("C:\\Users\\maksm\\IdeaProjects\\JavaFiles\\src\\", "file.txt");
        try {
            System.out.println(fileNew.createNewFile());
        } catch (Exception e) {
            System.out.println("false add file");
        }


        //переименовать файл или категоию
        File file2 = new File("C:\\Users\\maksm\\IdeaProjects\\JavaFiles\\src\\newCategory");
        System.out.println(file1.renameTo(file2) + " rename");


        //ссылка на каталог
        File category = new File("C:\\Users\\maksm\\IdeaProjects\\JavaFiles\\src");
        //ссылка на файл
        File file = new File("C:\\Users\\maksm\\IdeaProjects\\JavaFiles\\src\\text.txt");


        //работа с каталогами
        System.out.println(Arrays.toString(category.list()));       // возвращает массив файлов и подкаталогов, типа String
        System.out.println(Arrays.toString(category.listFiles())); // возвращает массив файлов и подкаталогов, типа File

        //проверки файлов или катлогов
        System.out.println(fileNew.exists() + " exist");      //проверить есть ли файл или папка
        System.out.println(file.isFile());                   //проверить является ли файлом или папкой
        System.out.println(file.isDirectory());             //проверить является ли папкой или папкой
        System.out.println(file.isHidden());                //проверить является ли файл скрытым

        // данные о каталогах и файлах
        System.out.println(file.getName());               //название файла и его тип
        System.out.println(file.getAbsolutePath());       //полный путь к  файлу
        System.out.println(file.getParent());             // полный путь папки где находится папка или файл
        System.out.println(file.lastModified());          // возвращает время последнего изменения файла или каталога
        System.out.println(file.length());                //возвращает размер файла в байтах


        File fileThis = new File("C:\\Users\\maksm\\IdeaProjects\\JavaFiles\\src\\1.png");
        searchFileType(category);
        System.out.println("-------------");
        listFilePrint(fileThis.getParentFile());
    }


    //поиск файла по расширению
    public static void searchFileType(File category) {
        for (File fileStr : category.listFiles()) {
            if ((fileStr != null) && (fileStr.getName().endsWith(".txt"))) {
                System.out.println(fileStr.getName());
            }
        }

    }

    //показать все файлы которые находятся с эти файлом в каталоге
    public static void listFilePrint(File files) {
        for (File file : files.listFiles()) {
            System.out.println(file.getName());
        }
    }
}
