public class Binary_To_Decimal {

	public static int binary(int binNum) {
		
		int dec = 0;
		int pow = 0;
		
		while(binNum>0) {
			
			int lastDigit = binNum % 10;
			dec = dec + lastDigit*( (int) Math.pow(2,pow));	
			// note Math.pow function convert int into double => so typecasting is the way
			pow++;
			binNum = binNum/10;
		}	
		return dec;
	}

	public static void main(String[] args) {

		System.out.println(binary(1011));

		
	}
}