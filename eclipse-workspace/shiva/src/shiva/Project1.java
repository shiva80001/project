package shiva;

//import java.util.Scanner;

public class Project1 {
	
	int Empno;
	String Empname;
	char Desigcode;
	String Department;
	int Basic;
	int Hra;
	int It;
	String Designation;
	int Da;
	Project1(int Empno,String Empname,char Desigcode,String Department,int Basic,int Hra,int It,String Designation,int Da)
	{
		this.Empno=Empno;
		this.Empname=Empname;
		this.Desigcode=Desigcode;
		this.Department=Department;
		this.Basic=Basic;
		this.Hra=Hra;
		this.It=It;
		this.Designation=Designation;
		this.Da=Da;
	}
	/*Project1( char Desigcode,String Designation,int Da)
	{
		this.Desigcode=Desigcode;
		this.Designation=Designation;
		this.Da=Da;
	}*/
}
/*	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter Emp no");
	    int a = reader.nextInt(); // Scans the next token of the input as an int.
	    //once finished
	    reader.close(); 
		switch(a)
		{
		case 1001: 		System.out.println("Emp No is "+a);
						System.out.println("Name of Employee is : Ashish");
						System.out.println("Department is : R&D ");
						System.out.println("Designation is : Engineer ");
						System.out.println("Salary is : 45000");
						break;
		case 1002: 		 System.out.println("Emp No is "+a);
						 System.out.println("Name of Employee is : Sushma");
						 System.out.println("Department is : PM ");
						 System.out.println("Designation is : Consultant ");
						 System.out.println("Salary is : 65000");
						 break;
		case 1003:		System.out.println("Emp No is "+a);
						System.out.println("Name of Employee is : Rahul");
						System.out.println("Department is : Accountant ");
						System.out.println("Designation is : Clerk ");
						System.out.println("Salary is : 29000");
						break;
		case 1004:    	System.out.println("Emp No is "+a);
						System.out.println("Name of Employee is : Chahat");
						System.out.println("Department is : Front Desk");
						System.out.println("Designation is : Receptionist ");
						System.out.println("Salary is : 31000");
						break;
		case 1005:		System.out.println("Emp No is "+a);
		 				System.out.println("Name of Employee is : Ranjan");
		 				System.out.println("Department is : Enggineer ");
		 				System.out.println("Designation is : Manager ");
		 				System.out.println("Salary is : 90000");
		 				break;
		case 1006:      System.out.println("Emp No is "+a);
		 				System.out.println("Name of Employee is : Suman");
		 				System.out.println("Department is : Manufacture ");
		 				System.out.println("Designation is : Enginner ");
		 				System.out.println("Salary is : 47600");
		 				break;
		case 1007:      System.out.println("Emp No is "+a);
		 				System.out.println("Name of Employee is : Tanmay");
		 				System.out.println("Department is : PM ");
		 				System.out.println("Designation is : Consultant ");
		 				System.out.println("Salary is : 63000");
		 				break;
		default:		System.out.println("Invalid Employee");
		}

	}

}*/
