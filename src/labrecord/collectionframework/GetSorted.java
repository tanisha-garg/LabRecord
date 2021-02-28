package labrecord.collectionframework;
import java.util.*;

public class GetSorted {

	public static void main(String[] args) {
		GetSorted app = new GetSorted();
		app.start();

	}
	
	void start() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr the length of array: ");
		int length = scan.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < length; i++) {
			arr.add(scan.nextInt());
		}
		List<Integer> result = getSorted(arr);
		System.out.println(result);
	}
	
	List<Integer> getSorted(ArrayList<Integer> arr){
		List<Integer> resultArray = new ArrayList<>();
		resultArray.addAll(arr);
		Collections.reverse(resultArray);
		
		Collections.sort(resultArray);
		return resultArray;
	}

}
