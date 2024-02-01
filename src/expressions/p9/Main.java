package expressions.p9;

public class Main {

    public static double heronArea(int a, int b, int c){
        double s = (a + b + c) / 2.0;
        return Math.sqrt((s * (s-a) * (s-b) * (s-c)));
    }

    public static void main(String[] args) {
        System.out.println(heronArea(2,3,4));
    }
}
