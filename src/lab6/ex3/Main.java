package lab6.ex3;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Client[] clients = new Client[100];
        int vf = 0;

        try {
            File myObj = new File("clients.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] splitData = data.split(" ");
                if (splitData.length != 3) {
                    System.out.println("wrong file format");
                    System.exit(1);
                }
                clients[vf++] = new Client(splitData[0], splitData[1], Integer.parseInt(splitData[2]));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

        int cntMajor = 0;
        int cntMinor = 0;

        for (int i = 0; i < vf; i++) {
            if (clients[i].getAge() < 18) {
                cntMinor++;
            } else {
                cntMajor++;
            }
        }

        System.out.println("clienti majori: " + cntMajor);
        for (int i = 0; i < vf; i++) {
            if (clients[i].getAge() >= 18) {
                System.out.println(clients[i]);
            }
        }

        System.out.println("clienti minori: " + cntMinor);
        for (int i = 0; i < vf; i++) {
            if (clients[i].getAge() < 18) {
                System.out.println(clients[i]);
            }
        }
    }
}
