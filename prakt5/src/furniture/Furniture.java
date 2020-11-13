package furniture;

public abstract class Furniture {
    private String name, material;
    private double price;

    public Furniture(String name, double price, String material) {
        this.name = name;
        this.price = price;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }
}
