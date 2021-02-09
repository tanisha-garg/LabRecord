package labrecord.flowcontrol;

public class NonRecursiveFibonacci {
	
	public static void main(String args[]) {
		NonRecursiveFibonacci app = new NonRecursiveFibonacci();
		app.start();
	}
	
	void start() {
		int num = 4;
		int first = 1, second = 1;
		int sum = 0;
		for(int index = 3; index <= num; index++) {
			sum = first + second;
			first = second;
			second = sum;			
		}
		System.out.print(sum);
	}

}
