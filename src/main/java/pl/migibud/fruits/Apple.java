package pl.migibud.fruits;

public class Apple {

    int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                '}';
    }
}
