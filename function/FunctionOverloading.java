public class FunctionOverloading {

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static float sum(float a, float b) {
		return a + b;
	}

	public static void main(String[] args) {

		int a = sum(5, 5);
		int c = sum(5, 5, 5);
		float b = sum(2.3f, 4.6f);
		System.out.println("sum of two integer numbers: " + a);
		System.out.println("Sum of three integer numbers: " + c);
		System.out.println("sum of two float numbers: " + b);
	}
}