import static java.lang.System.*;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void printInfo() {
        System.out.println(this.food);
    }

    public int getFood() {
        return food;
    }

    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;

        food -= n;
        return true;
    }

    void addFood(int food) {
        this.food += food;
    }

    void info() {
        out.println("plate: " + food);
    }
}