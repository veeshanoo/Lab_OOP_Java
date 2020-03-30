package lab5.ex1;

public class CounterOutClass implements Task {
    static int cnt = 0;

    @Override
    public void execute() {
        cnt++;
        System.out.println(cnt);
    }
}
