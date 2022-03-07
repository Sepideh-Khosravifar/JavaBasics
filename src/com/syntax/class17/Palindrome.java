package com.syntax.class17;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
	
		
		        // How would you check if String is palindrome or not?
		        //Example1: aba ---> true
		        // Example2: Abbc --> false

		        String str, rev = "";
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter a string:");
		        str = sc.nextLine();

		        int length = str.length();

		        for (int i = length - 1; i >= 0; i-- )
		            rev = rev + str.charAt(i);

		        if (str.equals(rev))

		            System.out.println("true");

		        else
		            System.out.println("false");

		 
		

	}

}
