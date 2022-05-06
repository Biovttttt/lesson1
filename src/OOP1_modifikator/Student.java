package OOP1_modifikator;

public class Student {
    private  String name;
    private  String email;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0) {
            System.out.println("Жашы нолдон ойдо болуш керек");

        }else {
            this.age = age;
        }}
}
