package com.mannat.twentyfive.llds.vendingmachine.models;


import com.mannat.twentyfive.llds.vendingmachine.states.impl.IdleState;

import javax.swing.plaf.nimbus.State;

public class VendingMachine {
    State state;

    public VendingMachine(IdleState state){}
}
