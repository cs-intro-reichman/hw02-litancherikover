/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard 
{
	public static void main(String[] args) 
	{
		//Here, the program gets an argument.
		int n = Integer.parseInt(args[0]); 
        for (int i = 0; i < n; i++) 
		{
            for (int j = 0; j < n; j++) 
			{
                // The program check if i is even
                if (i  % 2 == 0) 
				{
                    System.out.print("* ");
                } 
				else 
				{
					//If the i is not even
                    System.out.print(" *"); 
                }
            }
            System.out.println();
		}
	}
}
