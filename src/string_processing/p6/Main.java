package string_processing.p6;

public class Main {

    public static String longestWord(String str){
        int maxLength = 0;
        String word = "";
        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() > maxLength){
                word = arr[i];
                maxLength = word.length();
            }
        }
        return word;
    }
    public static void main(String[] args) {
        System.out.println(longestWord("programming is hard"));
    }
}
