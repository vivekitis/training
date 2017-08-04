package com.company;

/**
 * Created by darshal.s on 7/17/2017.
 */
public class LaserCannonAttack implements AttackStrategy{
    @Override
    public int attack() {
        System.out.println("***pew***");
        return 1000;
    }
}
