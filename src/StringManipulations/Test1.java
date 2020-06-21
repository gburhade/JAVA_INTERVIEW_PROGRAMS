package StringManipulations;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.lang.Cloneable;

import CollectionsFramework.Emp;
import CollectionsFramework.Student;

public class Test1 {

	public static void main(String[] args) 
	{

       TreeMap t1 = new TreeMap();
       System.out.println(t1 instanceof Serializable);
       System.out.println(t1 instanceof Cloneable);
       
       ArrayList a = new ArrayList();
       System.out.println(a instanceof Serializable);
       System.out.println(a instanceof Cloneable);
       
       HashMap h = new HashMap();
       System.out.println(a instanceof Serializable);
       System.out.println(a instanceof Cloneable);
     
	}

}

