//singleinheritance
class Vehicle {
    void start() {
        System.out.println("The vehicle starts.");
    }

    void stop() {
        System.out.println("The vehicle stops.");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("The car honks: Beep Beep!");
    }
}

public class SingleInheritance{
    public static void main(String[] args) {
        Car myCar = new Car(); 
        myCar.start();        
        myCar.honk();          
        myCar.stop();         
    }
}
