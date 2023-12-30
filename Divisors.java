/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors 
{
	public static void main (String[] args) 
	{
		//The program get the argument
		int number = Integer.parseInt(args[0]);
		//The program start checking from 1
		int divisor= 1;
		for (int i = 0 ; i < number ; i++) 
		{
			if (number % divisor == 0) 
			{
				System.out.println(divisor);
			}
			divisor++;
		}
	}
}
