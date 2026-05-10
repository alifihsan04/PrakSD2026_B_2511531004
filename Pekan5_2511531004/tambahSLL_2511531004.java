package Pekan5_2511531004;

public class tambahSLL_2511531004 {
	
	public static NodeSLL_2511531004 insertAtFront_2511531004(NodeSLL_2511531004 head_1004, int value_1004) {
		NodeSLL_2511531004 new_node = new NodeSLL_2511531004 (value_1004);
		new_node.next_1004 = head_1004;
		return new_node;
		
	}
	// fungsi menambahkan node diakhir sll 
	public static NodeSLL_2511531004 insertAtEnd_2511531004 (NodeSLL_2511531004 head_1004, int value_1004) {
		// buat sebuah node dengan sebuah nilai
		NodeSLL_2511531004 newNode = new NodeSLL_2511531004 (value_1004) ;
		// jika list kosong maka node jadi head 
		if (head_1004 == null ) {
			return newNode;
		}
		
		// simpan head ke variabel sementara 
		NodeSLL_2511531004 last = head_1004;
		// telurusi node akhir
		while(last.next_1004 != null) {
			last = last.next_1004;
		}
		// ubah pointer 
		last.next_1004 = newNode;
		return head_1004;
		 
		
		}
	
	static NodeSLL_2511531004 GetNode ( int data_1004 ) {
		return new NodeSLL_2511531004(data_1004);
		
	}
	
	static NodeSLL_2511531004 insertPos_2511531004(NodeSLL_2511531004 headNode_1004, int position_1004, int value_1004) {
		NodeSLL_2511531004 head = headNode_1004;
		if(position_1004 < 1) {
			System.out.println("Invalid Position");
			if (position_1004 == 1 ) {
				NodeSLL_2511531004 new_node = new NodeSLL_2511531004 (value_1004);
				new_node.next_1004 = head;
				return new_node;
			} else {
				while (position_1004-- != 0) {
					if(position_1004 == 1 ) {
						NodeSLL_2511531004 newNode = GetNode(value_1004);
						newNode.next_1004 = headNode_1004.next_1004;
						headNode_1004.next_1004 = newNode;
						break;
					}
					headNode_1004 = headNode_1004.next_1004;
				}
				if (position_1004 != 1 ) {
				System.out.println("Posisi di luar jangkauan");
				}
					
				}
			}
		return head;
		}
	
			
			public static void printList_2511531004 (NodeSLL_2511531004 head_1004) {
				NodeSLL_2511531004 curr = head_1004;
				
				while (curr.next_1004  != null ) {
					System.out.print(curr.data_1004 + " ---> " );
					curr = curr.next_1004;
				}
				if ( curr.next_1004 == null ) {
					System.out.print(curr.data_1004);
					System.out.println();
				}
			}
		
			
		public static void main(String [] args) {
			// buat linked list 
			NodeSLL_2511531004 head = new NodeSLL_2511531004 (2);
			head.next_1004 = new NodeSLL_2511531004 (3);
			head.next_1004.next_1004 = new NodeSLL_2511531004 (5);
			head.next_1004.next_1004.next_1004 = new NodeSLL_2511531004 (6);
			
			// cetak list asli
			System.out.println("Senarai berawal dari : " );
			printList_2511531004(head);
			
			// tambahkan node baru di depan
			
			System.out.println("tambah 1 simpul di bagian depan : ");
			int data_1004 = 1;
			head = insertAtFront_2511531004 (head, data_1004);
			
			// cetak update list
			printList_2511531004 (head);
			System.out.println("tambah 1 simpul di belakang : ");
			int data2_1004 = 7;
			head = insertAtEnd_2511531004(head, data2_1004);
			
			// cetak update list 
			printList_2511531004(head);
			System.out.println("tambah 1 simpul ke data 4 : ");
			int data3_1004 = 4;
			int pos_1004 = 4;
			head = insertPos_2511531004(head, pos_1004, data3_1004);
			
			// cetak update list
			printList_2511531004 (head);
					
		}
}
