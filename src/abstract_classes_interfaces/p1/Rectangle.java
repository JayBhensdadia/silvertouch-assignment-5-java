package abstract_classes_interfaces.p1;

public class Rectangle extends Shape{
    int l;
    int b;

    public Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    @Override
    double calculatePerimeter() {
        return 2 * (l+b);
    }

    @Override
    double calculateArea() {
        return l*b;
    }
}
