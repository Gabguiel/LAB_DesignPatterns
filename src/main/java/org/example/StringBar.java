package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringBar extends Bar{
    private boolean flagHappy;
    public StringBar() {
        this(new ArrayList<>());
    }
    public StringBar(List<BarObserver> observers) {
        super(observers);
    }

    @Override
    public boolean isHappyHour() {
        return flagHappy;
    }

    @Override
    public void startHappyHour() {
        this.flagHappy=true;

    }

    @Override
    public void endHappyHour() {
        this.flagHappy=false;
    }

    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }
}
