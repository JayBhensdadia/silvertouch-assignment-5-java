package abstract_classes_interfaces.p1;

public class Circle extends Shape {
    private int radius;

    public Circle(int r){
        this.radius = r;
    }

    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 3.14 * 2 * radius;
    }


}
