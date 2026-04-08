package pekan3_2511531004;
import java.util.Stack;

public class nilaiMaksimum_2511531004 {

public static int max_2511531004 (Stack<Integer> s ) {
	
	Stack<Integer> backup = new Stack<Integer> ();
	int maxValue = s.pop();
	backup.push(maxValue) ;
	while( !s.isEmpty() ) {
		int next = s.pop();
		backup.push(next);
		maxValue = Math.max(maxValue, next) ;
	}
	while (!backup.isEmpty() ) {
		s.push(backup.pop())  ;
		
	}
	return maxValue;
			
}
public static void main(String[] args) {
	Stack<Integer> s = new Stack<Integer> () ;
	s.push(70);
	s.push(12);
	s.push(20);
	
	System.out.println("Isi stack      : " + s );
	System.out.println("Stack teratas  : " + s.peek());
	System.out.println("Nilai maksimum : " + max_2511531004(s));
}
}
