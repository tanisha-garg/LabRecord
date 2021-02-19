package labrecord.exceptionhandling.validatename;

import java.util.*;

public class ValidateName {
	
	public static void main(String args[]) {
		ValidateName app = new ValidateName();
		app.start();
	}
	
	void start() {
		Scanner scan = new Scanner(System.in);
		System.out.println("First Name: ");
		String firstName = scan.nextLine();		
		System.out.println("Last Name: ");
		String lastName = scan.nextLine();
		
		validateName(firstName, lastName);
	}
	
	public void validateName(String firstName, String lastName) {
		try {
			if(firstName.isEmpty() == true || lastName.isEmpty() == true) {
				throw new EmptyNameException("Name fields cannot be empty.");
			}
			else {
				System.out.println("Hello "+firstName+" "+lastName);
			}
		}catch(EmptyNameException e) {
			System.out.print(e.getMessage());
		}catch(Exception e) {
			System.out.print("Something went wrong");
		}
		
	}

}
