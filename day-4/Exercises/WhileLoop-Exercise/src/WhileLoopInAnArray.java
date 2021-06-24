import java.util.Arrays;
public class WhileLoopInAnArray {
	public static void main(String[] args) {
//Create a while loop that stores the numbers one through fifty in an array.
		System.out.println("Create a while loop that stores the numbers one through fifty in an array.");
		int [] theArray = new int[50];
		int index = 0;
		int counter = 1;
		
		 while(index <theArray.length) {
			 theArray[index] = counter;
			 index ++;
			 counter ++;
			 
		 }
		 System.out.println(Arrays.toString(theArray));
		
		 System.out.println(" ");


//Use a do while loop to add five to all the odd numbers in the array.

//One solution without using the Array library
//		 System.out.println("Adding 5 to odd numers, without using the Array library ");
//		 index = 0;
//		 counter = 0;
//		 do{
//			 if ((theArray[index])%2 != 0) {
//				 theArray[index] = theArray[index] +5;
//			 }
//			 System.out.print(theArray[counter] + " ");
//
//			 index +=1;
//
//			 counter +=1;
//			 
//		 }while(index <theArray.length);
		 
		 System.out.println("Use a do while loop to add five to all the odd numbers in the array. ");

		 index = 0;
		 do{
			 int currentElement = theArray[index];
			 
			 if (currentElement%2 != 0) {
				 theArray[index] = currentElement +5;
			 }

			 index ++;

			 
			 
		 }while(index  <theArray.length);
		 System.out.println(Arrays.toString(theArray));
		 
		 
		 System.out.println(" ");

		 System.out.println("third part of the exercise");
		 System.out.println(" ");

		 //Use a for loop to print each element of the array. 
		 //Unless that element is a multiple of four or six. 
		 //If it's a multiple of four print FOUR!!. 
		 //If it's a multiple of six print SIX!!!. 
		 //If it's a multiple of both print FOUR!!SIX!!!.
		 
		 
		 
		 for(int i = 0; i< theArray.length ;i++) {
			 int currentElement = theArray[i];
			 if (currentElement % 4 == 0 && currentElement % 6 == 0) {
				 System.out.println("FOUR!!SIX!!");
			 }else if (currentElement % 4 == 0 ) {
				 System.out.println("FOUR!!");
			 }else if (currentElement % 6 == 0) {
				 System.out.println("SIX!!");
			 }
			 else 
				 System.out.println(currentElement);
		 }
		 
		 
		 
		
	}
}
