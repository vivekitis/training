package com.directi.training.Pizza;

/**
 * Created by shyamsunder.a on 7/20/2017.
 */
public class Paneer extends PizzaToppings
{
    Paneer(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public void makePizza()
    {
        super.makePizza();
        System.out.println("Adding Paneer");
    }

    @Override
    public float getCost()
    {
        System.out.println("Cost of Paneer is : "+20);
        return super.getCost()+20;
    }
}
