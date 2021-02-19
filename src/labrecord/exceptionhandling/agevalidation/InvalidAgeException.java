package labrecord.exceptionhandling.agevalidation;

public class InvalidAgeException extends RuntimeException{
	InvalidAgeException(String msg){
		super(msg);
	}

}
