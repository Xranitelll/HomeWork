public class Dog extends Animal{
    Dog (String name, int distanse, int waterDistanse) {
        super(name, distanse, waterDistanse);
    }

    @Override
    void animalRun(int distanse){
        if (distanse > 500) {
            System.out.println("Собаки столько не бегают");
        } else System.out.println(name + " пробежал " + distanse);
    }

    @Override
    void animalSwim(int waterDistanse) {if (waterDistanse > 10) {
        System.out.println("Собаки столько не плавают");
    } else System.out.println(name + " проплыл " + waterDistanse);
    }
}
