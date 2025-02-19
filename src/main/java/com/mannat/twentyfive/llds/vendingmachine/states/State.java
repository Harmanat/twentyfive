package com.mannat.twentyfive.llds.vendingmachine.states;

import com.mannat.twentyfive.llds.vendingmachine.models.Item;

public interface State {
    void insertCoins();
    void selectItem(Item item);
    void cancel();
    void dispenseItems();
}
