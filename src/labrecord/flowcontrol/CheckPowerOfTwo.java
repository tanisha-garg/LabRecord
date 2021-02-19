package labrecord.flowcontrol;

import java.util.*;
import java.math.*;

public class CheckPowerOfTwo {

	public static void main(String[] args) {
		CheckPowerOfTwo app = new CheckPowerOfTwo();
		app.start();
	}
	
	void start() {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		boolean result = checkNumber(input);
		System.out.println(result);
	}
	
	boolean checkNumber(int num) {
		while(num != 0) {
			if(num%2 == 0) {
				num /= 2;
				if(num == 1) {
					return true;
				}
			}
		}
			
		return false;
	}

}