public class Ball {
    public String type, color;
    public int diameter;

    public Ball(String type, String color, int diameter) {
        this.type = type;
        this.color = color;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
