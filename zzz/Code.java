public class Code {
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,9};
		int tp = 0;
		int n = arr.length;

		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				tp++;
				System.out.print("[ " + arr[i] + ", " + arr[j] + " ]");
			}
			System.out.println();
		}
		
		System.out.println("Total number of pairs:" + tp);
		
	}
}