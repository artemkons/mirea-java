package dogs;

public class Dachshund extends Dog {
    public Dachshund(String color, String name) {
        super(color, name);
    }

    @Override
    public void bark() {
        System.out.println("AW-AW-AW");
    }

    @Override
    public void walk() {
        System.out.println("Такса гуляет");
    }
}
