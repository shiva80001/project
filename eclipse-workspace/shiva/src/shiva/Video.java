package shiva;

import java.util.Scanner;

public class Video {
	private  String Tittle;
	private boolean flag=true;
	private  double Rating;
	int a;
	double rate;
	
		Video(String Tittle,double Rating)
		{
			this.Tittle=Tittle;
			this.Rating=Rating;
			beingissue();
			
		}
	 void beingissue()
	 
	{
		 if (flag ==true)
		 {
			 System.out.println("take video of tittle"+Tittle);
			 beingreturned();
			 recivingrating();
			 flag=false;
		 }
		 else
		 {
			 System.out.println("video"+Tittle+" has been rented");
			 System.out.println("video will come on "+a);
		 }
		
	}
	 void beingreturned()
	 {
		 System.out.println("when are you going to return video enter date");
		 Scanner reader = new Scanner(System.in);  // Reading from System.in
		     a = reader.nextInt(); // Scans the next token of the input as an int.
		    //once finished
		     
		    reader.close(); 
	 }
	 void recivingrating()
	 {
		 System.out.println("Enter your rating to "+Tittle+"movie");
		 Scanner reader = new Scanner(System.in);  // Reading from System.in
		     rate = reader.nextInt(); // Scans the next token of the input as an int.
		    //once finished
		    reader.close(); 
		 
	 }
}
