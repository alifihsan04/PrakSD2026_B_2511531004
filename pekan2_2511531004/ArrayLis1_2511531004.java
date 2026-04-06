package pekan2_2511531004;
import java.util.ArrayList;
public class ArrayLis1_2511531004 {

	public static void main(String[] args) {
		
		// size of the array list
		int n = 5;
		// declarating the array list 
		ArrayList<Integer> arrli = new ArrayList<Integer> (n);
		// appending new eleemn
		for ( int i = 1; i <= n; i++) 
			arrli.add(i);
		//printing element
		System.out.println(arrli);
		// remove element at index 3
		arrli.remove(3);
		// displaying at arrayList 
		System.out.println(arrli);
		
		//printing element one by one 
		for ( int i = 0; i < arrli.size(); i++)
			System.out.println(arrli.get(i) + " ");
		
		
		
		
	}
	}


