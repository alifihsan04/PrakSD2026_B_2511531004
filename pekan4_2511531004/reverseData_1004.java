package pekan4_2511531004;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseData_1004 {
	public static void main(String[] args) {
		Queue<Integer> q_1004 = new LinkedList<Integer> ();
		q_1004.add(1);
		q_1004.add(2);
		q_1004.add(3);
		System.out.println("Sebelum reverse " + q_1004 );
		Stack<Integer> s_1004 = new Stack<Integer> () ;
		while (!q_1004.isEmpty()) {
			s_1004.push(q_1004.remove() );
		}
		while (!s_1004.isEmpty()) {
			q_1004.add(s_1004.pop());
		}
		
		
		System.out.println("data sesudah di reverse " + q_1004);
	}

}
