package sdp1;

public class Singleton{
    private Singleton() {
    }
    private static class SingletonHolder {
        public static final Singleton HOLDER_INSTANCE = new Singleton();
    }
    public static Singleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
    public void showSingleton(){
        System.out.println("Singleton pattern");
    }
}