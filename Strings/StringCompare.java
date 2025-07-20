package Strings;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony"; // same object s2 pointing to s1
        String s3 = new String("Tony");  // this is new Tony

        if(s1 == s2) { // equal because they are same at object level
            System.out.println("s1 and s2 are equal");
        }
        else {
            System.out.println("s1 and s2 are not equal");
        }
    
        // for string s1 == s3
        if(s1 == s3) { // not equal
            System.out.println("s1 and s3 are equal");
        }
        else {
            System.out.println("s1 and s3 are not equal");
        }

        if(s1.equals(s3)) { // equal because they have same content

            System.out.println("s1 and s3 are equal");
        }
        else {
            System.out.println("s1 and s3 are not equal");
        }
    }
}
