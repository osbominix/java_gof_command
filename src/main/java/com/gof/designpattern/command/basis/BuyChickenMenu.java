package com.gof.designpattern.command.basis;

/**
 * Created by yl3 on 03.12.15.
 */
public class BuyChickenMenu implements Buy {
    private Menu menu;
    private String drink;
    private String extra;

    public BuyChickenMenu(Menu menu) {
        this.menu = menu;
    }


    public void order() {
        menu.orderChickenMenu();
    }
}
