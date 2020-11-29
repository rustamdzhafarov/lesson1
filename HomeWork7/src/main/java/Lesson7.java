

public class Lesson7 {

    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik", 50), new Cat("Vasika", 50), new Cat("Zadira", 25), new Cat("Kuzma", 5), new Cat("Bandit", 1)};
// здесь вводим наполнение миски и программа автоматический определит какой из котов сможет наесться а какой нет.
        Plate plate = new Plate( 80);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}
