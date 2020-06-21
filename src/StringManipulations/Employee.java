package StringManipulations;

public class Employee {
	
	//Instance Variables
	 int eid;
	 String ename;
			
	
	Employee(int eid, String ename)  //Local Variables
	{
		this.eid = eid;
		this.ename = ename;
		
	}
	
	//Overriding toString method of Object Class
	public String toString()
	{
		return "empid = "+eid+" ename = "+ename;
	}

	public static void main(String[] args) 
	{
	  Employee e1 = new Employee(123, "gaurav");
	  System.out.println(e1);
	  System.out.println(e1.toString());
	 	
	}

}

