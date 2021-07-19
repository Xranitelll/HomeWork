public class HomeWork7 {
    public static void main(String[] args) {
        Plate plate = new Plate(20);

        MyCat[] newNewCat = {
                new MyCat("Ириска", 40),
                new MyCat("Ватсон", 20),
                new MyCat("Мурка", 15)
        };

       plate.info();
        for (MyCat MyCat: newNewCat) {
            MyCat.eat(plate);
        }
       plate.info();
       plate.invreaseFood(50);
       plate.info();
    }
}
