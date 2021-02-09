package labrecord.flowcontrol;

public class RecursiveFibonacci {
	
	public static void main(String args[]) {
		RecursiveFibonacci app = new RecursiveFibonacci();
		app.start();
	}	
	
	void start() {
		int num = 6;
		int result = fibonacciFunction(num);
		System.out.println(result);
	}
	
	int fibonacciFunction(int num) {
		int sum = 0;
		if(num == 1 || num == 2) {
			return 1;
		}
		else {
			sum = sum + fibonacciFunction(num-1) + fibonacciFunction(num-2);
			return sum;
		}
	}
	
}

//1 1 2 3 5 8