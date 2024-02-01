package string_processing.p4;

public class Main {

    public static String removeDuplicates(String str){
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if(!ans.contains(String.valueOf(str.charAt(i)))){
                ans += str.charAt(i);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abcccccccbbbbaaadfdafdfalklkdfaj"));
    }
}
