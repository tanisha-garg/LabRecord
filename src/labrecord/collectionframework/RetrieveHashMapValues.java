package labrecord.collectionframework;

import java.util.*;

public class RetrieveHashMapValues {

	public static void main(String[] args) {
		RetrieveHashMapValues app = new RetrieveHashMapValues();
		app.start();

	}
	
	void start() {
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "One");
		hashMap.put(2, "Two");
		hashMap.put(3, "Three");
		List<String>list = getValues(hashMap);
		for(String display : list) {
			System.out.println(display);
		}
	}
	
	List<String> getValues(Map<Integer, String> hashMap){
		List<String> list = new ArrayList<>(hashMap.values());
		Collections.sort(list);
		return list;
	}

}
