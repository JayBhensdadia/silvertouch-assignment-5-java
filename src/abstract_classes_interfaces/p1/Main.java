package abstract_classes_interfaces.p1;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        Rectangle r = new Rectangle(10,12);

        System.out.println("circle area = " + c.calculateArea());
        System.out.println("rectangle perimeter = " + r.calculatePerimeter());
    }
}
