package Pekan6_2511531004;

public class InsertDLL_2511531004 {
	// menambahkan node di awal dll
	
	static NodeDLL_2511531004 insertBegin(NodeDLL_2511531004 head_1004, int data_1004) {
		// buat node baru
		NodeDLL_2511531004 new_node = new NodeDLL_2511531004 (data_1004);
		// jadikan pointer nextnya head
		new_node.next_1004 = head_1004;
		// jadikan pointer prev head ke new node
		if (head_1004 != null) {
			head_1004.prev_1004 = new_node;
		}
		return new_node;
		
	}
	
	// fungsi untuk menambahkan node di akhir
	public static NodeDLL_2511531004 insertEnd(NodeDLL_2511531004 head_1004 , int newData_1004) {
		// buat node baru
		NodeDLL_2511531004 newNode = new NodeDLL_2511531004 (newData_1004) ;
		// jika dll null di jadikan head
		if (head_1004 == null) {
			head_1004 = newNode;
		}
		
		else {
			NodeDLL_2511531004 curr = head_1004;
			while (curr.next_1004 != null) {
				curr = curr.next_1004;
			}
			curr.next_1004 = newNode;
			newNode.prev_1004 = curr;
		}
		return head_1004;
	}
	
	// fungsi untuk menambahkan node di posisi tertentu
	public static NodeDLL_2511531004 insertAtPosition (NodeDLL_2511531004 head_1004, int pos_1004, int new_data_1004) {
		// buat node baru
		NodeDLL_2511531004 new_node = new NodeDLL_2511531004 (new_data_1004);
		if ( pos_1004 == 1) {
			new_node.next_1004 = head_1004;
			if (head_1004 != null ) {
				head_1004.prev_1004 = new_node; }
			head_1004 = new_node;
			return head_1004; }
		
		NodeDLL_2511531004 curr = head_1004;
	
	for (int i = 1; i < pos_1004 - 1 && curr != null; ++i) {
		curr = curr.next_1004;
		
		} 
	
	if (curr == null) {
		System.out.println("Posisi tidak ada");
		return head_1004; }
	new_node.prev_1004 = curr;
	new_node.next_1004 = curr.next_1004;
	curr.next_1004 = new_node;

	if (new_node.next_1004 != null) {
		new_node.next_1004.prev_1004 = new_node; }
	
	return head_1004;
	

	}
	
	public static void printList_2511531004 (NodeDLL_2511531004 head_1004) {
		NodeDLL_2511531004 curr = head_1004;
		while (curr != null) {
			System.out.print(curr.data_1004 + " <---> ");
			curr = curr.next_1004;
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		// membuat dll
		NodeDLL_2511531004 head_1004 = new NodeDLL_2511531004 (2);
		head_1004.next_1004 = new NodeDLL_2511531004 (3);
		head_1004.next_1004.prev_1004 = head_1004;
		head_1004.next_1004.next_1004 = new NodeDLL_2511531004 (5);
		head_1004.next_1004.next_1004.prev_1004 = head_1004;
		
		// cetak DLL awal
		System.out.print("DLL AWAL : ");
		printList_2511531004(head_1004);
		
		// tambah 1 di awal
		head_1004 = insertBegin(head_1004,1);
		System.out.print("Simpul ditambah 1 di awal : ");
		printList_2511531004(head_1004);
		
		// tambah 6 diakhir
		System.out.print("simpul 6 di tambah di akhir : ");
		int data_1004 = 6;
		head_1004 = insertEnd (head_1004, data_1004);
		printList_2511531004 (head_1004);
		
		// menambah node 4 di posisi 4
		System.out.print("tambah node 4 di posisi 4 : ");
		
		int data2_1004 = 4;
		int pos_1004 = 4;
		head_1004 = insertAtPosition(head_1004 , pos_1004, data2_1004);
		printList_2511531004 (head_1004);
		
	}
	 
	
	
}
