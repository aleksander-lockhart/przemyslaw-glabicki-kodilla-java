package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaOrderDecorator implements PizzaOrder {
    private final PizzaOrder pizzaOrder;

    protected AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getPizzaCost() {
        return pizzaOrder.getPizzaCost();
    }
    @Override
    public String getPizzaDesc() {
        return pizzaOrder.getPizzaDesc();
    }
}