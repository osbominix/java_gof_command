package com.gof.designpattern.command.basis;

/**
 * Created by yl3 on 03.12.15.
 */
public class Menu {

    private String chickenBurger = "Chicken Burger";
    private String beefBurger = "Beef Burger";

    public final static String cola = "Cola";
    public final static String sprite = "Sprite";

    public final static String pompes = "Pommes";
    public final static String patato = "Patato";

    private String drink;
    private String extra;


    public Menu(String drink, String extra) {
        this.drink = drink;
        this.extra = extra;
    }

    public void orderChickenMenu() {
        System.out.println("Buy Chicken Menu: " + chickenBurger + " with " + drink + " and " + extra);
    }

    public void orderBeefMenu() {
        System.out.println("Buy Beef Menu:" + beefBurger + " with " + drink + " and " + extra);
    }

}
