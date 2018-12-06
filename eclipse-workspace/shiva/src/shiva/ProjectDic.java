package shiva;



public class ProjectDic {
		int EmpNo;
		String EmpName;
		int salary; 
		String Department;
		int Basic;
		int It;
		int Da;
		int Hra;
		String Designation;;
		
		ProjectDic(int EmpNo,String EmpName,String Department,String Designation,int Basic,int It,int Da,int Hra )
		{
			this.EmpNo=EmpNo;
			this.EmpName=EmpName;
			this.Department=Department;
			this.Designation=Designation;
			this.Basic=Basic;
			this.It=It;
			this.Da=Da;
			this.Hra=Hra;
		}
		
		void Show()
		{
			salary= Basic+Da+Hra-It;
			System.out.println("Employee Id is"+EmpNo);;
			System.out.println("Employee Name is"+EmpName);
			System.out.println("Department of employee is "+Department);;
			System.out.println("Designation of Employee is"+Designation);
			System.out.println("Salary of employee is"+salary);
		}
 
}
