package demo;
import java.util.*;
import java.util.stream.Collectors;

public class ForEachExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Football");
		list.add("Cricket");
		list.add("Chess");
		list.add("Hockey");
		list.add("Cricket");
		list.add("Chess");
		list.add("Football");
		list.add("nullp");
		list.add(null);
		
		Set<String> set = list.stream().collect(Collectors.toSet());
		set.forEach(game -> System.out.println(game));

	}

}
