package com.mannat.twentyfive.llds.vendingmachine;

import com.mannat.twentyfive.llds.vendingmachine.models.VendingMachine;
import com.mannat.twentyfive.llds.vendingmachine.states.impl.IdleState;

public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine(new IdleState());
    }
}
