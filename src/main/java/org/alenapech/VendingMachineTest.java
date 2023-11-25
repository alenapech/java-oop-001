package org.alenapech;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineTest implements VendingMachine {
    private List<ProductTest> productTests = new ArrayList<>();

    @Override
    public void initProducts(List<Product> productList) {
        for (Product product : productList) {
            this.productTests.add((ProductTest) product);
        }
    }

    @Override
    public Product getProduct(String name) {
        for (ProductTest product : productTests) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }

}
