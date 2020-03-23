package lab2;

import java.util.Scanner;

public class ex4 {
    private String name;
    private int grade;

    ex4(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        ex4 []students = new ex4[100];

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String []line = scanner.nextLine().split(" ");

            String name = line[0];
            int grade = Integer.parseInt(line[1]);

            students[i] = new ex4(name, grade);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(students[i].getName() + " ");
            System.out.println(students[i].getGrade());
        }
    }
}
