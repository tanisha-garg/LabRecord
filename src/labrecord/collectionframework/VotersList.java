package labrecord.collectionframework;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class VotersList {

	public static void main(String[] args) {
		VotersList app = new VotersList();
		app.start();

	}
	
	void start() {
		Map<Integer, String> inputMap = new HashMap<>();		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of entries");
		int input = scan.nextInt();
		for(int i = 0; i < input; i++) {
			System.out.println("Enter id: ");
			int id = scan.nextInt();
			System.out.println("Enter DOB in DD/MM/YYYY Format: ");
			String bday = scan.nextLine();
			inputMap.put(id, bday);
		}
		List<Integer> resultList = votersList(inputMap);
		System.out.println(resultList);
	}
	
	List<Integer> votersList(Map<Integer, String> inputMap){
		//List<Integer>age = new ArrayList<>();
		List<Integer>valid = new ArrayList<>();
		for(Map.Entry entry: inputMap.entrySet()) {
			LocalDate today = LocalDate.now();
			String dob = (String) entry.getValue();
			Integer date = Integer.parseInt(dob.substring(0, 2));
			Integer month = Integer.parseInt(dob.substring(3, 5));
			Integer year = Integer.parseInt(dob.substring(6,10));
			LocalDate dateOfBirth = LocalDate.of(year, month, date);
			Period p = Period.between(dateOfBirth, today);
			//age.add(p.getYears());	
			if(p.getYears() > 18) {
				valid.add((Integer) entry.getKey());
			}
		}
		return valid;
	}

}
