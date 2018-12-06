package shiva;

import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		int [] EmpNO= new int [7];
		EmpNO[0]=1001;
		EmpNO[1]=1002;
		EmpNO[2]=1003;
		EmpNO[3]=1004;
		EmpNO[4]=1005;
		EmpNO[5]=1006;
		EmpNO[6]=1007;
		String [] EmpName= new String[7];
		EmpName[0]="Ashish";
		EmpName[1]="Sushma";
		EmpName[2]="Rahul";
		EmpName[3]="Chahat";
		EmpName[4]="Ranjan";
		EmpName[5]="suman";
		EmpName[6]="Tanmay";
		char [] Desigcode= new char[5];
		Desigcode[0]='e';
		Desigcode[1]='c';
		Desigcode[2]='k';
		Desigcode[3]='r';
		Desigcode[4]='m';
		String [] Dept= new String[6];
		Dept[0]= "R&D";
		Dept[1]= "PM";
		Dept[2]= "Accountant";
		Dept[3]= "Front Desk";
		Dept[4]= "Engg";
		Dept[5]= "Manufacture";
		int [] Basic= new int[7];
		Basic[0]=20000;
		Basic[1]=30000;
		Basic[2]=10000;
		Basic[3]=12000;
		Basic[4]=50000;
		Basic[5]=23000;
		Basic[6]=29000;
		
		int [] Hra = new int[7];
		Hra[0]=8000;
		Hra[1]=12000;
		Hra[2]=8000;
		Hra[3]=6000;
		Hra[4]=20000;
		Hra[5]=9000;
		Hra[6]=12000;
		
		int It[] = new int [7];
		It[0]=3000;
		It[1]=9000;
		It[2]=1000;
		It[3]=2000;
		It[4]=20000;
		It[5]=4400;
		It[6]=10000;
		
		String Designation []= new String[5];
		Designation[0]= "Enggineer";
		Designation[1]= "Consultant";
		Designation[2]= "Clerk";
		Designation[3]= "Reception";
		Designation[4]="Manager";
		int Da[]= new int[5];
		Da[0]= 20000;
		Da[1]= 32000;
		Da[2]= 12000;
		Da[3]= 15000;
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter Emp no");
	    int a = reader.nextInt(); // Scans the next token of the input as an int.
	    //once finished
	    reader.close(); 
	    int salary;
		switch(a)
		{
		
		
		case 1001:		System.out.println("Employee id is "+EmpNO[0]);
						System.out.println("Name of Employee is "+EmpName[0]);
						System.out.println("Department of Employee is"+Dept[0]);
						System.out.println("Designation of employee is "+ Designation[0]);
						salary= Basic[0]+Hra[0]+Da[0]-It[0];
						System.out.println("Salary of employee is "+salary);
						break;
						
		case 1002:		System.out.println("Employee id is "+EmpNO[1]);
						System.out.println("Name of Employee is "+EmpName[1]);
						System.out.println("Department of Employee is"+Dept[1]);
						System.out.println("Designation of employee is "+ Designation[1]);
						salary= Basic[1]+Hra[1]+Da[1]-It[1];
						System.out.println("Salary of employee is "+salary);
						break;
		
		case 1003:		System.out.println("Employee id is "+EmpNO[2]);
						System.out.println("Name of Employee is "+EmpName[2]);
						System.out.println("Department of Employee is"+Dept[2]);
						System.out.println("Designation of employee is "+ Designation[2]);
						salary= Basic[2]+Hra[2]+Da[2]-It[2];
						System.out.println("Salary of employee is "+salary);
						break;
		
		case 1004:		System.out.println("Employee id is "+EmpNO[3]);
						System.out.println("Name of Employee is "+EmpName[3]);
						System.out.println("Department of Employee is"+Dept[3]);
						System.out.println("Designation of employee is "+ Designation[3]);
						salary= Basic[3]+Hra[3]+Da[3]-It[3];
						System.out.println("Salary of employee is "+salary);
						break;
		
		case 1005:		System.out.println("Employee id is "+EmpNO[4]);
						System.out.println("Name of Employee is "+EmpName[4]);
						System.out.println("Department of Employee is"+Dept[4]);
						System.out.println("Designation of employee is "+ Designation[4]);
						salary= Basic[4]+Hra[4]+Da[2]-It[4];
						System.out.println("Salary of employee is "+salary);
						break;
		
		case 1006:		System.out.println("Employee id is "+EmpNO[5]);
						System.out.println("Name of Employee is "+EmpName[5]);
						System.out.println("Department of Employee is"+Dept[5]);
						System.out.println("Designation of employee is "+ Designation[2]);
						salary= Basic[5]+Hra[5]+Da[3]-It[5];
						System.out.println("Salary of employee is "+salary);
						break;
		
		case 1007:		System.out.println("Employee id is "+EmpNO[6]);
						System.out.println("Name of Employee is "+EmpName[6]);
						System.out.println("Department of Employee is"+Dept[1]);
						System.out.println("Designation of employee is "+ Designation[2]);
						salary= Basic[6]+Hra[6]+Da[3]-It[6];
						System.out.println("Salary of employee is "+salary);
						break;
						
		default:        System.out.println("Invalid Employee id");
	
		
		
		
		}
		
		
	}

}
