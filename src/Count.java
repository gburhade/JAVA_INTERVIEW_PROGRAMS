
public class Count {

	public static void main(String[] args) 
	{
	    String str = "abcd1234";
	    char ch;
	    int addnum=0;
	    
	    for(int i=0;i<str.length();i++)
	    {
	    	ch = str.charAt(i);
	    	if(ch>='1' && ch<='9')
	    	{
	    		int num = Character.getNumericValue(ch); 
	    		addnum = addnum + num;
	    	}
	    	
	    }
	    System.out.println(addnum);
		
		
	}

}
