public class HogwartsDemo {
    public static void main(String[] args) {

        Gryffindor harry = new Gryffindor("Гарри Поттер", 90, 80, 8, 7, 10);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 95, 85, 9, 10, 8);
        Gryffindor ron = new Gryffindor("Рон Уизли", 80, 70, 7, 8, 7);

        Slytherin draco = new Slytherin("Драко Малфой", 85, 85, 8, 7, 9, 8, 7);
        Slytherin montague = new Slytherin("Грэхэм Монтегю", 70, 60, 6, 6, 7, 6, 6);
        Slytherin goyle = new Slytherin("Грегори Гойл", 65, 60, 7, 5, 6, 5, 6);

        Puffendui zacharias = new Puffendui("Захария Смит", 60, 65, 7, 8, 7);
        Puffendui cedric = new Puffendui("Седрик Диггори", 80, 90, 9, 8, 7);
        Puffendui justin = new Puffendui("Джастин Финч-Флетчли", 65, 75, 7, 7, 8);

        Kogtevran cho = new Kogtevran("Чжоу Чанг", 88, 92, 9, 8, 7, 8);
        Kogtevran padma = new Kogtevran("Падма Патил", 80, 85, 8, 8, 8, 8);
        Kogtevran marcus = new Kogtevran("Маркус Белби", 75, 70, 7, 7, 7, 7);

        harry.describe();
        System.out.println();
        draco.describe();
        System.out.println();
        cedric.describe();
        System.out.println();
        cho.describe();
        System.out.println();

        Gryffindor.compare(hermione, ron);
        Slytherin.compare(draco, montague);
        Puffendui.compare(cedric, justin);
        Kogtevran.compare(cho, padma);
        System.out.println();

        HogwartsStudent.compareMagic(harry, draco);
        HogwartsStudent.compareMagic(cedric, padma);
        HogwartsStudent.compareMagic(ron, goyle);
    }
}

