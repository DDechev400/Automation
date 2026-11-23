package HomeworkPackage;

public class Rectangle implements Shape {
    protected double width; //protected as we are extending Rectangle to Square
    protected double height; //protected as we are extending Rectangle to Square

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height; //A=wl
    }

    @Override
    public double perimeter() { //(P = 2(l + w))
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle is with width = " + width +
                " and height = " + height;
    }
}
