package labrecord.lambdaandstreams;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Repository {
	Map<Integer, Employee> map = new HashMap<>();

	public static void main(String[] args) {
		Repository app = new Repository();
		app.start();
	}
	
	void start() {
		Employee e1 = new Employee("Tanisha", 21, 7000, "Developer");
		Employee e2 = new Employee("Pallavi", 22, 8000, "Tester");	
		Employee e3 = new Employee("Ankit", 50, 10000, "HR");
		Employee e4 = new Employee("Ankush", 53, 4000, "Tester");
		map.put(1, e1);
		map.put(2, e2);
		map.put(3, e3);
		map.put(4, e4);
		double totalSal = totalSalary(map);
		System.out.println(totalSal);
		Employee emp = displayD(map);
		System.out.println(emp);
		List<Employee> listasc = displayASC(map);
		System.out.println(listasc);
		List<Employee> listdesc = displayDESC(map);
		System.out.println(listdesc);
		List<Employee> listAge = empDetails(map);
		System.out.println(listAge);
		
	}
	
	double totalSalary(Map<Integer, Employee>map) {
		List<Employee> list = new ArrayList<>(map.values());
		BinaryOperator<Double> op = (sal1, sal2) -> sal1 + sal2;
		Optional<Double> optional = list.stream().filter(emp -> emp.getAge() >= 50).map(emp -> emp.getSalary()).reduce(op);
		if(optional.isPresent()) {
			return optional.get();
		}
		return 0;
	}
	
	Employee displayD(Map<Integer, Employee> map) {
		List<Employee> list = new ArrayList<>(map.values());
		Comparator<Employee> comp = (emp1, emp2) -> {
			int age1 = emp1.getAge();
			int age2 = emp2.getAge();
			if(age1 > age2) {
				return 1;
			}
			else if(age1 == age2) {
				return 0;
			}
			else {
				return -1;
			}
		};
		Optional<Employee> op = list.stream().max(comp);
		if(op.isPresent()) {
			return op.get();
		}
		return op.get();
	}
	
	List<Employee> displayASC(Map<Integer, Employee>map){
		Comparator<Employee> comp = (emp1, emp2) -> {
			int age1 = emp1.getAge();
			int age2 = emp2.getAge();
			if(age1 > age2) {
				return 1;
			}
			else if(age1 == age2) {
				return 0;
			}
			else {
				return -1;
			}
		};
		List<Employee> list = new ArrayList<>(map.values());
		List<Employee> finalList = list.stream().filter(emp -> emp.getAge() > 30).sorted(comp).collect(Collectors.toList());
		return finalList;
	}
	
	List<Employee> displayDESC(Map<Integer, Employee>map){
		Comparator<Employee> comp = (emp1, emp2) -> {
			int age1 = emp1.getAge();
			int age2 = emp2.getAge();
			if(age1 < age2) {
				return 1;
			}
			else if(age1 == age2) {
				return 0;
			}
			else {
				return -1;
			}
		};
		List<Employee> list = new ArrayList<>(map.values());
		List<Employee> finalList = list.stream().filter(emp -> emp.getAge() > 30).sorted(comp).collect(Collectors.toList());
		return finalList;
	}
	
	List<Employee> empDetails(Map<Integer, Employee>map){
		List<Employee> list = new ArrayList<>();
		List<Employee> finalList = list.stream().filter(emp -> emp.getAge() > 21).collect(Collectors.toList());
		return finalList;
	}

}
