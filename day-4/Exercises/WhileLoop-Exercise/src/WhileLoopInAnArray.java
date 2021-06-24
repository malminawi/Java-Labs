import java.util.Arrays;
public class WhileLoopInAnArray {
	public static void main(String[] args) {
//Create a while loop that stores the numbers one through fifty in an array.
		int [] theArray = new int[50];
		int index = 0;
		int counter = 1;
		
		 while(index <theArray.length) {
			 theArray[index] = counter;
			 index ++;
			 counter ++;
			 
		 }
		 
		 System.out.println(Arrays.toString(theArray));
		


//Use a do while loop to add five to all the odd numbers in the array.


		 index = 0;
		 counter = 0;
		 
		 do{
			 if ((theArray[index])%2 != 0) {
				 theArray[index] = theArray[index] +5;
			 }
			 System.out.println(theArray[counter]);

			 index +=1;

			 counter +=1;
			 
		 }while(counter <50);
		 
		 
		 
		 //Use a for loop to print each element of the array. 
		 //Unless that element is a multiple of four or six. 
		 //If it's a multiple of four print FOUR!!. 
		 //If it's a multiple of six print SIX!!!. 
		 //If it's a multiple of both print FOUR!!SIX!!!.
		 
		 
		 
		 
		 
		 
		 
		
	}
}
