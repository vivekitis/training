package com.company;

/**
 * Created by darshal.s on 7/17/2017.
 */
public class SwordAttack implements AttackStrategy{
    @Override
    public int attack() {
        System.out.println("***slash***");
        return 50;
    }
}
