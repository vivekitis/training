package com.directi.training.Pizza;

/**
 * Created by shyamsunder.a on 7/20/2017.
 */
public class BasePizza implements Pizza
{
    @Override
    public void makePizza()
    {
        System.out.println("Making Pizza");
    }

    @Override
    public float getCost()
    {
        System.out.println("Cost of Pizza : "+40);
        return 40;
    }
}
