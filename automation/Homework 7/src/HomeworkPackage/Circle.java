package HomeworkPackage;

public class Circle implements Shape {
    private double radius; //we are not extending Circle, so we can use private instead of protected

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() { //A=πr2
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() { //C=2πr
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "The Circle is with radius = " + radius;
    }
}
