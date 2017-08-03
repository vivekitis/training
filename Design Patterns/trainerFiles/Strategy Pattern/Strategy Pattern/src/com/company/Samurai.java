package com.company;

/**
 * Created by darshal.s on 7/17/2017.
 */
public class Samurai {
    private AttackStrategy attackStrategy;

    public Samurai() {
        this.attackStrategy = new PunchAttack();
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public int attack() {
        return attackStrategy.attack();
    }

    public void jump() {
        System.out.println("***jump***");
    }

    //other samurai abilities/behaviours
}
