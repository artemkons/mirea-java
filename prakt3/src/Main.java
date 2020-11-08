public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(1.5, 0, 4);
        myCircle.setRadius(2.0);
        System.out.println(myCircle.getRadius());

        Head head = new Head("Artyom", 'M', "none", "blue");
        head.blink();

        Hand hand = new Hand("Jojo",'F', true);
        System.out.println(hand.isManicure());

        Leg leg = new Leg("Jaja",'M', 2.34);
        System.out.println(leg.getLength());
    }
}
