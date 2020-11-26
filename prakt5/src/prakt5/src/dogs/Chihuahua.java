package dogs;

public class Chihuahua extends Dog {

    public Chihuahua(String color, String name) {
        super(color, name);
    }

    @Override
    public void bark() {
        System.out.println("gav-gav");
    }

    @Override
    public void walk() {
        System.out.println("Чихуахуа гуляет");
    }


}
