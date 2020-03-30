package lab5.ex1;

public class RandomTask implements Task {
    private String message;

    public RandomTask(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(this.message);
    }
}
