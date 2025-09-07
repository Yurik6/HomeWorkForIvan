class Puffendui extends HogwartsStudent {
    int diligence, loyalty, honesty;

    public Puffendui(String name, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Трудолюбие: " + diligence);
        System.out.println("Верность: " + loyalty);
        System.out.println("Честность: " + honesty);
    }

    public static void compare(Puffendui s1, Puffendui s2) {
        int sum1 = s1.diligence + s1.loyalty + s1.honesty;
        int sum2 = s2.diligence + s2.loyalty + s2.honesty;
        if (sum1 > sum2) {
            System.out.println(s1.name + " лучший Пуффендуец, чем " + s2.name);
        } else if (sum1 < sum2) {
            System.out.println(s2.name + " лучший Пуффендуец, чем " + s1.name);
        } else {
            System.out.println(s1.name + " и " + s2.name + " равны как Пуффендуйцы");
        }
    }}
