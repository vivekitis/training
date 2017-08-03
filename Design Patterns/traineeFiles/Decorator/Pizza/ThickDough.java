package com.directi.training.Pizza;

/**
 * Created by shyamsunder.a on 7/20/2017.
 */
public class ThickDough extends PizzaDough
{
    ThickDough(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public void makePizza()
    {
        super.makePizza();
        System.out.println("Adding ThickDough");
    }

    @Override
    public float getCost()
    {
        System.out.println("Cost of ThickDough is : "+10);
        return super.getCost()+10;
    }
}
