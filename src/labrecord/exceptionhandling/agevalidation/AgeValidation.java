package labrecord.exceptionhandling.agevalidation;

import java.util.*;

public class AgeValidation {
	
	public static void main(String args[]) {
		AgeValidation app = new AgeValidation();
		app.start();
	}
	
	void start() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int input = scan.nextInt();
		
		try {
			if(input < 15) {
				throw new InvalidAgeException("Age cannot be less than 15");
			}
			else {
				System.out.println("You're age is valid");
			}
			}catch(InvalidAgeException e) {
				System.out.print(e.getMessage());
			}
		}
	}


