package practice;
import java.util.*;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap1 app = new HashMap1();
		app.start();

	}
	
	void start() {
		Map<String, String> map = new HashMap<>();
		String arr[] = {"goa", "kerala", "gujarat"};
		for(String element : arr) {
			String upper = element.toUpperCase();
			map.put(upper.substring(0, 3), element);
		}
		System.out.println(map);
	}

}
