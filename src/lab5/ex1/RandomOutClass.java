package lab5.ex1;

import java.util.Random;

public class RandomOutClass implements Task {
    private int number;

    public RandomOutClass() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    @Override
    public void execute() {
        System.out.println(this.number);
    }
}
