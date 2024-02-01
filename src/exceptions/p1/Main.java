package exceptions.p1;

public class Main {
    public static void divide(int a, int b){
        try{
            if (b==0) throw new Exception();
            double ans = (double) a / (double) b;
            System.out.println("ans = " + ans);
        }catch (Exception e){
            System.out.println("can't divide with zero");
        }


    }
    public static void main(String[] args) {
       divide(4,2);
       divide(2,0);
    }
}
