// WAP to take your name as input and print in uppercase.
import java.util.*;

public class Ques_2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name =  sc.nextLine();
        name = name.toUpperCase();
        System.out.println("The name in uppercase is: "+name);
    }
}
