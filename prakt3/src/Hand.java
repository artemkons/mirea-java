public class Hand extends Human {
    private boolean manicure;

    public Hand(String name, char gender, boolean manicure) {
        super(name, gender);
        this.manicure = manicure;
    }

    public boolean isManicure() {
        return manicure;
    }

    public void setManicure(boolean manicure) {
        this.manicure = manicure;
    }
}
