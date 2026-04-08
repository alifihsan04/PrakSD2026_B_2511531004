package pekan3_2511531004;
public class stackArray_2511531004 {
	static final int  Max = 1000;

	int top;
	int a[] =  new int[Max];
	
	boolean isEmpty() {
		
		return (top < 0 );
	}

	stackArray_2511531004()
	{
		top = -1;
	}
	
	boolean push_2511531004 (int x) {
		
		if ( top >= (Max - 1 ) ) {
			System.out.println("Stack overflow");
			return false;
		}
		else {
			a [++top] = x;
			System.out.println( x + " dimasukkan dalam stack");
			return true;
		}
 	}
	
	int pop_2511531004 () {
		if (top < 0) {
			System.out.println("Stack underflow");
			return 0;
			
		}
		else {
			int x = a[top--] ;
			return x;
		}
	}
	
		int peek_2511531004 () {
			if (top < 0) {
				System.out.println("Stack overflow"); 
				return 0;
			}
			else {
				int x = a[top];
				return x;
			}
		}
	
		void print_2511531004 () {
			for ( int i = top; i>-1; i-- ) {
				System.out.print(" " + a[i]);
			}
		}
		
}


