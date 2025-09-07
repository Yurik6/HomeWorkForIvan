public class HogwartsStudent {
    String name;
    int magicPower;
    int transgressionDistance;

    public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public void describe() {
        System.out.println("Имя: " + name);
        System.out.println("Сила магии: " + magicPower);
        System.out.println("Дистанция трансгрессии: " + transgressionDistance);
    }

    public static void compareMagic(HogwartsStudent s1, HogwartsStudent s2) {
        int score1 = s1.magicPower + s1.transgressionDistance;
        int score2 = s2.magicPower + s2.transgressionDistance;
        if (score1 > score2) {
            System.out.println(s1.name + " сильнее по магии и трансгрессии, чем " + s2.name);
        } else if (score1 < score2) {
            System.out.println(s2.name + " сильнее по магии и трансгрессии, чем " + s1.name);
        } else {
            System.out.println(s1.name + " и " + s2.name + " равны по магии и трансгрессии");
        }
    }
}
