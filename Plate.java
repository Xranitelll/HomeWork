public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (food > appetite) {
            food -= appetite;
        } else System.out.println("Еды недостаточно");
        }

    public void invreaseFood(int newFood) {
        food += newFood;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
