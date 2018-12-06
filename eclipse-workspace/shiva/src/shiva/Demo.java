package shiva;

public class Demo {
	
			public String name;
			public String Departmentcode;
			public String Department;
			public int Basic;
			public int Hra;
			public int It;
			public int Da;
			public Demo(String name,String Departmentcode,String Department,int Basic,int Hra,int It,int Da)
			{
				this.name= name;
				this.Departmentcode=Departmentcode;
				this.Department=Department;
				this.Basic=Basic;
				this.Hra=Hra;
				this.It=It;
				this.Da=Da;
				
			
			/*public Demo(String name2, String Departmentcode2, String Department2, int Basic2, int Hra2, int It2, int Da2) {
				{
					this.name2= name;
					this.Departmentcode=Departmentcode;
					this.Department=Department;
					this.Basic=Basic;
					this.Hra=Hra;
					this.It=It;
					this.Da=Da;
					
				*/}	
			public int salary()
			{
				int value;
				value=Basic+Hra+Da-It;
				return value;
			}
			void Display()
			{
				System.out.println("Name of Employee"+name);
				System.out.println("Department code is"+Departmentcode);
				System.out.println("Deaprtment is "+Department);
				System.out.println("salary of employee is"+salary());
			}
			
			
		   
		}



