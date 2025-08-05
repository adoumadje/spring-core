package com.adoumadje.springcore.standalonecollections;

import java.util.List;

public class ProdutsList {
    private List<String> productNames;

    public List<String> getProductNames() {
        return productNames;
    }

    public void setProductNames(List<String> productNames) {
        this.productNames = productNames;
    }

    @Override
    public String toString() {
        return "ProdutsList{" +
                "productNames=" + productNames +
                '}';
    }
}
