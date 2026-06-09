package Pekan9_2511531004;

public class BTree_2511531004 {
	private Node_2511531004 root_1004;
	private Node_2511531004 currentNode;
	
	public BTree_2511531004 () {
		root_1004 = null;
	}
	
	public boolean search (int data_1004) {
		return search (root_1004, data_1004);
	}
	
	private boolean search (Node_2511531004 node, int data_1004) {
		if (node.getData_2511531004() == data_1004) 
			return true;
		if(node.getLeft_2511531004() != null )
			if (search (node.getLeft_2511531004() , data_1004))
				return true;
		if (node.getRight_2511531004() != null )
			if (search (node.getRight_2511531004() , data_1004))
				return true;
		return false;
	}
	
	public void printInorder_2511531004() {
		root_1004.printInorder_2511531004(root_1004);
	}
	public void printPreorder_2511531004() {
		root_1004.printPreorder_2511531004(root_1004) ;
	}
	public void printPostorder_2511531004() {
		root_1004.printPostorder_2511531004(root_1004);
	}
	public Node_2511531004 getRoot_2511531004() {
		return root_1004;
	}
	
	public boolean isEmpty_2511531004 () {
		return root_1004 == null;
	}
	
	public int countNodes_2511531004 () {
		return countNodes_2511531004 (root_1004);
	}
	
	private int countNodes_2511531004 (Node_2511531004 node_1004) {
		int count = 1;
		if (node_1004 == null) {
			return 0;
		}
		else {
			count += countNodes_2511531004 (node_1004.getLeft_2511531004());
			count += countNodes_2511531004 (node_1004.getRight_2511531004());
			return count;
		}
	}
	
	public void print_2511531004 () {
		root_1004.print_2511531004 () ;		
	}
	
	public Node_2511531004 getCurrent_2511531004() {
		return currentNode;
	}
	public void setCurrent_2511531004 (Node_2511531004 node_1004) {
		this.currentNode = node_1004;
	}
	
	public void setRoot_2511531004 (Node_2511531004 root_1004) {
		this.root_1004 = root_1004;
	}
	
	
}