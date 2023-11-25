package org.alenapech;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> bottleOfHotWaters = new ArrayList<>();
        bottleOfHotWaters.add(new BottleOfHotWater("123", 123, 123, 100));
        bottleOfHotWaters.add(new BottleOfHotWater("123", 1232, 1232, 60));
        bottleOfHotWaters.add(new BottleOfHotWater("1233", 1233, 1233, 60));
        bottleOfHotWaters.add(new BottleOfHotWater("seminar", 1234, 1234, 100));

        VendingMachine vendingMachine = new BottleOfHotWaterVendingMachine();
        vendingMachine.initProducts(bottleOfHotWaters);

        // we need to cast VendingMachine to BottleOfHotWaterVendingMachine to call correct getProduct method
        System.out.println(((BottleOfHotWaterVendingMachine) vendingMachine).getProduct("123", 123, 100));
        vendingMachine(vendingMachine);
    }

    public static void vendingMachine(VendingMachine vendingMachine) {
        System.out.println(vendingMachine.getProduct("seminar"));
    }
}