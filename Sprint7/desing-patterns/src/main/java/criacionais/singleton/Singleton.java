package criacionais.singleton;

public final class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    private Singleton() {

    }
    public static Singleton getInstance() {
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hellow i am singleton");
    }
}









