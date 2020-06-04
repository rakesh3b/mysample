package myCode;

import java.util.Scanner;

public class EqualsTest {
	
	public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the required String: ");
	      String str = sc.next();
	      System.out.println("Enter the required String to compare: ");
	      String ch = sc.next();
	      //Invoking the index of method
	    
	      if(ch.equals(str)) {
	         System.out.println(" Strings Matched");
	      } else {
	         System.out.println("Strings did not Matched");
	      }
	   }
	}


