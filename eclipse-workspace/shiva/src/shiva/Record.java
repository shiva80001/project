package shiva;


import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Record {

	public static void main(String[] args) {
		Map<Integer,Demo> map =new HashMap<Integer,Demo>();
		Demo d1 = new Demo("Ashish","R&D","Engineer",20000,8000,3000,8000);
		Demo d2 = new Demo("Sushma","PM","Consultant",30000,12000,9000,12000);
		Demo d3 = new Demo("Rahul","Accountant","Clerk",10000,8000,1000,12000);
		Demo d4 = new Demo("Chahat","Front Desk","Receptionist",12000,6000,2000,15000);
		Demo d5 = new Demo("Ranjan","Engg","Maneger",50000,20000,20000,40000);
		Demo d6 = new Demo("Suman","Manufactoring","Enggineer",23000,9000,4400,20000);
		Demo d7 = new Demo("Tanmay","PM","Consultant",29000,12000,10000,32000);
	
		map.put(1001,d1);
		map.put(1002,d2);
		map.put(1003,d3);
		map.put(1004,d4);
		map.put(1005,d5);
		map.put(1006,d6);
		map.put(1007,d7);
		//d1.Display();
		//d2.Display();
		//System.out.println(Set entryset());
		//  set = map.entrySet();
		 /* Set set = map.entrySet();
	      
	      // Get an iterator
	      Iterator i = set.iterator();
	     
	      // Display elements 
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         if(key==1001)
	         {
	        	 
	         }
	      }*/
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter Emp no");
	    int a = reader.nextInt(); // Scans the next token of the input as an int.
	    //once finished
	    reader.close(); 
	    if(map.containsKey(a))
        {
	    	//Object value = map.get(key);
	    	System.out.print(" Id of employee is: "+a);
	    	System.out.println();
        	d1.Display();
        	
        }
	    else if(map.containsKey(a))
        {
	    	//Object value = map.get(key);
	    	System.out.print(" Id of employee is: "+a);
        	d2.Display();
        }
	    else if(map.containsKey(a))
        {
	    	//Object value = map.get(key);
	    	System.out.print(" Id of employee is: "+a);
        	d3.Display();
        }
	    else if(map.containsKey(a))
        {
	    	//Object value = map.get(key);
	    	System.out.print(" Id of employee is: "+a);
        	d4.Display();
        }
	    else if(map.containsKey(a))
        {
	    	//Object value = map.get(key);
	    	System.out.print(" Id of employee is: "+a);
        	d5.Display();
        }
	    else if(map.containsKey(a))
        {
	    	//Object value = map.get(key);
	    	System.out.print(" Id of employee is: "+a);
        	d6.Display();
        }
	    else if(map.containsKey(a))
        {
	    	//Object value = map.get(key);
	    	System.out.print(" Id of employee is: "+a);
        	d7.Display();
        }
	    else
	    {
	    	System.out.println("invalid input");
	    }
		
		
		
		
		
		
		
		
		
		/*
		
		Set<Map.Entry<Integer,Demo>> set1 = map.entrySet();
		for (Map.Entry<Integer,Demo> me : set1) 
        {
            System.out.print(" Id of employee is: "+me.getKey()  );
            //System.out.println(me.getValue(Demo.Display()));
            if(map.containsKey(1001))
            {
            	d1.Display();
            	
            }
            else if(map.containsKey(1002))
            {
            	d2.Display();
            }
          }
			*/
	}
	
	
  
}


  