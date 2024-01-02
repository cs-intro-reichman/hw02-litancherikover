/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 
{
	public static void main (String[] args) 
	{
		 // Gets the two command-line arguments
        int T = Integer.parseInt(args[0]);
        // Initializes a random numbers generator with the given seed value
        boolean Boy=false;
		boolean Girl=false;
		// Initialzing the variable which accumulates total number of children across all families
        int TotalNumOfChildren = 0; 
		// Number of children for this family
		int NumOfChildrenThisFamily=0;
        int TwoChildren = 0, ThreeChildren = 0, FourOrMoreChildren = 0;
        for (int i = 0; i < T; i++) 
        {
            Boy = false;
            Girl = false;
            NumOfChildrenThisFamily = 0; 
            while (Boy==false || Girl==false)
            {
                if (Math.random() <= 0.5)
                {
                    Boy = true;
                } 
                else 
                {
                    Girl = true;
                }
				//Count the number of children in this family
                NumOfChildrenThisFamily++;
            }
			//here we accumulate the number of total children
            TotalNumOfChildren += NumOfChildrenThisFamily; 
            if (NumOfChildrenThisFamily == 2)
            {
                TwoChildren++;
            }
            else if (NumOfChildrenThisFamily == 3)
            {
                ThreeChildren++;
            }
            else if (NumOfChildrenThisFamily >= 4)
            {
                FourOrMoreChildren++;
            }
        }
		// Calculates the average
        double avg = (double) TotalNumOfChildren / T; 
        System.out.println("Average: " + avg + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + TwoChildren);
        System.out.println("Number of families with 3 children: " + ThreeChildren);
        System.out.println("Number of families with 4 or more children: " + FourOrMoreChildren);
        if (TwoChildren >= ThreeChildren && TwoChildren >= FourOrMoreChildren) 
        {
            System.out.println("The most common number of children is 2.");
        } 
        else if (ThreeChildren >= TwoChildren && ThreeChildren >= FourOrMoreChildren) 
        {
            System.out.println("The most common number of children is 3.");
        } 
        else 
        {
            System.out.println("The most common number of children is 4 or more.");
        }

	}
}
