public class MyCat {
    private String name;
    private int appetite;
    private boolean hungry;

    public MyCat(String name, int appetite) {
        hungry = true;
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (hungry) {
            System.out.println(name + " не кушает");
            plate.decreaseFood(appetite);
        }
        if (!hungry) {
            System.out.println(name + " сытая");
        }

    }
}