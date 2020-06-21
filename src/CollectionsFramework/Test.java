package CollectionsFramework;

import java.util.Stack;
import java.util.Vector;

public class Test {
	
		public static void main(String []args) throws Exception
		{
        
			Stack s = new Stack();
			s.add(111);
			s.add(222);
			s.add(333);
	
			System.out.println(s.search(111));
			s.pop();  // Remove the element from 1st index
			System.out.println(s);
			System.out.println(s.peek());   // return the top element of stack
			System.out.println(s.isEmpty());  // check if stack is empty and return boolean value
			s.clear();
			System.out.println(s.isEmpty());
			
//			Stack s2 = new Stack();
//			s2.addAll(s);
//			s2.add(90);
//			s2.add(80);
//			s2.add(40);
//			System.out.println(s2);
          
    
		}
}

