package com.directi.training.Pizza;

/**
 * Created by shyamsunder.a on 7/20/2017.
 */
public class Mushroom extends PizzaToppings
{
    Mushroom(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public void makePizza()
    {
        super.makePizza();
        System.out.println("Adding Mushroom");
    }

    @Override
    public float getCost()
    {
        System.out.println("Cost of Mushroom is :"+20);
        return super.getCost()+20;
    }
}
