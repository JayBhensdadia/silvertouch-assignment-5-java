package string_processing.p1;

public class Main {

    public static int countVowels(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("this is a sample string"));
    }
}
