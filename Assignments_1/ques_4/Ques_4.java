class Car {
    Car() {
        System.out.println("This is parent class called CAR");
    }
}

class Tesla extends Car {
    Tesla() {
        super();
        System.out.println("This is child class called Tesla");
    }
}

public class Ques_4 {
    public static void main (String [] args) {
        Tesla obj = new Tesla();
    }
}