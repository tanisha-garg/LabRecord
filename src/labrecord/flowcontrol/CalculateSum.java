package labrecord.flowcontrol;

import java.util.*;

public class CalculateSum {
	
	int result;
	int sum = 0;

	public static void main(String[] args) {
		
		CalculateSum app = new CalculateSum();
		app.start();

	}
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		for(int i = 1; i <= input; i++) {
			result = calculateSum(i);
		}
		System.out.println(result);
	}
	
	public int calculateSum(int number) {
		if((number%3 == 0) && (number%5==0)) {
			sum += number;
		}
		
		return sum;
	}

}
