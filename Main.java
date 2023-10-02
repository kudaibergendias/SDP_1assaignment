package sdp1;
public class Main{
    public static void main(String[] args) {
        for (int i = 0;i<3;i++){
            new Thread(() -> {
                Singleton singleton = Singleton.getInstance();
                singleton.showSingleton();
                System.out.println(singleton.toString());
            }).start();
        }
    }
}