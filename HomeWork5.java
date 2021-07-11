public class HomeWork5 {
    public static void main(String[] args) {
        Person ivanov = new Person("Ivanov Denis Petrovich", "Manager", "Ivanov@mail.ru", "+7-985-412-52-85", 31585, 25);
        Person[] personsArr = { new Person
        ("Kirillov Andrey Petrovich", "Manager", "Kirillov@mail.ru", "+7-926-654-52-96", 20000, 49),
        new Person("Stepanov Leonid Andreevich", "Manager", "Stepanov@mail.ru", "+7-916-526-96-74", 50000, 59),
        new Person("Sidorova Darija Antonovnaa", "Manager", "Sidorova@mail.ru", "+7-903-748-32-65", 45000, 22),
        new Person("Antonov Ivan Ivanovich", "Manager", "Antonov@mail.ru", "+7-903-528-98-96", 20000, 21),
        new Person("Bulanov Igor Stepanovich", "Manager", "Bulanov@mail.ru", "+7-895-415-96-41", 100000, 35)
        };

        ivanov.personInfo();
        for (int i=0; i < personsArr.length; i++)
            if (personsArr[i].age > 40) personsArr[i].personInfo();
    }
}

