package ua.hillel.zamorskiy.lessons5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название команды");
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
        }






































}












