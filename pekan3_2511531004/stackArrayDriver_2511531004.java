package pekan3_2511531004;

public class stackArrayDriver_2511531004 {
	public static void main(String [] args) {
		stackArray_2511531004 s = new stackArray_2511531004 () ;
		s.push_2511531004 (10) ;
		s.push_2511531004 (20);
		s.push_2511531004 (30);
	
		System.out.println(s.pop_2511531004() + " dikeluarkan dari stack");
		System.out.println("Elemen dari atas adalah : " + s.peek_2511531004() );
		System.out.print("Elemen pada stack : ");
		s.print_2511531004(); 
		
		
	}

}
