package labrecord.lambdaandstreams;
import java.util.function.*;

public class StudentMain {

	public static void main(String[] args) {
		StudentMain app = new StudentMain();
		app.start();

	}
	
	void start() {
		Supplier<Student> student = Student::new;
		System.out.println(student.get().getId());
		
		
	}

}
