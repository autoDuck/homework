package animal;

public class Kotik {
    private String name, voice;
    private int satiety, weight;
    private static int count;
    private static final int METHODS = 5;

    public Kotik() {
        count++;
    }

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;

        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    boolean play() {
        if(satiety == 0) {
            System.out.println("Need food");
            return false;
        }
        System.out.println("Cat sleep");
        return true;
    }

    boolean sleep() {
        if(satiety == 0) {
            System.out.println("Need food");
            return false;
        }
        System.out.println("Cat sleep");
        return true;
    }

    boolean wash() {
        if(satiety == 0) {
            System.out.println("Need food");
            return false;
        }
        System.out.println("Cat wash");
        return true;
    }

    boolean walk() {
        if(satiety == 0) {
            System.out.println("Need food");
            return false;
        }
        System.out.println("Cat walk");
        return true;
    }

    boolean hunt() {
        if(satiety == 0) {
            System.out.println("Need food");
            return false;
        }
        System.out.println("Cat hunt");
        return true;
    }

    void eat(int eat) {
        satiety = eat;
    }

    void eat(int eat, String typeOfEat){
        satiety = eat;
        String typeOfeat = typeOfEat;
    }

    public void livaAnotherDay() {
        for(int i = 24; i > 0; i-- ) {
            switch (random()) {
                case (0):
                    if(play()) System.out.println("Cat play!");
                    eat(1);
                    break;
                case(1):
                    if(sleep()) System.out.println("Cat sleep!");
                    eat(3, "Meat");
                    break;
                case(2):
                    if(wash()) System.out.println("Cat wash!");
                    eat(2);
                    break;
                case(3):
                    if(walk()) System.out.println("Cat walk!");
                    eat(1, "Fish");
                    break;
                case(4):
                    if(hunt()) System.out.println("Cat hunt!");
                    eat(2);
                    break;
            }

        }
    }

    int random() {

        return (int) (Math.random() * METHODS);
    }
}
