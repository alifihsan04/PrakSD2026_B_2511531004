package Pekan6_2511531004;

public class penulusuranDLL_2511531004 {
	
	// fungsi penelusuran maju
	static void forwardTraversal_2511531004 (NodeDLL_2511531004 head_1004 ) {
		// memulai penelusuran dari head
		NodeDLL_2511531004 curr = head_1004;
		//  lanjutkan sampai akhir
		while ( curr != null) {
			// print data
			System.out.print(curr.data_1004 + " <----> ");
			// pindah ke node berikutnya
			curr = curr.next_1004;
		}
		System.out.println();
	}
	
	// fungsi untuk penelusuran mundur 
	
	static void backwardTraversal_2511531004 (NodeDLL_2511531004  tail_1004) {
		// mulai dari akhir
		NodeDLL_2511531004 curr = tail_1004;
		// lanjut sampai head
		while (curr != null) {
			// cetak data
			System.out.print(curr.data_1004 + " <----> ");
			// pindah ke node sebelumnya 
			curr = curr.prev_1004;
		}
		// cetak spasi 
		System.out.println();
	}
	 
	
	public static void main(String[] args ) {
		// cetak dll
		NodeDLL_2511531004  head_1004 = new NodeDLL_2511531004 (1);
		NodeDLL_2511531004 second_1004 = new NodeDLL_2511531004 (2);
		NodeDLL_2511531004 third_1004 = new NodeDLL_2511531004 (3);
		
		
		head_1004.next_1004 = second_1004;
		second_1004.prev_1004 = head_1004;
		second_1004.next_1004 = third_1004;
		third_1004.prev_1004 = second_1004;
		
		
		System.out.println("Penelusuran maju : ");
		forwardTraversal_2511531004(head_1004);
		
		System.out.println("Penelusuran mundur : ");
		backwardTraversal_2511531004 (third_1004);
	}
	
	
	
 }
