package expressions.p1;

public class Main {
    public static double calculateArea(int radius){
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println(calculateArea(10) + " unit square");
    }
}
