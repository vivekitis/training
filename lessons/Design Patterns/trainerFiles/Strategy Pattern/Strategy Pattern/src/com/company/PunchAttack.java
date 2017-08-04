package com.company;

/**
 * Created by darshal.s on 7/17/2017.
 */
public class PunchAttack implements AttackStrategy{
    @Override
    public int attack() {
        System.out.println("***dishoom***");
        return 10;
    }
}
