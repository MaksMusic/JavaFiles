package MovieTicket;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Menu {
    private int balanc = 5000;
    private Scanner scanner = new Scanner(System.in);
    ArrayList<Ticket> ticket = new ArrayList();

    public void runTerminal() {
        System.out.println("1 . посмотреть мои билеты");
        System.out.println("2 . посмотреть список фильмов");
        String answer = scanner.nextLine();
        switch (answer) {
            case "1" -> {lockTicket();}
            case "2" -> {listMove();}
            default -> {runTerminal();}
        }

    }

    private void listMove() {
        Movie movie[]  = Movie.values();
        for (Movie movie1 : movie) {
            System.out.println(movie1.name()+ "(цена днем - " + movie1.getPriceDay() + " coin )"  + "(цена вечер " + movie1.getPriceEvening()+ "coin)");
        }
        shopTicket(movie);

    }

    private void shopTicket(Movie movie [] ) {
        System.out.println("Введите название фильма");
        String nameMovie = scanner.nextLine();
        for (Movie movie1 : movie) {
            if (nameMovie.equals(movie1)) {
                System.out.println("Выберите время");
                System.out.println("1 день - " + movie1.getPriceDay() + " coin");
                System.out.println("2 вечер - " + movie1.getPriceEvening() + " coin");
                System.out.println("введите цисло");

            }
        }
    }

    private void  lockTicket(){
        for (Ticket ticket1 : ticket) {
            System.out.println("Билет номер " + ticket1.id);
            System.out.println("Фильм: " + ticket1.moveName );
            System.out.println("Место: " + ticket1.placeClients );
            System.out.println("--------------------------------");
        }
    }

    private class Ticket{
       private String moveName;

       private int id;
       private int price;
       private int placeClients;
       private static int [] place = new int[30];
       private static int idStatic = 1;

        public Ticket(String moveName, int price) {
            this.price = price;
            this.moveName = moveName;
            this.id = Ticket.idStatic++;
            this.placeClients = generatePlase();


        }

        private int generatePlase(){
            for (int i = 0; i < place.length; i++) {
                if(place[i] != 0){
                    place[i] = 1;
                    return place[i];
                }
            }
            return -1;
        }



    }




}
