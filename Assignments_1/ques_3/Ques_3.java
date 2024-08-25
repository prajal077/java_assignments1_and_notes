import java.util.*;
class Input {
    Scanner sc = new Scanner(System.in);
    String name, address, email;
    int age;
    
    void input () {
        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter the address: ");
        address = sc.nextLine();
        System.out.println("Enter the Email: ");
        email = sc.nextLine();
        System.out.println("Enter the age: ");
        age = sc.nextInt();
    }
    
    void display () {
        System.out.println("The name is: "+name);
        System.out.println("The address is: "+address);
        System.out.println("The email is: "+email);
        System.out.println("The age is: "+age);
    }
}

public class Ques_3 {
    public static void main (String [] args) {
        Input obj = new Input();
        obj.input();
        obj.display();
    }
}