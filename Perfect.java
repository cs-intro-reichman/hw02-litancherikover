/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect 
{
	public static void main (String[] args) 
	{
		int perfect_number = Integer.parseInt(args[0]);
		int Total = 0;
		//Number's proper divisors sum should be equal to the number
		for ( int i = 1 ; i < perfect_number ; i ++) 
		{
			if (perfect_number % i == 0) 
			{
				Total = Total + i;
			}
		}
			//The sum of proper divisors should be equal to the number
			if (perfect_number == Total) 
			{
				System.out.print(perfect_number + " is a perfect number");
			 } else 
			 {
			 	System.out.println(perfect_number + " is not a perfect number");
			 }
	}
}
