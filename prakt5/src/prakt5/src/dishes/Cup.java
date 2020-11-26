package dishes;

public class Cup extends Dish {
    private String useFor;

    public Cup(String color, String material, String usage, String useFor) {
        super(color, material, usage);
        this.useFor = useFor;
    }

    @Override
    public void useDish() {
        System.out.println("dishes.Cup in use");
    }

    public void fill(String drink) {
        System.out.println("dishes.Cup filled with " + drink);
    }
}