package labrecord.lambdaandstreams;
import java.util.function.*;

public class ValidationWithLambda {
	
	public static void main(String args[]) {
		BiPredicate<String, String> validate = (user, pass) -> {
			if((user!= null && pass != null) && (user.length() >=3 && pass.length() >=3)) {
				return true;
			}
			else
				return false;
		};
		
		System.out.println(validate.test("tanu", "123"));
	}

}
