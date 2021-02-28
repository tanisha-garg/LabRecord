package labrecord.lambdaandstreams;
import java.util.function.*;

public class Factorial {
	
	public static void main(String args[]) {
		Factorial app = new Factorial();
		app.start();
	}
	
	void start() {
		Function<Integer, Integer> fact = FindFact::findFactorial;
		System.out.println(fact.apply(3));
	}

}

class FindFact{
	public static int findFactorial(int n) {
		int fact = 1;
		for(int i = n; i >0; i--) {
			fact *= i;
		}
		return fact;
	}
}
