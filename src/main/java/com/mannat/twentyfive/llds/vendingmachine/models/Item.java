package com.mannat.twentyfive.llds.vendingmachine.models;

import com.mannat.twentyfive.llds.vendingmachine.enums.ItemType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    String name;
    double price;
    ItemType type;
}
