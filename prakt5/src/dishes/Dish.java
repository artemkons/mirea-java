package dishes;

public abstract class Dish {
    private String color, material, usage;

    public Dish(String color, String material, String usage) {
        this.color = color;
        this.material = material;
        this.usage = usage;
    }

    public abstract void useDish();
}
