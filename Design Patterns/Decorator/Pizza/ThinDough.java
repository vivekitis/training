package com.directi.training.Pizza;

/**
 * Created by shyamsunder.a on 7/20/2017.
 */
public class ThinDough extends PizzaDough
{

    ThinDough(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public void makePizza()
    {
        super.makePizza();
        System.out.println("Adding ThinDough");
    }

    @Override
    public float getCost()
    {
        System.out.println("Cost of ThinDough : "+5);
        return super.getCost()+5;
    }
}
