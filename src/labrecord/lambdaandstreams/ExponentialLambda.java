package labrecord.lambdaandstreams;
import java.math.*;
import java.lang.FunctionalInterface;

public class ExponentialLambda {
	public static void main(String args[]) {
		Exponent ex = (x,y) -> (Math.pow(x, y));
		System.out.println(ex.getExponent(2,3));
	}

}

@FunctionalInterface
interface Exponent {
	public double getExponent(int x, int y);
}
