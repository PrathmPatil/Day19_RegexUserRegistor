package com.userregistor;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegstration_Regex {
  static String fName;
  static String lName;
  static String gmail;
  static String mNumber;
  static String passward;
  
	 static String fname()
	   {    
		 Scanner sc= new Scanner(System.in);
			/*
			 * give user input 
			 */
			System.out.print("Enter First Name: ");
			fName=sc.next();
			/*
			 * check enterd name are math with pattern
			 */
			return fName;
	   }
	 /*
	  * last name enter 
	  */
	 static String lname()
	   {    
		 Scanner sc= new Scanner(System.in);
			/*
			 * give user input 
			 */
			System.out.print("Enter First Name: ");
			fName=sc.next();
			/*
			 * check enterd name are math with pattern
			 */
			return fName;
	   }
	 /*
	  * enter mobile number
	  */
	 static String mobileNumber()
	 {
		 Scanner sc= new Scanner(System.in);
		 System.out.print("Enter Mobile Number");
		 mNumber=sc.nextLine();
		 return mNumber;
	 }
	 static void displayMobileNumber(String mNumber)
	 {
		 boolean mobNumber= Pattern.matches("^[+]?{1}[0-9]{2}[\s]?{1}[7-9]{1}[0-9]{9}$", mNumber);
		if(mobNumber==true)
		{
			System.out.println("Enterd number "+mNumber+" are Valid.");
		}
		else 
		{
			System.out.println("Enterd number "+mNumber+" are not valid");
		}
	 }
	 static String passWard()
	 {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter Passward (minimum 8 characters): ");
		 passward=sc.next();
		 return passward;
	 }
	 static void passWardDisplay(String passward)
	 {
		 boolean passWard=Pattern.matches("^(=?.*[A-Z]).*[a-z0-9(@#$%*+-_.)]{8,}$", passward);
		 if(passWard==true)
			 System.out.println("Enterd Passward are valid");
		 else
			 System.out.println("Enterd Passward are not valid");
	 }
	 /*
	  * Display Output
	  */
	     static  void display(String fName) {
		 
		 boolean pattern =Pattern.matches("[A-Z]{1}[a-z]{2}", fName);
		    if(pattern==true)
		    {
		    	System.out.println("'"+fName+"'"+" is a valid Name.");
		    }
		    else
		    {
		    	System.out.println("'"+fName+"'"+" is a not valid Name.");
		    }
		  }
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
		
		String uFname=fname();
		String uLname=lname();
		String uGmail=eGmail();
		String uMnumber=mobileNumber();
		String uPassward=passWard();
		System.out.println("First Name :: ");
		display(uFname);
		System.out.println("Last Name :: ");
		display(uLname);
		gmailDisplay(uGmail);
		displayMobileNumber(uMnumber);
		passWardDisplay(uPassward);
		
	}
}
