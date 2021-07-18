public class HomeWork6 {
    public static void main(String[] args) {
        Animal dog = new Dog("Джек", 200, 100);
        Animal cat = new Cat("Ирис", 100, 40);
        dog.animalRun(150);
        cat.animalRun(180);

        dog.animalSwim(15);
        cat.animalSwim(20);
    }

}

