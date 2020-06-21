package StringManipulations;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Countnumofcharistr {

	public static void main(String[] args) 
	{
		System.out.println("Enter ther string to calculate number of characeter along with occurences");
		Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    
	    
	    Map<Character,Integer> map = new HashMap<Character,Integer>();
	    for(int i=0;i<s.length();i++)
	    {
	    	char ch = s.charAt(i);
	    	if(map.containsKey(ch))
	    	{
	    		int cnt = map.get(ch);
	    		map.put(ch, ++cnt);
	    	}
	    	else
	    		map.put(ch, 1);
	    }
	    
	    Set<Entry<Character, Integer>> entrySet = map.entrySet();
	    for(Entry<Character, Integer> i:map.entrySet())
	    {
	    	System.out.println(i);
	    }

	}

}
