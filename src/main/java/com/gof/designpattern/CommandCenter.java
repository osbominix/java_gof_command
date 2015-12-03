package com.gof.designpattern;

import com.gof.designpattern.command.Command;
import com.gof.designpattern.command.basis.BuyBeefMenu;
import com.gof.designpattern.command.basis.BuyChickenMenu;
import com.gof.designpattern.command.basis.Menu;

/**
 * Created by yl3 on 03.12.15.
 */
public class CommandCenter {
    public static void main( String[] args ) {
        Menu chickenMenu = new Menu(Menu.cola, Menu.pompes);
        Menu beefMenu01 = new Menu(Menu.sprite, Menu.patato);
        Menu beefMenu02 = new Menu(Menu.cola, Menu.patato);

        BuyChickenMenu buyChickenMenu = new BuyChickenMenu(chickenMenu);
        BuyBeefMenu buyBeefMenu01 = new BuyBeefMenu(beefMenu01);
        BuyBeefMenu buyBeefMenu02 = new BuyBeefMenu(beefMenu02);

        Command command = new Command();
        command.addBuy(buyChickenMenu);
        command.addBuy(buyBeefMenu01);
        command.addBuy(buyBeefMenu02);

        command.executeBuy();
    }
}

