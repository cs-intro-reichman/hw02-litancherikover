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
		int T = Integer.parseInt(args[0]);
		boolean Boy = false;
		int NumOfBoys=0;
        boolean Girl = false;
		int NumOfGirls=0;
        int NumOfChildren = 0;
		double avg=0;
		int TwoChildren=0,ThreeChildren=0,FourOrMoreChildren=0;
		for (int i=0;i<=T;i++)
		{
			while (Boy==false || Girl==false)
				{
					if (Math.random() <= 0.5)
					{
						Boy = true;
						NumOfBoys++;
					} 
					else 
					{
						Girl = true;
						NumOfGirls++;
					}
					NumOfChildren++;
        		}
				if(NumOfBoys+NumOfGirls==2)
				{
					TwoChildren++;
				}
				else if(NumOfBoys+NumOfGirls==3)
				{
					ThreeChildren++;
				}
				else
				{
					FourOrMoreChildren++;
				}
				NumOfBoys=0;
				NumOfGirls=0;
				Boy=false;
				Girl=false;

		}
		avg = (double) NumOfChildren / T;
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
