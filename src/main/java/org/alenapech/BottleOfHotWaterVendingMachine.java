package org.alenapech;

import java.util.ArrayList;
import java.util.List;

public class BottleOfHotWaterVendingMachine implements VendingMachine {
    private List<BottleOfHotWater> bottleOfHotWaters = new ArrayList<>();

    @Override
    public void initProducts(List<Product> productList) {
        for (Product product : productList) {
            this.bottleOfHotWaters.add((BottleOfHotWater) product);
        }
    }

    @Override
    public Product getProduct(String name) {
        for (BottleOfWater product : bottleOfHotWaters) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }

    public Product getProduct(String name, double volume, int temperature) {
        for (BottleOfHotWater product : bottleOfHotWaters) {
            if (product.getName().equals(name)
                    && volume == product.getVolume()
                    && temperature == product.getTemperature())
                return product;
        }
        return null;
    }

}
