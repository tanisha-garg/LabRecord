package labrecord.collectionframework;

import java.util.*;

public class CountCharactersInArray {

	public static void main(String[] args) {		
		CountCharactersInArray app = new CountCharactersInArray();
		app.start();
	}
	
	void start() {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int length = str.length();
		char ch;
		Character arr[] = new Character[length];
		for(int i = 0; i < length; i++) {
			ch = str.charAt(i);
			arr[i] = ch;
		}
		Map<Character, Integer> map = countChar(arr);
		for(Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
	HashMap<Character, Integer> countChar(Character arr[]) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(Character element: arr) {
			if(map.containsKey(element)) {
				map.put(element, map.get(element)+1);
			}
			else {
				map.put(element, 1);
			}
		}
		return map;
		
	}

}
