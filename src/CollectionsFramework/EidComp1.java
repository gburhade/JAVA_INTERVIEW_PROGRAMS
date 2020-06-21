package CollectionsFramework;

import java.util.Comparator;

public class EidComp1 implements Comparator<Emp>
{
    //Sorting using num for COMPARATOR interface
	@Override
	public int compare(Emp e1, Emp e2) 
	{
	
		if(e1.num==e2.num)
		{
			return 0;
		}
		else if(e1.num>e2.num)
			return 1;
		else
			return -1;
	}
	

}
