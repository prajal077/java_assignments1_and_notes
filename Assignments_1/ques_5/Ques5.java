class Parent {
    Parent () {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void child () {
        System.out.println("This is child class");
    }
}
public class Ques5 {
    public static void main(String [] args) {
        Child obj = new Child();
    }
}