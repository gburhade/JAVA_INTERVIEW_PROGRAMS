package CollectionsFramework;

import java.util.Comparator;

public class EnameComp1 implements Comparator<Emp>
{
	//Sorting using ename for COMPARATOR interface
	@Override
	public int compare(Emp e1, Emp e2) 
	{
		return (e1.ename).compareTo(e2.ename);
	}
}
