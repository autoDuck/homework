package homework;

import animal.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik = new Kotik();
        kotik.setName("Ne Boris");
        kotik.setSatiety(0);
        kotik.setWeight(20);
        kotik.setVoice("Ne meow");

        Kotik secondKotik = new Kotik("Boris", "Meow", 10, 50);

        secondKotik.livaAnotherDay();
        kotik.livaAnotherDay();

        System.out.println(compareVoice(kotik, secondKotik));
        System.out.println(secondKotik.getCount());
    }

    public static boolean compareVoice(Kotik catOne, Kotik secondCat) {
        return catOne.getVoice().equals(secondCat.getVoice());
    }
}
