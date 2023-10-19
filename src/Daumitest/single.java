package Daumitest;

public class single {
    private static volatile single instance;

    private single() {
    }

    public static single getInstance() {
        if (instance == null) {
            synchronized (single.class) {
                if (instance == null) {
                    instance = new single();
                }
            }
        }
        return instance;
    }

    public void castSpell() {
        System.out.println("O Mago Singleton lança um feitiço com sua varinha mágica!");
    }

    public static void main(String[] args) {
        single magician = single.getInstance();
        magician.castSpell();
    }
}
