package lab6.ex2;

import java.io.*;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String []args) {
        User[] users = new User[100];
        int cnt = 0;

        FileInputStream file = null;
        BufferedReader reader = null;

        try {
            file = new FileInputStream("passwords.txt");
            reader = new BufferedReader(new InputStreamReader(file));

            String line;

            while ((line = reader.readLine()) != null) {
                String []splitData = line.split(" ");
                users[cnt++] = new User(splitData[0], splitData[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            System.exit(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        TreeMap<String, String> myTree = new TreeMap<>();
        for (int i = 0; i < cnt; i++) {
            myTree.put(users[i].getUsername(), users[i].getPassword());
            System.out.println(users[i]);
        }

        Scanner in = new Scanner(System.in);
        boolean loggedIn = false;

        for (int i = 0; i < 6; i++) {
            String []splitData = in.nextLine().split(" ");
            if (splitData.length != 2) {
                i--;
                System.out.println("Wrong input");
                continue;
            }

            String username = splitData[0];
            String password = splitData[1];

            String pwd = myTree.getOrDefault(username, null);

            if (pwd == null) {
                System.out.println("No account was found");
                continue;
            }

            if (password.equals(pwd)) {
                System.out.println("Successful log in");
                loggedIn = true;
                break;
            }

            for (int j = 0; j < 3; j++) {
                System.out.println("Wrong password, please introduce it once again");
                password = in.nextLine();
                if (password.equals(pwd)) {
                    System.out.println("Successful log in");
                    loggedIn = true;
                    break;
                }
            }

            if (loggedIn) {
                break;
            }

            System.out.println("Account was blocked");
            System.exit(0);
        }

        if (!loggedIn) {
            System.out.println("No account was found, please sign up");
        }
    }
}
