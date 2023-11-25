package org.alenapech;

public class ProductTest extends Product {
    private int test;

    public ProductTest(String name, double cost, int test) {
        super(name, cost);
        this.test = test;
    }

    public double getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "ProductTest{" +
                "name='" + getName() + '\'' +
                ", cost=" + getCost() + '\'' +
                ", test=" + test +
                '}';
    }
}
