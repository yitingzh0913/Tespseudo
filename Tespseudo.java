import java.util.*;

/* Creating a project that turns a simple Java program into pseudocode */

public class Tespseudo {

	public void triangleCode() {
		System.out.println("for (int row = 0; row < 6; row++) {");
		System.out.println("\tfor (int spaces = 6 - row; spaces > 1; j--) {");
		System.out.println("\tSystem.out.print(\" \")\n\t}\n");
		System.out.println("\tfor (int spaces = 0; spaces <= row; spaces++");
		System.out.println("\tSystem.out.print(\"*\")\n\t}\n");
		System.out.println("\tSystem.out.println()\n}");
	}
	
	public void rectangleCode() {
		System.out.println("for (int row = 0; row <= 3; row++) {");
		System.out.println("\tfor (int column = 0; column <= 4; column++) {");
		System.out.println("\tSystem.out.println(\"*\")");
	}
	
	public void trianglePseudocode() {
		System.out.println("\nfor row starting at 0 to row less 6, increment row by 1");
		System.out.println("for spaces starting at (6 - row) to spaces less than 1, decrement spaces by 1");
		System.out.println("print \" \"");
		System.out.println("for spaces starting at 0 to spaces less than or equal to row, increment spaces by 1");
		System.out.println("print \"*\"");
		System.out.println("print \"\"");
		
	}
	
	public void rectanglePseudocode() {
		System.out.println("\nfor row starting at 0 to row less than or equal to 3, increment row by 1");
		System.out.println("for column starting at 0 to column less than or equal to 4, increment column by 1");
		System.out.println("print \"*\"");
	}
	
	public ArrayList<String> codeSplit(String code) {
		ArrayList<String> parsedCode = new ArrayList<String>();
		StringTokenizer tokens = new StringTokenizer(code);
		
		while (tokens.hasMoreTokens()) {
			parsedCode.add(tokens.nextToken());
		}
		
		return parsedCode;
	}
	
	public void codeProcessor(ArrayList<String> parsedCode) {
		if (parsedCode.get(0).equals("for")) {
			loopPseudocode(parsedCode);
			
		} else if (parsedCode.get(0).equals("int") || parsedCode.get(0).equals("double") ||
				parsedCode.get(0).equals("String") || parsedCode.get(0).equals("char") ||
				parsedCode.get(0).equals("float") || parsedCode.get(0).equals("boolean")) {
			declarationPseudocode(parsedCode);
			
			
		} else if (parsedCode.get(1).equals("+") || parsedCode.get(1).equals("-") ||
				parsedCode.get(1).equals("*") || parsedCode.get(1).equals("/") ||
				parsedCode.get(1).equals("!") || parsedCode.get(1).equals("&&") ||
				parsedCode.get(1).equals("||")) {
			operatorPseudocode(parsedCode);
		} else if (parsedCode.get(0).equals("System.out.println") ||
				parsedCode.get(0).equals("System.out.print")) {
			printPseudocode(parsedCode);
		}
			
	}
	
	public String processEquality(String equality) {
		if(equality.equals("<=")) {
			return "less than or equal to";
		} else if (equality.equals("<")) {
			return "less than";
		} else if (equality.equals(">=")) {
			return "greater than or equal to";
		} else if (equality.equals(">")) {
			return ("greater than");
		} else if (equality.equals("==")) {
			return "equals";
		} else {
			return "";
		}
	}
	
	public String processOperator(String operator) {
		if (operator.equals("+")) {
			return "plus";
		} else if (operator.equals("-")) {
			return "minus";
		} else if (operator.equals("*")) {
			return "times";
		} else if (operator.equals("/")) {
			return "divided by";
		} else if (operator.equals("!")) {
			return "not equal to";
		} else if (operator.equals("&&")) {
			return "and";
		} else if (operator.equals("||")) {
			return "or";
		}
		else {
			return "";
		}
	}
	 
	public void printPseudocode(ArrayList<String> parsedCode) {
		String pseudocode = new String("");
		
		// System.out.println ( "hi" )
		// [System.out.println, (, "hi", )]
		pseudocode = "print " + parsedCode.get(2);
		System.out.println(pseudocode);
	}
	
	public void operatorPseudocode(ArrayList<String> parsedCode) {
		String pseudocode = new String("");
		
		// a + b
		// [a, +, b]
		pseudocode = parsedCode.get(0) + " " + processOperator(parsedCode.get(1) + " " + parsedCode.get(2));
		System.out.println(pseudocode);
	}
	
	public void declarationPseudocode(ArrayList<String> parsedCode) {
		String pseudocode = new String("");
		
		// int i OR int i = 4
		// [int, i] OR [int, i, =, 4]
		if (parsedCode.get(2).equals("=")) {
			pseudocode = "declare " + parsedCode.get(0) + " " + parsedCode.get(1) + " to " +
					parsedCode.get(3); 
		} else {
			pseudocode = "declare " + parsedCode.get(0) + " " + parsedCode.get(1);
		}
		
		System.out.println(pseudocode);
	}
	
	
	public void loopPseudocode(ArrayList<String> parsedCode) {
		String pseudocode = new String("");
		
		// for ( int i = 0 ; i < 2 ; i++ )
		// [for, (, int, i, =, 0, ;, i, <=, 6, ;, i++, )]
		if (parsedCode.get(0).equals("for")) {
			pseudocode = parsedCode.get(0) + " " + parsedCode.get(3) + " starting at " + parsedCode.get(5) + 
					" to " + parsedCode.get(3) + " " + processEquality(parsedCode.get(8)) + " " + parsedCode.get(9) +
					", increment " + parsedCode.get(3) + " by 1";
			
			System.out.println(pseudocode);	
		}
	}
}