package org.alenapech;

import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {
    private List<BottleOfWater> bottleOfWaters = new ArrayList<>();

    @Override
    public void initProducts(List<Product> productList) {
        for (Product product : productList) {
            this.bottleOfWaters.add((BottleOfWater) product);
        }
    }

    @Override
    public Product getProduct(String name) {
        for (BottleOfWater product : bottleOfWaters) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }

    public Product getProduct(String name, double volume) {
        for (BottleOfWater product : bottleOfWaters) {
            if (product.getName().equals(name) && volume == product.getVolume())
                return product;
        }
        return null;
    }

}
