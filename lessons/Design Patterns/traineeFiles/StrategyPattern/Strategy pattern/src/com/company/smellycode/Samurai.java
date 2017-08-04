package com.company.smellycode;

/**
 * Created by darshal.s on 7/17/2017.
 */
public class Samurai {
    Weapon weapon;

    public Samurai() {
        this.weapon = Weapon.FIST;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int attack() {
        switch (this.weapon) {
            case GUN:
                System.out.println("***bang***");
                return 100;
            case FIST:
                System.out.println("***dishoom***");
                return 10;
            case SWORD:
                System.out.println("***slash***");
                return 50;
        }
        return 0;
    }

    public void jump() {
        System.out.println("***jump***");
    }

    //other samurai abilities/behaviours
}
