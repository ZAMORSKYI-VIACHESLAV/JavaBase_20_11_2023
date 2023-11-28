package ua.hillel.zamorskiy.lessons6;


import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
//         int nam = (int) (Math.random()*10 );
  //      for (int i = 0; i ==nam; i++) {
   //         int nam2 = 0;
            Scanner scanner = new Scanner(System.in);
        System.out.println("угадай число");
        int nam = 11;
        int nam1 = (int)(Math.random() * nam);
        for (int i = 0; i <3 ; i++) {
            int nam2=scanner.nextInt();
             if (nam2==nam1) {
            System.out.println("вы угадали ");
             break; }


                System.out.println("не повезло , попробуй еще раз");



        }











    }}