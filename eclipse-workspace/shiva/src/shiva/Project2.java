package shiva;

public class Project2 {
	public static void main(String args[])
	{
		int [] a = new int [5];
		try
		{
		a[0] = Integer.parseInt(args[0]);
		a[1] = Integer.parseInt(args[1]);
		a[2] = Integer.parseInt(args[2]);
		a[3] = Integer.parseInt(args[3]);
		a[4] = Integer.parseInt(args[4]);
		}
		catch(Exception e)
		{
			System.out.println("arrayindex out of Bounds");
		}
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++) 
			{
				if(a[i]>a[j])
					
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			}
			try {
			for (int i=0;i<a[i];i++) {
				System.out.println("Sorted array is"+a[i]);
			}
			}
			catch (Exception e)
			{
				System.out.println("exception 2");
		    }
				
			}
			
		}
	


