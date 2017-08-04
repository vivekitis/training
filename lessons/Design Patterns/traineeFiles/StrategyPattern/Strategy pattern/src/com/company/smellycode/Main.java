package com.company.smellycode;

import com.company.smellycode.Samurai;

public class Main {

    public static void main(String[] args) {
        Samurai jack = new Samurai();

        //jack.setWeapon(Weapon.SWORD);

        jack.attack();
        jack.attack();
        int damage = jack.attack();
        System.out.println("Jack inflicts " + damage + " damage per hit!");
    }
}
