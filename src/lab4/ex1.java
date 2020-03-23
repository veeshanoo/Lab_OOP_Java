package lab4;

import java.util.Arrays;

public class ex1 {
    public static boolean isAnagram(String a, String b) {
        char []va = a.toCharArray();
        char []vb = b.toCharArray();

        Arrays.sort(va);
        Arrays.sort(vb);

        String ca = new String(va);
        String cb = new String(vb);

        return ca.equals(cb);
    }

    public static void main(String []args) {
        System.out.println(isAnagram("asd", "sda"));
        System.out.println(isAnagram("asd", "asg"));
    }
}
