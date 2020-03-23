package lab2;

import java.util.Scanner;

public class ex2 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        int []even = new int[100];
        int []odd = new int[100];
        int nr_even = 0;
        int nr_odd = 0;

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x % 2 == 0) {
                even[nr_even++] = x;
            } else {
                odd[nr_odd++] = x;
            }
        }

        if (nr_even > nr_odd) {
            for (int i = 0; i < nr_even; i++)
                System.out.println(even[i]);
        } else {
            for (int i = 0; i < nr_odd; i++)
                System.out.println(odd[i]);
        }
    }
}
