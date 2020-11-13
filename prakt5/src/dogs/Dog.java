package dogs;

public abstract class Dog {
    private String color, name;

    protected Dog(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public abstract void bark();

    public abstract void walk();
}
