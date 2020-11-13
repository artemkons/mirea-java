package furniture;

import java.util.Arrays;

public class FurnitureShop {
    private String shopName;
    protected Furniture[] assortment;

    public FurnitureShop(String name, Furniture[] assortment) {
        this.shopName = name;
        this.assortment = assortment;
    }

    public String getShopName() {
        return shopName;
    }
}
