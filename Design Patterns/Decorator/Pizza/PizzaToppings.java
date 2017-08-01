package com.directi.training.Pizza;

/**
 * Created by shyamsunder.a on 7/20/2017.
 */
public abstract class PizzaToppings implements Pizza
{
    Pizza _pizza;

    PizzaToppings(Pizza pizza){
        _pizza = pizza;
    }

    @Override
    public void makePizza()
    {
        _pizza.makePizza();
    }

    @Override
    public float getCost()
    {
        return _pizza.getCost();
    }
}