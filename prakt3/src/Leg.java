public class Leg extends Human {
    private double length;

    public Leg(String name, char gender, double length) {
        super(name, gender);
        this.length = length;
    }

    public double getLength() {
        return length;
    }
}
