package labrecord.flowcontrol;

import java.util.*;

public class CheckIncreasingNumber {

	public static void main(String[] args) {
		CheckIncreasingNumber app = new CheckIncreasingNumber();
		app.start();

	}
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		boolean result = checkNumber(input);
		System.out.println(result);
	}
	
	boolean checkNumber(int num) {
		List<Integer>arr = new ArrayList<>();
		int i = 0;
		while(num != 0) {
			arr.add(num%10);
			num /= 10;
			i++;
		}
//		for(Integer list: arr) {
//			System.out.println(list);
//		}
		int length = arr.size();
//		System.out.println(length);
		
		for(int j = 0; j < length-1; j++) {
			if(arr.get(j) > arr.get(j+1)) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}

}
