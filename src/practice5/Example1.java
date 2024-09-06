package practice5;

public class Example1 {
    public static void main(String[] args) {
    	int denominator;
    	int numerator;
    	int ratio;

    	numerator   = 5;
    	//denominator = 1;
    	denominator = 0;
    	
    	try {
    		ratio = numerator / denominator;
    		System.out.println("The answer is: " + ratio);
    	} catch(ArithmeticException a) {
    		System.out.println("Divide by 0.");
    		a.printStackTrace();
    	}
		//System.out.println("The answer is: " + ratio);
		System.out.println("Done."); // Don't move this line
    }
}