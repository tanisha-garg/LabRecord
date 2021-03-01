package practice;
import java.util.*;

public class HashMap2 {
	
	public static void main(String args[]) {
		HashMap2 app = new HashMap2();
		app.start();
	}
	
	void start() {
		Map<String, String> map = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		map.put("ram", "hari");
		map.put("cisco", "barfi");
		map.put("honeywell", "cs");
		map.put("cts", "hari");
		for(Map.Entry entry : map.entrySet()) {
			if(entry.getValue() == "hari") {
				String key = (String) entry.getKey();
				list.add(key);
			}
		}
		for(String element : list) {
			System.out.println(element);
		}
	}

}
