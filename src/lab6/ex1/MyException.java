package lab6.ex1;

public class MyException extends Exception {
    @Override
    public String getMessage() {
        return "First number is greater then the second";
    }
}
