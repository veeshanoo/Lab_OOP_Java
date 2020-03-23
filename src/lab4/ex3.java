package lab4;

import java.util.Scanner;

public class ex3 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int [][]mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isPrime(mat[i][j]))
                    continue;

//                System.out.println(mat[i][j]);

                ans++;
            }
        }

        System.out.println(ans);
    }

    public static boolean isPrime(int nr) {
        if (nr == 0 || nr == 1)
            return false;

        for (int i = 2; i * i <= nr; i++)
            if (nr % i == 0)
                return false;

        return true;
    }
}
