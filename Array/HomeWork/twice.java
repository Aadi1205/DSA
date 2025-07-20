package HomeWork;

public class twice {
    public static boolean numRepeat(int arr[]) {
        
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] == arr[j]) {
                   return true; 
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int  arr[] = {1,1,2,2,3,2,3,4};
        System.out.println(numRepeat(arr));
    }
    
}
