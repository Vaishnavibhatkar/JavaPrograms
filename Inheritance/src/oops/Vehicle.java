

package oops;

 class Car {
    void run() {
        System.out.println("I am running");
    }
}

class Ola extends Car {
    void speed() {
        System.out.println("Car has a speed");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Ola o = new Ola();
        o.run();
        o.speed();
    }
}

