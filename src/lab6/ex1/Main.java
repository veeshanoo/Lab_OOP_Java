package lab6.ex1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();

            boolean flag = true;

            try {
                if (x > y) {
                    throw new MyException();
                }
            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("Please give another valid pair");
                i--;
                flag = false;
            } finally {
                if (flag) {
                    try {
                        FileWriter myWriter = new FileWriter("output.txt", true);
                        myWriter.write(x + " " + y + "\n");
                        myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
