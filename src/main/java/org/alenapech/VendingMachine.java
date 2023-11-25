package org.alenapech;

import java.util.List;

public interface VendingMachine {
    public void initProducts(List<Product> productList);

    public Product getProduct(String name);

}
