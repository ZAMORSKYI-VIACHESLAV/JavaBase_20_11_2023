package ua.hillel.zamorskiy.lessons7;

import javax.management.loading.PrivateClassLoader;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        countTeam("Manchester.United");
        countTeam("Dynamo.Kiev");
    }

    private static void countTeam(String teamName) {
        int[] team = new int[25];
        int sumAges = 0;
        System.out.println("Возраст игроков команды " + teamName + ": ");
        for (int i = 0; i < team.length; i++) {
            team[i] = 18 + (int) (Math.random() * 23);
            sumAges += team[i];
            if (i == team.length - 1) {
                System.out.print(team[i] + "");
            } else  {
                System.out.print(team[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("Средний возраст игроков команды " + teamName + ": " + sumAges / team.length);
    }









    }