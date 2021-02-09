package labrecord.flowcontrol;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		PrimeNumbers app = new PrimeNumbers();
		app.start();

	}
	
	void start() {
		
		int num = 10;
		
		for(int i = 1; i <=num; i++) {
			//System.out.print(num);
			isPrime(i);
		}
		
		
	}
	
	void isPrime(int num) {
		int flag = 0;
		for(int i = 1; i <= num; i++) {
			if(num%i == 0) {
				flag++;
			}
		}
		
		if(flag == 2) {
			System.out.println(num);
		}
	}

}
