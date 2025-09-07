class Kogtevran extends HogwartsStudent {
    int intelligence, wisdom, wit, creativity;

    public Kogtevran(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Ум: " + intelligence);
        System.out.println("Мудрость: " + wisdom);
        System.out.println("Остроумие: " + wit);
        System.out.println("Творчество: " + creativity);
    }

    public static void compare(Kogtevran s1, Kogtevran s2) {
        int sum1 = s1.intelligence + s1.wisdom + s1.wit + s1.creativity;
        int sum2 = s2.intelligence + s2.wisdom + s2.wit + s2.creativity;
        if (sum1 > sum2) {
            System.out.println(s1.name + " лучший Когтевранец, чем " + s2.name);
        } else if (sum1 < sum2) {
            System.out.println(s2.name + " лучший Когтевранец, чем " + s1.name);
        } else {
            System.out.println(s1.name + " и " + s2.name + " равны как Когтевранцы");
        }
    }
}
