package CollectionsFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class SampleColllection {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Gaurav");
		hm.put(1, "Sachin");
	//	System.out.println(hm);
		//System.out.println(hm);
		hm.put(3,null);
		hm.put(4, null); 
		System.out.println(hm);
		Set<Integer> ks = hm.keySet();
		Iterator<Integer> itr = ks.iterator();
		while(itr.hasNext())
		{
			int k = itr.next();
			System.out.println(k);
		}
		
		Collection<String> values = hm.values();
		for(String s : values)
		{
			System.out.println(s);
		}
		
		
		
		
	}

}
