package pekan3_2511531004;
import java.util.ArrayList;

class siswa_2511531004 {
	String nama;
	int nim;
	
	
	public siswa_2511531004 (String nama, int nim ) {
		this.nama = nama;
		this.nim = nim;
	}
	
	@Override
	public String toString() {
		return "Nim : " + nim + ", Nama : " + nama;
	}
	
	
}
	



public class siswaStack_2511531004 {
	private ArrayList<siswa_2511531004> stack;
	
	
	public siswaStack_2511531004 () {
		stack = new ArrayList<> ();
	}
	
	
	public void push(siswa_2511531004 mhs) {
		stack.add(mhs);
	}

	
	public siswa_2511531004 pop() {
		if (!isEmpty ()) {
			return stack.remove(stack.size() - 1) ;
			
		}
		return null;
	}
	
	public siswa_2511531004 peek() {
		if (!isEmpty ()) {
			return stack.get(stack.size() -1 ) ;
		}
		
		return null;
		
	}
	
	
	public boolean isEmpty() {
		return stack.isEmpty() ;
	}
	
	public void tampilkanSiswa_2511531004 () {
		for ( int i = stack.size() - 1 ; 1>= 0; i++) {
			System.out.println(stack.get(i));
		}
	}
	
	public void main(String[] args) {
		siswaStack_2511531004 studentStack = new siswaStack_2511531004 () ;
		
		siswa_2511531004 mhs1 = new siswa_2511531004 ("Ali" , 1);
		siswa_2511531004 mhs2 = new siswa_2511531004 ("Boby" , 2);
		siswa_2511531004 mhs3 = new siswa_2511531004 ("Charles" , 3);
		
		
		studentStack.push(mhs1);
		studentStack.push(mhs2);
		studentStack.push(mhs3);
		
		
		System.out.println("siswa ada di dalam stack");
		studentStack.tampilkanSiswa_2511531004();
		
		System.out.println("siswa teratasa " + studentStack.peek() );
		System.out.println("mengeluarkan siswa teratas dari stackk " + studentStack.pop());
		System.out.println("daftar siswa setelah di pop ");
		studentStack.tampilkanSiswa_2511531004();
		
		
		
		
		
	}
	
	
	
}




