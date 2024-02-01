package exceptions.p2;

import java.util.Scanner;

public class Main {
    public static void getAge() throws InvalidAge {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if(age <= 0){
            throw new InvalidAge();
        }
    }

    public static void main(String[] args) {
        try{
            getAge();
        }catch (Exception e){
            System.out.println("Enter valid age");
        }
    }
}
