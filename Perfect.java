/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect 
{
	public static void main (String[] args) 
	{
		int Perfect_number = Integer.parseInt(args[0]);
		int Total = 0;
		String DivisorString = "";
		//Number's proper divisors sum should be equal to the number
		for ( int i = 1 ; i < Perfect_number ; i ++) 
		{
			if (Perfect_number % i == 0) 
			{
				Total = Total + i;
			}
		}
			//The sum of proper divisors should be equal to the number
			if (Perfect_number == Total) 
			{
				for (int j = 1; j < Perfect_number; j++)
				{
						if (DivisorString!="")
						{
							DivisorString += " + ";
						}
						DivisorString += j;
				}
				System.out.print(Perfect_number + " is a perfect number since " + Perfect_number + " = " + DivisorString);
			} 
			 else 
			{
			 	System.out.println(Perfect_number + " is not a perfect number");
			}
	}
}
