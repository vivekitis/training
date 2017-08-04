package com.directi.training.Pizza;

/**
 * Created by shyamsunder.a on 7/20/2017.
 */
public class OrderPizza
{
    public static void main(String[] args)
    {
        /*BasePizza basePizza = new BasePizza();
        ThickDough thickDough = new ThickDough(basePizza);
        Paneer paneer = new Paneer(thickDough);
        Mozzarela mozzarela = new Mozzarela(paneer);*/
        mozzarela.makePizza();
        System.out.println("Total Cost : "+mozzarela.getCost());
        Pizza pizza = new Mozzarela(new Paneer(new ThinDough(new BasePizza())));
        pizza.makePizza();
        System.out.println("Total Cost : "+pizza.getCost());
    }
}
