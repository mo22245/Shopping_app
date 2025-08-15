import java.util.Scanner;

public class Pokemons {
    private Scanner s = new Scanner(System.in);
private String name;
private int age;
private String gender;

    public void getName() {
        System.out.println("name is " + name);
    }

    public void setName() {
        System.out.println("enter name : ");
        name = s.nextLine();
    }

    public void getAge() {
        System.out.println("age is : "+age);
    }

    public void setAge() {
        System.out.println("enter age : ");
        age=s.nextInt();
    }

    public void getGender() {
        System.out.println("gender is "+ gender);
    }

    public void setGender() {
        System.out.println("enter gender : ");
        gender=s.nextLine();
    }
    public void print(){
        if (age>3 && gender .equals("male")){
            getName();getAge();getGender();
        }
    }
}

