package practice3;

public class Student extends Person {
	private String program;
	private int year;
	private double fee;
	public Student() {
		
	}
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.fee = fee;
		this.year = year;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double gerFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String toString() {
		return "Student[Person[name = " + getName() + ", address = " + getAddress() + "], program = " + program + ", year = " + year + ", fee = " + fee + "]";
		
		//String personToString = super.toString();
		//return personToString+ "\nprogram: " + program+ "\nyear: " + year + "\nfee: " + fee;
	}
	
}
