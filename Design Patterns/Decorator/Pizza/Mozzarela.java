package com.directi.training.Pizza;

/**
 * Created by shyamsunder.a on 7/20/2017.
 */
public class Mozzarela extends PizzaToppings
{
    Mozzarela(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public void makePizza()
    {
        super.makePizza();
        System.out.println("Adding Mozzarella");
    }

    @Override
    public float getCost()
    {
        System.out.println("Cost of Mozzarella is : "+15);
        return super.getCost()+15;
    }
}
