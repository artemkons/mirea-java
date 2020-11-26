package dishes;

public class Plate extends Dish {
    String type;

    public Plate(String color, String material, String usage, String type) {
        super(color, material, usage);
        this.type = type;
    }

    public void Wash() {
        System.out.println("Washing the plate...");
    }

    @Override
    public void useDish() {
        System.out.println("dishes.Plate in use");
    }
}
