package pekan4_2511531004;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;
public class iterasiQueue_2511531004 {
	public static void main(String[] args) {
		
		Queue<String> q_1004 = new LinkedList<> () ;
		
		q_1004.add("Praktikum");
		q_1004.add("Struktur");
		q_1004.add("Data");
		q_1004.add("Dan");
		q_1004.add("Algoritma");
		Iterator<String> iterator = q_1004.iterator() ;
		while ( iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

}
