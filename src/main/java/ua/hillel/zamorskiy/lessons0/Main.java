package ua.hillel.zamorskiy.lessons0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название 1 команды");
        String team01=(scanner.nextLine());

        float player01=0;
        System.out.println("Введите значение 1 игрока ");

       if (scanner.hasNextFloat()){
         boolean player1 = scanner.hasNextFloat();}

       else {
           System.out.println("неверно перезапускай");
           System.exit(0);}


           System.out.println("Введите значение 2 игрока");
       scanner.nextLine();

           if (scanner.hasNextFloat()){
               boolean player2 = scanner.hasNextFloat();}
           else {
               System.out.println("неверно перезапускай ");
               System.exit(0);}


        System.out.println("Введите значение 3 игрока");
           scanner.nextLine();
           if (scanner.hasNextFloat()){
               boolean player3=scanner.hasNextFloat();}
        else {
            System.out.println("неверно перезапускай");
            System.exit(0);
        }

           }



    }

