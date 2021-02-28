package labrecord.collectionframework;
import java.util.*;

public class SecondSmallest {

	public static void main(String[] args) {
		SecondSmallest app = new SecondSmallest();
		app.start();

	}
	
	void start() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of values to be entered: ");
		int input = scan.nextInt();
		int arr[] = new int[input];
		for(int i = 0; i < input; i++) {
			arr[i] = scan.nextInt();
		}
		int result = secondSmallest(arr);
		System.out.print("Second Smallest: "+result);
	}
	
	int secondSmallest(int arr[]) {
		List<Integer>list = new ArrayList<>();
		for(Integer element : arr) {
			list.add(element);
		}
		Collections.sort(list);
		return list.get(list.size()-2);
	}

}
