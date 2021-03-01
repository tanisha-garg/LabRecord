package practice;
import java.util.*;
import java.util.stream.Collectors;

public class List1 {
	
	public static void main(String args[]) {
		List1 app = new List1();
		app.start();
	}
	
	void start() {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(1);
		list2.add(2);
		list2.add(4);
		list2.add(5);
		List<Integer> list3 = new ArrayList<>(list1);
		list3.addAll(list2);
		List<Integer> intersection = new ArrayList<>(list1);
		intersection.retainAll(list2);
		list3.removeAll(intersection);
		System.out.print(list3);
	}

}
