package com.gof.designpattern.command;

/**
 * Created by yl3 on 03.12.15.
 */
import com.gof.designpattern.command.basis.Buy;

import java.util.ArrayList;
import java.util.List;
public class Command {

        private List<Buy> buyList = new ArrayList<Buy>();

        public void addBuy(Buy buy){
            buyList.add(buy);
        }

        public void executeBuy(){

            for (Buy buy : buyList) {
                buy.order();
            }
            buyList.clear();
        }
}
