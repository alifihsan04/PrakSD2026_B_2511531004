package pekan3_2511531004;
import java.util.Stack;
import java.util.Scanner;

public class stackPostflix_2511531004 {
	public static int postfixEvaluate_2511531004(String expression) {
		Stack<Integer> s = new Stack<Integer> ();
		Scanner input = new Scanner(expression);
		
		while (input.hasNext()) {
			if(input.hasNextInt()) { // an operand integer
				s.push(input.nextInt()) ;
				
			} else {
				String operator = input.next();
				int operand2 = s.pop();
				int operand1 = s.pop();
				if (operator.equals("+")) {
					s.push(operand1 + operand2) ;
					
				} else if ( operator.equals("-")) {
					s.push(operand1 - operand2);
					
				} else if ( operator.equals("*")) {
					s.push(operand1 * operand2);
				} else {
					s.push(operand1 / operand2) ;
				}
				
				
			}
			
		
			
		}
		input.close();
		return s.pop () ;
	
	}

	
	public static void main (String[] args ) {
	
		
		System.out.println("Hasil dari post fix = "  + postfixEvaluate_2511531004 (" 5 2 4 * + 7 -")  );
	}
	 
	

}
