public class SuTu extends Animal {
    private final double eat;

    public SuTu(String name, double weight, String eatOnDay, double eat) {
        super(name, weight, eatOnDay);
        this.eat = eat;
    }

    public double getEat() {
        return eat;
    }
}
