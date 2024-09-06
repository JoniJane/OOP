package practice2;

public class MainTime {

	public static void main(String[] args) {
		Time first = new Time(23, 5, 6);
		System.out.println(first.toUniversal());
		System.out.println(first.toStandard());
		
		Time second = new Time(4,24,33);
		first.add(second);
		System.out.println(first.toUniversal());
		System.out.print(first.toStandard());

	}

}
