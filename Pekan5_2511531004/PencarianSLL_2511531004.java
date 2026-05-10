package Pekan5_2511531004;

public class PencarianSLL_2511531004 {
	static boolean searchKey_2511531004 ( NodeSLL_2511531004 head_1004, int key_1004 ) {
		NodeSLL_2511531004 curr = head_1004;
		while ( curr != null ) {
			if(curr.data_1004 == key_1004)
				return true;
			curr = curr.next_1004;
		}
		return false;
	}

		public static void traversal_2511531004 (NodeSLL_2511531004 head_1004) {
			// mulai dari head
			NodeSLL_2511531004 curr = head_1004;
			// telusuri sampai pointer null
			while (curr != null) {
				System.out.print
				(" " + curr.data_1004 );
				curr = curr.next_1004;
			}
			System.out.println();
		}
		public static void main (String [] args) {
			NodeSLL_2511531004 head = new NodeSLL_2511531004 (14);
			head.next_1004 = new NodeSLL_2511531004 (21);
			head.next_1004.next_1004 = new NodeSLL_2511531004 (13);
			head.next_1004.next_1004.next_1004 = new NodeSLL_2511531004 (30);
			System.out.print("Penulusuran SLL : ");
			traversal_2511531004 (head);
			// data yang akan dicari
			int key_1004 = 30;
			System.out.println("cari data " + key_1004 + " = ");
			if (searchKey_2511531004 (head, key_1004) )
				System.out.print("ketemu");
				else 
					System.out.println("tidak ada");
			
			
		}
}
