package Pekan9_2511531004;

public class BTreeDriver_2511531004 {
	public static void main(String [] args) {
		// membuat pohon
		
		BTree_2511531004 tree_1004 = new BTree_2511531004() ;
		System.out.print("Jumlah simpul awal pohon : ");
		System.out.println(tree_1004.countNodes_2511531004());
		
		Node_2511531004 root_1004 = new Node_2511531004 (1);
		// menambahkan simpul data 
		tree_1004.setRoot_2511531004(root_1004);
		System.out.print("Jumlah simpul jika hanya ada root : ");
		System.out.println(tree_1004.countNodes_2511531004());
		Node_2511531004 node2 = new Node_2511531004 (2);
		Node_2511531004 node3 = new Node_2511531004 (3);
		Node_2511531004 node4 = new Node_2511531004 (4);
		Node_2511531004 node5 = new Node_2511531004 (5);
		Node_2511531004 node6 = new Node_2511531004 (6);
		Node_2511531004 node7 = new Node_2511531004 (7);
		Node_2511531004 node8 = new Node_2511531004 (8);
		Node_2511531004 node9 = new Node_2511531004 (9);
		
		root_1004.setLeft_2511531004(node2);
		node2.setRight_2511531004(node4);
		node2.setRight_2511531004 (node5);
		node4.setRight_2511531004(node8);
		root_1004.setRight_2511531004(node3);
		node3.setLeft_2511531004(node6);
		node3.setRight_2511531004(node7);
		node6.setLeft_2511531004 (node9);
		
		//set root 
		tree_1004.setCurrent_2511531004(tree_1004.getRoot_2511531004());
		System.out.print("Menampilkan simpul terakhir : ");
		System.out.println(tree_1004.getCurrent_2511531004().getData_2511531004());
		System.out.print ("jumlah simpul ; setelah simpul 7 ditambahkan : ");
		System.out.println(tree_1004.countNodes_2511531004());
		System.out.print("InOrder : ");
		tree_1004.printInorder_2511531004();
		System.out.print("\nPostOrder : ");
		tree_1004.printPostorder_2511531004();
		System.out.println("\nMenampilkan simpul dalam bentuk pohon");
		tree_1004.print_2511531004();
		
		
		
		
		
	
	
	
	}
	

}
