
import java.util.Scanner;

public class ExampleOne {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Please type in a line and hit Enter.");

	        String line = scanner.nextLine();
	        System.out.println("You have typed: " + line);

	        scanner.close();
	        
	        String numbers = "1 2 3 5 7 9";
	        
	        scanner = new Scanner(numbers);
	        
	        while (scanner.hasNextInt()) {
	        	System.out.print(scanner.nextInt());
	    }
	       scanner.close();
	}

}
