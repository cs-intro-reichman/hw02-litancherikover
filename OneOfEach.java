/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach 
{
	public static void main (String[] args) 
	{
		boolean Boy = false;
        boolean Girl = false;
        int NumOfChildren = 0;

        while (Boy==false || Girl==false)
		{
            if (Math.random() <= 0.5)
			{
                System.out.print("b ");
                Boy = true;
            } 
			else 
			{
                System.out.print("g ");
                Girl = true;
            }
            NumOfChildren++;
        }
        System.out.println();
		if(Boy==true && Girl==true)
        	System.out.println("You made it... and you now have " + NumOfChildren + " children.");
    }
}
	
		