class Gryffindor extends HogwartsStudent {
    int nobility, honor, bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + bravery);
    }

    public static void compare(Gryffindor s1, Gryffindor s2) {
        int sum1 = s1.nobility + s1.honor + s1.bravery;
        int sum2 = s2.nobility + s2.honor + s2.bravery;
        if (sum1 > sum2) {
            System.out.println(s1.name + " лучший Гриффиндорец, чем " + s2.name);
        } else if (sum1 < sum2) {
            System.out.println(s2.name + " лучший Гриффиндорец, чем " + s1.name);
        } else {
            System.out.println(s1.name + " и " + s2.name + " равны как Гриффиндорцы");
        }
    }}
