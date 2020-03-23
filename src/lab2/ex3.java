package lab2;

import java.util.Scanner;

public class ex3 {
    private int age = 0;
    private double height = 0;

    ex3(int age, double height) {
        this.age = age;
        this.height = height;
    }

    public void afis() {
        System.out.println(this.age);
    }

    public static void main(String []args) {
        ex3 x = new ex3(4, 2.3);
        x.afis();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
