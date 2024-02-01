package expressions.p2;

public class Main {
    public static double toCelsius(int f){
        return (f - 32) * 5.0 / 9.0;
    }

    public static void main(String[] args) {
        System.out.println(toCelsius(54));
    }

}
