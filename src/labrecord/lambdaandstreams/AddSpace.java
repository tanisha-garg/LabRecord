package labrecord.lambdaandstreams;
import java.util.function.*;

public class AddSpace {
	
	public static void main(String args[]) {
		String res;
		Function<String, String> addSpace = (str) -> str.replace("", " ");
		System.out.println(addSpace.apply("Hey"));
	}

}
