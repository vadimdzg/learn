package org.day_7;

import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        Random r = new Random();
        int s = r.nextInt((100 - 90) + 1) + 90;
        Player player1 = new Player(s);
        Player player2 = new Player(s);
        Player player3 = new Player(s);
        Player player4 = new Player(s);
        Player player5 = new Player(s);
        Player player6 = new Player(s);
        Player.info();
        System.out.println(player1.getStamina());
        while (player1.getStamina() > 0) {
            player1.run();
        }
        Player.info();

    }
}
