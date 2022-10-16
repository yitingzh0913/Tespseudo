/* 
 * Testpseudo
 * Creating a project that turns a simple Java program into pseudocode :)
 */

import java.util.*;
import java.io.*;

public class TespseudoDriver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Tespseudo myTespseudo = new Tespseudo();
		
		String option = new String("");
		int option_int;
		
		String userCode = new String("");
		
		System.out.println("========== Welcome to Testpseudo, a program to translate simple Java code into pseudocode ==========");
		//System.out.println("========== Welcome to Testpseudo, a program to translate simple Java code into pseudocode ==========");
		System.out.println("\tOptions: ");
		System.out.println("\t  1. Drawing a triangle (sample code)");
		System.out.println("\t  2. Drawing a rectangle (sample code)");
		System.out.println("\t  3. Enter a line of your own code (user code)");
		System.out.println("\t  4. Exit program");
		
		do {
			option = "";
			System.out.print("\tEnter an option (1 - 4): " + option);
			option = scan.nextLine();
			
			if (!option.equals("1") && !option.equals("2") && !option.equals("3") && !option.equals("4")) {
				System.out.println("\tPlease try again");
			}
		} while (!option.equals("1") && !option.equals("2") && !option.equals("3") && !option.equals("4"));
		
		option_int = Integer.parseInt(option);
		//System.out.println(option_int);
		
		switch(option_int) {
			case 1:
				System.out.println("========== Triangle Code ==========\n");
				myTespseudo.triangleCode();
			
				System.out.println("\n========== Triangle Pseudocode ==========");
				myTespseudo.trianglePseudocode();
			break;
			
			case 2:
				System.out.println("========== Rectangle Code ==========\n");
				myTespseudo.rectangleCode();
			
				System.out.println("\n========== Rectangle Pseudocode ==========");
				myTespseudo.rectanglePseudocode();
			break;
			
			case 3:
				System.out.println("========== User Code ==========\n");
				System.out.print("[LINE OF CODE]: " + userCode);
				userCode = scan.nextLine();
			
				System.out.println("\n\n========== User Pseudocode ==========");
				ArrayList<String> array = myTespseudo.codeSplit(userCode);
				myTespseudo.codeProcessor(array);				
			break;
				
			case 4:
				System.out.print("Exiting program...");
				return;
		}
		
		
	}
}