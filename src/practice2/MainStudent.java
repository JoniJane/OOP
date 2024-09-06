package practice2;

public class MainStudent {
	public static void main(String[] args) {
		Student student = new Student("Zhanel", "22B000000");
		
		
		System.out.println(student.getName());
		System.out.println(student.getId());
		System.out.println(student.getYearOfStudy());
		
		student.incrementYearOfStudy();
		System.out.println(student.getYearOfStudy());
		
		
	}
}
