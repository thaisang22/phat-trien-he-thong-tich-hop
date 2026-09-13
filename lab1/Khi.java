public class Khi extends Animal {
    private final String foodLove;

    public Khi(String name, double weight, String eatOnDay, String foodLove) {
        super(name, weight, eatOnDay);
        this.foodLove = foodLove;
    }

    public String getFoodLove() {
        return foodLove;
    }
}
