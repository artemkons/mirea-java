public class Head extends Human {
    private String hair, eyes;

    public Head(String name, char gender, String hair, String eyes) {
        super(name, gender);
        this.hair = hair;
        this.eyes = eyes;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public String getEyes() {
        return eyes;
    }

    public void blink() {
        System.out.println(getName() + " моргнул");
    }
}
