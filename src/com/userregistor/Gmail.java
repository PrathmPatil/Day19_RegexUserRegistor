package com.userregistor;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Gmail {
     static String gmail;
	 static String  eGmail() 
     {
	    	Scanner sc= new Scanner(System.in);
			/*
			 * give user input 
			 */
			System.out.print("Enter Gmail: ");
			gmail=sc.next();
			return gmail;
	    }
     
   static void gmailDisplay(String gmail)
   {
	   boolean pattern =Pattern.matches("^abc.[a-zA-Z0-9+_-]+@bl.co.[a-zA-Z0-9-]+$", gmail);
		/*
		 * E.g. abc.xyz@bl.co.in  
		 * Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
		 */
	   if(pattern==true)
	   {
		   System.out.println("'"+gmail+"'"+" Gmail is valid");
	   }
	   else
	   {
		   System.out.println("'"+gmail+"'"+" Gmail is not valid");
	   }
		
   }
	public static void main(String[] args) {
		String uGmail=eGmail();
		gmailDisplay(uGmail);
	}

}
