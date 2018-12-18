package java8.lambda;

public class RunnableLambda {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Print from a thread!");
        Thread t = new Thread(r);
        t.start();
    }
}
