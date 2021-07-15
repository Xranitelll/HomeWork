public class Cat extends Animal{
    Cat (String name, int distanse, int waterDistanse) {
        super(name, distanse, waterDistanse);
    }

    @Override
    void animalRun(int distanse){
        if (distanse > 200) {
            System.out.println("Коты столько не бегают");
        } else System.out.println(name + " пробежала " + distanse);
    }

    @Override
    void animalSwim(int waterDistanse) {
        System.out.println("кошки не плавают");
    }
}
