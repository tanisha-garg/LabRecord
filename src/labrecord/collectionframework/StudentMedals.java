package labrecord.collectionframework;
import java.util.*;

public class StudentMedals {
	
	public static void main(String args[]) {
		StudentMedals app = new StudentMedals();
		app.start();
	}
	
	void start() {
		Scanner scan = new Scanner(System.in);
		Map<Integer, Integer> inputMap = new HashMap<>();
		System.out.println("Enter number of inputs to be inserted");
		int input = scan.nextInt();
		for(int i = 1; i <= input; i++) {
			System.out.println("Enter id: ");
			int id = scan.nextInt();
			System.out.println("Enter Marks: ");
			int marks = scan.nextInt();
			inputMap.put(id, marks);
		}
		
		Map<Integer, String> outputMap = getStudents(inputMap);
		for(Map.Entry entry: outputMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	
	Map<Integer, String> getStudents(Map<Integer, Integer> inputMap){
		Map<Integer, String> outputMap = new HashMap<>();
		List<Integer> idList = new ArrayList<>(inputMap.keySet());
		for(Integer id : idList) {
			Integer marks = inputMap.get(id);
			if(marks >= 90) {
				outputMap.put(id, "Gold");
			}
			else if(marks>=80 && marks<90) {
				outputMap.put(id, "Silver");
			}
			else if(marks>=70 && marks<80) {
				outputMap.put(id, "Bronze");
			}
		}
		return outputMap;
	}

}
