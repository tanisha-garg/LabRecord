package labrecord.flowcontrol;
import java.util.*;

public class CalculateDifference {
	int sumOfSquare = 0;
	int squareOfSum = 0;
	int sum = 0;
	int result;
	int difference;

	public static void main(String[] args) {
		CalculateDifference app = new CalculateDifference();
		app.start();

	}
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		int result = calculateDifference(input);
		System.out.println(result);
	}
	
	public int calculateDifference(int input) {
		for(int i = 1; i <= input; i++) {
			sumOfSquare += (i*i);
			sum += i; 
			squareOfSum = (sum*sum);
		}
		difference = sumOfSquare - squareOfSum;
		return difference;
	}

}
