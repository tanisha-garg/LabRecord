package labrecord.collectionframework;
import java.util.*;

public class SquareOfArrayElement {

	public static void main(String[] args) {
		SquareOfArrayElement app = new SquareOfArrayElement();
		app.start();

	}
	 void start() {
		 Scanner scan = new Scanner(System.in);
		 List<Integer> list = new ArrayList<>();
		 System.out.print("Enter the size of ArrayList");
		 int length = scan.nextInt();
		 for(int i = 0; i < length; i++) {
			 list.add(scan.nextInt());
		 }
		 Map<Integer, Integer> map = getSquares(list);
		 for(Map.Entry entry: map.entrySet()) {
			 System.out.println(entry.getKey()+" "+entry.getValue());
		 }
	 }
	 
	 public Map<Integer, Integer> getSquares(List<Integer>list){
		 Map<Integer, Integer>map = new HashMap<>();
		 for(Integer element:list) {
			 map.put(element, element*element);
		 }
		 return map;
		 
	 }

}
