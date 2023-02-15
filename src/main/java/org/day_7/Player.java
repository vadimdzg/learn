package org.day_7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers += 1;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
    public void run(){
        this.stamina -= 1;
        if(this.stamina <= 0) {
            countPlayers -= 1;
        }
    }
    public static void info(){
        if(countPlayers < 6){
            System.out.println("Команды неполные. На поле есть еще " + (6 - countPlayers) + " свободных мест");
        }
        else {
            System.out.println("Нет свободных мест.");
        }
    }
}
