package OOP1_modifikator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Aты");
        st.setName(sc.nextLine());
        System.out.println("емайлы");
        st.setEmail(sc.nextLine());
        System.out.println("Жашы");
        st.setAge(sc.nextInt());

        System.out.println("АТы"+ st.getName() + " email "+ st.getEmail() + " жашы" + st.getAge());
    }
}
