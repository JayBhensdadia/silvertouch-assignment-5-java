package string_processing.p5;

public class Main {
    public static int countWords(String str, String word){
        String[] arr = str.split(" ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countWords("i like coding because coding is interesting","coding"));

    }
}
