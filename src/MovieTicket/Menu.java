package MovieTicket;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Menu {
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
        Movie movie  = Movie.Boom;
       for (Movie movie1:Movie.values()){
           System.out.println(movie1);
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
