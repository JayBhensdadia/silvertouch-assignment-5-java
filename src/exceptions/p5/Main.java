package exceptions.p5;

import exceptions.p2.InvalidAge;

import java.util.Scanner;

public class Main {

    public static void getInput() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        String age = sc.nextLine();


            int iAge = Integer.parseInt(age);
            if(iAge <= 0){throw new InvalidAge(); }
//            System.out.println(iAge);

    }
    public static void main(String[] args) {
        try{
            getInput();
        }catch (Exception e){
            System.out.println("Exception occurred");
        }
    }
}
