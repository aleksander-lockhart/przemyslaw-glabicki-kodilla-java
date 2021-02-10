package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PeperoniDecorator extends AbstractPizzaOrderDecorator {
    public PeperoniDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaCost() {
        return super.getPizzaCost().add(new BigDecimal(3));
    }

    @Override
    public String getPizzaDesc() {
        return super.getPizzaDesc() + " %n + peperoni sausage";
    }
}