package shiva;


	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class Hacker {

	    // Complete the solve function below.
	    static void solve(double meal_cost, int tip_percent, int tax_percent) {


	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        double meal_cost = scanner.nextDouble();
	       // scanner.skip("12.00");

	        int tip_percent = scanner.nextInt();
	        //scanner.skip("20");

	        int tax_percent = scanner.nextInt();
	        //scanner.skip("8");

	        solve(meal_cost, tip_percent, tax_percent);
	       double tip_percent1 = 12*tip_percent/100;
	        double tax_percent1= 12*tax_percent/100;
	       double totalcost= meal_cost+tip_percent1+tax_percent1;
	        
	           System.out.println("The total meal cost is"+ totalcost    +"dollars.");

	        scanner.close();
	    }
	

}
