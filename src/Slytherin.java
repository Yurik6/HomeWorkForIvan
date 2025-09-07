class Slytherin extends HogwartsStudent {
    int cunning, determination, ambition, resourcefulness, thirstForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + determination);
        System.out.println("Амбициозность: " + ambition);
        System.out.println("Находчивость: " + resourcefulness);
        System.out.println("Жажда власти: " + thirstForPower);
    }

    public static void compare(Slytherin s1, Slytherin s2) {
        int sum1 = s1.cunning + s1.determination + s1.ambition + s1.resourcefulness + s1.thirstForPower;
        int sum2 = s2.cunning + s2.determination + s2.ambition + s2.resourcefulness + s2.thirstForPower;
        if (sum1 > sum2) {
            System.out.println(s1.name + " лучший Слизеринец, чем " + s2.name);
        } else if (sum1 < sum2) {
            System.out.println(s2.name + " лучший Слизеринец, чем " + s1.name);
        } else {
            System.out.println(s1.name + " и " + s2.name + " равны как Слизеринцы");
        }
    }
}
