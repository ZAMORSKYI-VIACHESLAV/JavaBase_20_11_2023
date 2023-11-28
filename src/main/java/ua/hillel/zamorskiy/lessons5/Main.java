package ua.hillel.zamorskiy.lessons5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название 1 команды");
        String intPlayer=(scanner.nextLine());

int intPlayer1=0;
        System.out.println("Введите значение для 1 игрока ");

        if (scanner.hasNextInt()) {
            intPlayer1= scanner.nextInt();
        }
        else {
            System.out.println("Неверно , перезапусти");
            System.exit(0);
        }
        int intPlayer2=0;
        System.out.println("Введите значение для 2 игрока ");

        if (scanner.hasNextInt()) {
            intPlayer2= scanner.nextInt();
        }
        else {
            System.out.println("Неверно , перезапусти");
            System.exit(0);
        }
        int intPlayer3=0;
        System.out.println("Введите значение для 3  игрока ");

        if (scanner.hasNextInt()) {
            intPlayer3= scanner.nextInt();
        }
        else {
            System.out.println("Неверно , перезапусти");
            System.exit(0);
        }
        int intPlayer4=0;
        System.out.println("Введите значение для 4 игрока ");

        if (scanner.hasNextInt()) {
            intPlayer4= scanner.nextInt();
        }
        else {
            System.out.println("Неверно , перезапусти");
            System.exit(0);
        }
        int intPlayer5=0;
        System.out.println("Введите значение для 5 игрока ");

        if (scanner.hasNextInt()) {
            intPlayer5= scanner.nextInt();
        }
        else {
            System.out.println("Неверно , перезапусти");
            System.exit(0);
        }
        int team1 =((intPlayer1+intPlayer2+intPlayer4+intPlayer3+intPlayer5)/5);
        System.out.println(team1);






        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Введите название 2 команды");
        String Player =(scanner1.nextLine());



        int intPlayer1a1=0;
        System.out.println("Введите значение для 1 игрока ");


        if (scanner.hasNextInt()) {
            intPlayer1a1= scanner.nextInt();
        }
        else {
            System.out.println("Неверно , перезапусти");
            System.exit(0);
        }
        int intPlayer2a=0;
        System.out.println("Введите значение для 2 игрока ");

        if (scanner.hasNextInt()) {
            intPlayer2a= scanner.nextInt();
        }
        else {
            System.out.println("Неверно , перезапусти");
            System.exit(0);
        }
        int intPlayer3a=0;
        System.out.println("Введите значение для 3  игрока ");

        if (scanner.hasNextInt()) {
            intPlayer3a= scanner.nextInt();
        }
        else {
            System.out.println("Неверно , перезапусти");
            System.exit(0);
        }
        int intPlayer4a=0;
        System.out.println("Введите значение для 4 игрока ");

        if (scanner.hasNextInt()) {
            intPlayer4a= scanner.nextInt();
        }
        else {
            System.out.println("Неверно , перезапусти");
            System.exit(0);
        }
        int intPlayer5a=0;
        System.out.println("Введите значение для 5 игрока ");

        if (scanner.hasNextInt()) {
            intPlayer5a= scanner.nextInt();
        }
        else {
            System.out.println("Неверно , перезапусти");
            System.exit(0);
        }
        int team2 =((intPlayer1a1+intPlayer2a+intPlayer4a+intPlayer3a+intPlayer5a)/5);
        System.out.println(team2);



            if (team1 < team2)
            {
                 System.out.println("Одержала победу команда" + team2+ Player);
            }
            if (team1 > team2) {
                System.out.println("Одержала победу команда" + team1+ intPlayer);
            }
        }







    }



















































