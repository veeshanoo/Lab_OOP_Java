package lab4;

import java.util.Scanner;

public class ex2 {
    public static boolean isPalindrome(String a) {
        StringBuilder aux = new StringBuilder(a);
        return a.equals(new String(aux.reverse()));
    }


    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String []strings = new String[100];
        String bst = "";

        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();

            if (isPalindrome(strings[i])) {
                if (strings[i].length() > bst.length()) {
                    bst = strings[i];
                }
            }
        }

        System.out.println(bst);
    }
}
