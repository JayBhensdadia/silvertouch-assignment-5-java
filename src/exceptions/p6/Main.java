package exceptions.p6;

public class Main {
    public static void printDivision(int a, int b){
        int ans = a / b;
        System.out.println(ans);
    }


    public static void main(String[] args) throws Exception{
        printDivision(10,0);

        //for try catch
        //uncomment following and remove throws

//        try{
//            printDivision(10,0);
//        }catch (Exception e){
//            System.out.println("Exception occurred");
//        }
    }
}
