package Strings.HomeWork;

public class RemoveChar {
    public static String remove(String str, char ch) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != ch) {
                sb.append(str.charAt(i));
            }
            
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(remove("programming is good to build logic" , 'g'));
    }
}
