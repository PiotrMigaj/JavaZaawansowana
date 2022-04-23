package pl.migibud.animal;

public interface Runner {

    void run();

    default void count(){
        showCounting2();
        run();
    }

    static void staticCount(){
        showCounting();
    }

    private static void showCounting(){
        System.out.println("3, 2, 1...");
    }

    private void showCounting2(){
        System.out.println("3, 2, 1...");
    }

}
