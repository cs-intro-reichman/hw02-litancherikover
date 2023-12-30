/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder 
{
	public static void main (String[] args) 
	{
		int num = (int)((Math.random()) * 10);
		//Printing the first number
	    System.out.print(num);
		//Here, the program generates the second number, which should be bigger than the first number
		int generated_number = (int)((Math.random()) * 10);
		//Checking if the numbers are in non-decreasing sequence, which allows them to be equal.
		while (generated_number >= num) 
		{
			System.out.print(" " + generated_number);
			//num is taking the value of the generated number in order to keep the sequence
			num = generated_number;
			generated_number = (int)((Math.random()) * 10);
		}
	}
}
