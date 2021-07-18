public abstract class Animal {
    String name;
    int distanse;
    int waterDistanse;

    Animal(String name, int distanse, int waterDistanse) {
        this.name = name;
        this.distanse = distanse;
        this.waterDistanse = waterDistanse;
    }
    void animalRun(int distanse) {
        System.out.println(name + " Пробежал " + distanse);
    }
    void animalSwim(int waterDistanse) {
        System.out.println(name + " Проплыл " + waterDistanse);
    }
}
