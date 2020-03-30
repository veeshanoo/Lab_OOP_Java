package lab5.ex1;

public class Main {
    public static void main(String []args) {
        RandomTask task1 = new RandomTask("hello");
        RandomOutClass task2 = new RandomOutClass();
        CounterOutClass task3 = new CounterOutClass();

        task1.execute();
        task2.execute();
        task3.execute();
        task3.execute();
    }
}
