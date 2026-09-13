public class Ran extends Animal {
    private final double length;

    public Ran(String name, double weight, String eatOnDay, double length) {
        super(name, weight, eatOnDay);
        this.length = length;
    }

    public double getLength() {
        return length;
    }
}
