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
			// Add an extra space at the beginning of every odd row according to the compilation
            if (i % 2 != 0) 
			{
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) 
			{
                // Even results of i and j will be converted to *
                if ((i + j) % 2 == 0) 
				{
                    System.out.print("  *");
                } 
				// Odd results of i and j will be converted to empty/white cell
				else 
				{
					//In case the program prints empty squere
                    System.out.print("  "); 
                }
            }
            System.out.println();
		}
	}
}
