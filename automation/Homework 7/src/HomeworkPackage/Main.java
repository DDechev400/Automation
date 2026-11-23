package HomeworkPackage;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(10),
                new Rectangle(5, 8),
                new Square(6)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.printf("Area: %.2f%n", shape.area());
            System.out.printf("Perimeter: %.2f%n",
                    shape.perimeter());
            System.out.println("------------------------------------------------------------");
        }
    }
}