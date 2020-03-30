package lab5.ex2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String []args) {
        Album []albums = new Album[5];
        albums[0] = new Album("album1", 23, 34.5);
        albums[1] = new Album("album2", 45, 23.6);
        albums[2] = new Album("album2", 23, 24.1);
        albums[3] = new Album("album4", 45, 34.1);
        albums[4] = new Album("album1", 43, 34.1);

        System.out.println("before:");
        for (int i = 0; i < 5; i++) {
            System.out.println(albums[i]);
        }

        System.out.println("\nafter:");
        Arrays.sort(albums);
        for (int i = 0; i < 5; i++) {
            System.out.println(albums[i]);
        }
    }
}
