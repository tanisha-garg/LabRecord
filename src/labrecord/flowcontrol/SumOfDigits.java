package labrecord.flowcontrol;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int num = 123;
		int sum = 0;
		while(num > 0) {
			int digit = num%10;
			sum = sum + (digit*digit*digit);
			num = num/10;
		}
		System.out.print(sum);
		
	}

}
