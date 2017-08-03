package com.company;

public class Main {

    public static void main(String[] args) {
        Samurai jack = new Samurai();

        jack.setAttackStrategy(new SwordAttack());

        jack.attack();
        jack.attack();
        int damage = jack.attack();
        System.out.println("Jack inflicts " + damage + " damage per hit!");
    }
}
