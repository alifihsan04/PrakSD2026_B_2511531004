package Pekan6_2511531004;

public class hapusDLL_2511531004 {
// fungsi untuk menghapus node awal
	public static NodeDLL_2511531004 deleteHead_2511531004 (NodeDLL_2511531004 head_1004) {
		if (head_1004 == null) {
			return null; }
		
		head_1004 =  head_1004.next_1004;
		if (head_1004 != null) {
			head_1004.prev_1004 = null; }
		
		return head_1004;
	
	}
	
	// fungsi untuk mengahpus di akhir
	public static NodeDLL_2511531004 deleteLast_2511531004 (NodeDLL_2511531004 head_1004) {
		if (head_1004 == null ) {
			return null; }
		
		if (head_1004.next_1004 == null ) {
			return null; }
		NodeDLL_2511531004 curr = head_1004;
		
		while (curr.next_1004 != null ) {
			curr = curr.next_1004;
		}
		
		// updating pointer previous node 
		if (curr.prev_1004 != null ) {
			curr.prev_1004.next_1004 = null ; }
		return head_1004;
	}
	
	
	// fungsi untuk menghapus node posisi tertentu 
	public static NodeDLL_2511531004 delPos_2511531004 (NodeDLL_2511531004 head_1004 , int pos_1004) {
		// jika dll kosong
		if (head_1004 == null ) {
			return head_1004;
		}
		NodeDLL_2511531004 curr = head_1004;
		// telusuri sampai ke node yang akan dihapus
		for (int i = 1; curr != null && i < pos_1004; ++ i) {
			curr = curr.next_1004;
		}
		// jika posisi tidak ditemukan 
		if (curr == null ) {
			return head_1004;
		}
		
		//update poinnter 
		if (curr.prev_1004 != null ) {
			curr.prev_1004.next_1004 = curr.next_1004;
		}
		
		if ( curr.next_1004 != null ) {
			curr.next_1004.prev_1004 = curr.prev_1004 ;
		}
		
		// jika yang dihapus head
		if (head_1004 == curr ) {
			head_1004 = curr.next_1004;
		}
		return head_1004;
		
	}
	
	// fungsi untuk mencetak dll
	public static void printList_2511531004 (NodeDLL_2511531004 head_1004 ) {
		NodeDLL_2511531004 curr = head_1004;
		while ( curr != null ) {
			System.out.print(curr.data_1004 +  " ");
			curr = curr.next_1004;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// buat sebauh dll
		NodeDLL_2511531004 head_1004 = new NodeDLL_2511531004 (1);
		head_1004.next_1004 = new NodeDLL_2511531004 (2);
		head_1004 .next_1004.prev_1004 = head_1004;
		head_1004.next_1004.next_1004 = new NodeDLL_2511531004 (3);
		head_1004.next_1004.next_1004.prev_1004 = head_1004.next_1004;
		head_1004.next_1004.next_1004.next_1004 = new NodeDLL_2511531004 (4) ;
		head_1004.next_1004.next_1004.next_1004.prev_1004 = head_1004.next_1004.next_1004;
		head_1004.next_1004.next_1004.next_1004.next_1004 = new NodeDLL_2511531004 (5);
		head_1004.next_1004.next_1004.next_1004.next_1004.prev_1004 = head_1004.next_1004.next_1004.next_1004;
		
		System.out.print("DLL diawali : ");
		printList_2511531004 (head_1004);
		
		System.out.print("setelah head dihapus : ");
		head_1004 = deleteHead_2511531004(head_1004);
		printList_2511531004 (head_1004);
		
		System.out.print("Setelah node terakhir di hapus : ");
		head_1004 = deleteLast_2511531004 (head_1004);
		printList_2511531004 (head_1004);
		
		System.out.print("Menghapus node ke 2 : ");
		head_1004 = delPos_2511531004 (head_1004, 2);
		printList_2511531004 (head_1004);
		
				

		
	}
	
	

	
}
