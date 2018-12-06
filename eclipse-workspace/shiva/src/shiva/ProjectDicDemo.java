package shiva;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
//import java.util.Scanner;

public class ProjectDicDemo {
	public static void main(String []args) {
		/*ProjectDic obj = new ProjectDic(1001,"Ashish","R&D","Engineer",20000,3000,20000,8000);
		ProjectDic obj1 = new ProjectDic(1002,"Sushma","PM","CONSULTANT",30000,9000,32000,12000);
		ProjectDic obj2 = new ProjectDic(1003,"Rahul","ACCT","CLERK",10000,3000,12000,8000);
		ProjectDic obj3 = new ProjectDic(1004,"Chahat","FRONT DESK","RECEPTIONIST",12000,2000,15000,6000);
		ProjectDic obj4 = new ProjectDic(1005,"Ranjan","ENGG","MANGER",50000,20000,40000,20000);
		ProjectDic obj5= new ProjectDic(1006,"suman","MANUFACTURING","Engineer",23000,4400,20000,9000);
		ProjectDic obj6 = new ProjectDic(1007,"Tanmay","PM","CONSULTANT",29000,10000,15000,12000);
		*/
		
		/*Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter Emp no");
	    int a = reader.nextInt(); // Scans the next token of the input as an int.
	    //once finished
	    reader.close(); */
	    Map<String, List<String>> map = new HashMap<>();
	    //HashMap<String, List<String>> hashMap = new HashMap<String,List<String>>();
	    List<String> listone= new ArrayList<String>();
	    listone.add("Ashish");
	    listone.add("R&D");
	    listone.add("Engineer");
	    listone.add("20000");
	    listone.add("3000");
	    listone.add("20000");
	    listone.add("8000");
	    List<String> listtwo= new ArrayList<String>();
	    listtwo.add("Sushma");
	    listtwo.add("PM");
	    listtwo.add("Consultant");
	    listtwo.add("30000");
	    listtwo.add("9000");
	    listtwo.add("32000");
	    listtwo.add("12000");
	    map.put(1001,listone);
	    map.put(1002,listtwo);
	   //iterator display all keys and values 
	  /*  Iterator itr = listone.iterator();
	      
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
	      }
	    
	      Iterator itr1 = listtwo.iterator();
	      while(itr1.hasNext()) {
		         Object element = itr1.next();
		         System.out.print(element + " ");
		      }
	    
	    */
	    Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter Emp no");
	    int a = reader.nextInt(); // Scans the next token of the input as an int.
	    //once finished
	    reader.close(); 
	    
	   if (listone.containsKey(a));
	    {
	    	System.out.println("employee id found");
	    }
	    else 
	    {
	    	System.out.println("Employee id not found");
	    }

	    
	    
	    
	    
	    
	
	    
	    
		/*switch(a)
		{
		
		
		case 1001:		
						obj.Show();
						break;
						
		case 1002:		
						obj1.Show();
						break;
		
		case 1003:		
						obj2.Show();
						break;
		
		case 1004:		
			            obj3.Show();
						break;
		
		case 1005:		
			            obj4.Show();
						break;
		
		case 1006:		
						obj5.Show();
						break;
		
		case 1007:		
						obj6.Show();
						break;
						
		default:        System.out.println("Invalid Employee id");
	
		
		
		
		}*/
	
		
	}

}
