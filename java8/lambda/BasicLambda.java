package java8.lambda;

public class BasicLambda {
    public interface TestInterface {
        public void test();
    }

    public static void main(String[] args) {
        TestInterface testInterface = () -> System.out.println("Print from test function in functional interface");
        testInterface.test();
    }
}