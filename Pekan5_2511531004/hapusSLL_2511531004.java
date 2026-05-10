package Pekan5_2511531004;

public class hapusSLL_2511531004 {
// fungsi untuk menghapus head
	public static NodeSLL_2511531004 deleteHead (NodeSLL_2511531004 head_1004) {
		// jika sll kosong
		if (head_1004 == null ) 
			return null;
		
		// pindahkan head ke node berikutnya 
		head_1004 = head_1004.next_1004;
		
		// return head baru
		return head_1004;
	}
	
	public static NodeSLL_2511531004 removeLastNode (NodeSLL_2511531004 head_1004) {
		if(head_1004 == null ) {
			return null;
		}
		
		// jika list satu node, hapus node dan return null
		if ( head_1004.next_1004 == null) {
			return null;
		}
		// temukan node terakhir kedua
		NodeSLL_2511531004 secondLast = head_1004;
		
		while (secondLast.next_1004.next_1004 != null ) {
			secondLast = secondLast.next_1004;
		}
		// hapus nnode terakhir
		secondLast.next_1004 = null;
		
		return head_1004;
	}
	
	// fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511531004 deleteNode(NodeSLL_2511531004 head_1004, int position_1004) {
		NodeSLL_2511531004 temp_1004 = head_1004;
		NodeSLL_2511531004 prev_1004 = null;
		// jika linked list null
		if(temp_1004 == null)
			return head_1004;
		
		// kasus 1 : head dihapus
		if (position_1004 == 1 ) {
			head_1004 = temp_1004.next_1004;
			return head_1004;
		}
			// kasus 2 menghapous node di tengah
			// telusuri node yang dihapus
			
			for (int i = 1; temp_1004 != null && i < position_1004; i++ ) {
				prev_1004 = temp_1004;
				temp_1004 = temp_1004.next_1004;
			}
			
			if ( temp_1004 != null ) {
				prev_1004.next_1004 = temp_1004.next_1004;
			}
			else {
				System.out.println("data tidak ada ");
			}
			return head_1004;
	}
	
			
			// fungsi mencetak sll
			public static void printList_2511531004 (NodeSLL_2511531004 head_1004) {
				NodeSLL_2511531004 curr = head_1004;
				while ( curr.next_1004 != null) {
					System.out.print(curr.data_1004 + " ----> ");
					curr = curr.next_1004;
				}
				if (curr.next_1004 == null) {
					System.out.print(curr.data_1004);
				}
				System.out.println();
			}
		
			public static void main (String[] args ) {
				
				NodeSLL_2511531004 head = new NodeSLL_2511531004 (1);
				head.next_1004 = new NodeSLL_2511531004 (2);
				head.next_1004.next_1004 = new NodeSLL_2511531004 (3);
				head.next_1004.next_1004.next_1004 = new NodeSLL_2511531004(4);
				head.next_1004.next_1004.next_1004.next_1004 = new NodeSLL_2511531004(5);
				head.next_1004.next_1004.next_1004.next_1004.next_1004 = new NodeSLL_2511531004(6);
				
				// cetak list awal
				System.out.print("list awal : ");
				printList_2511531004 (head);
				
				// hapus head 
				head = deleteHead (head) ;
				System.out.print("list setelah head di hapus : ");
				printList_2511531004 (head);
				
				// hapus node terakhir 
				head = removeLastNode (head);
				System.out.print("list setelah simpul terakhir di hapus : ");
				printList_2511531004 (head);
				
				// deleting node at position 2 
				int position = 2;
				head = deleteNode (head, position);
				
				// print list after deletd
				
				System.out.print("list setelah posisi 2 di hapus : ");
				printList_2511531004 (head);
				
				
			}
		
		
	}
	 

