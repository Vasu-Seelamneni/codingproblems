package cp;

public class ReverseString {

    public static String reverse(String s) {
        StringBuilder result = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "Hello World!!";
        System.out.println(reverse(s));
    }


}
