
public class Animal {
    protected String name;
    protected double weight;
    protected String eatOnDay;

    public Animal(String name, double weight, String eatOnDay) {
        this.name = name;
        this.weight = weight;
        this.eatOnDay = eatOnDay;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getEatOnDay() {
        return eatOnDay;
    }
}
