package OOP;

import java.util.Scanner;

public class home_work_1 {
    public static void main(String[] args) {
        Triangle tr = new Triangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите стороны A,B,C последовательно  ");
        tr.area(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
    }
}
