package lab2;

import java.util.Scanner;

public class ex1 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        int []arr = new int[100];
        int sum = 0;
        int vf = 0;

        while (true) {
            int x = scanner.nextInt();

            if (x == -1) {
                System.out.println(1.0 * sum / vf);
                break;
            }

            sum += x;
            arr[vf++] = x;
        }
    }
}
