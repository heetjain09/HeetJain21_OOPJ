//super keyword
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("the cat makes a sound");
    }
}

class Cat extends Animal {
    
    Cat(String name) {
        super(name);
    }

    
    void makeSound() {
        super.makeSound();
        System.out.println(name + " meows");
    }
}

public class Super{
    public static void main(String[] args) {
        Cat cat = new Cat("sakura");
        cat.makeSound();
    }
}
//final keyword
final class Constants {
    static final double PI = 3.14;
}

class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    final double area() {
        return Constants.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    private double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    double volume() {
        return area() * height;
    }
}

public class Final{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of the circle: " + circle.area());

        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("Volume of the cylinder: " + cylinder.volume());
    }
}
