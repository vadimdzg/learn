package org.day_11;

public class Task_2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
        System.out.println(paladin);
        paladin.physicalAttack(magician);
        System.out.println(magician);
        shaman.healTeammate(magician);
        System.out.println(magician);
        magician.magicalAttack(paladin);
        System.out.println(paladin);
        shaman.physicalAttack(warrior);
        System.out.println(warrior);
        paladin.healHimself();
        System.out.println(paladin);
        warrior.physicalAttack(magician);
        System.out.println(magician);
        warrior.physicalAttack(magician);
        System.out.println(magician);
        warrior.physicalAttack(magician);
        System.out.println(magician);
        warrior.physicalAttack(magician);
        System.out.println(magician);
        warrior.physicalAttack(magician);
        System.out.println(magician);
    }
}
