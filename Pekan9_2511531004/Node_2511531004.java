package Pekan9_2511531004;

public class Node_2511531004 {
    int data_1004;
    Node_2511531004 left_1004;
    Node_2511531004 right_1004;
    
    public Node_2511531004 (int data_1004) {
        this.data_1004 = data_1004;
        left_1004 = null;
        right_1004 = null;
    }
    public void setLeft_2511531004 (Node_2511531004 node_1004) {
        if (left_1004 == null)
            left_1004 = node_1004;
    }
    public void setRight_2511531004 (Node_2511531004 node_1004) {
        if (right_1004 == null)
            right_1004 = node_1004;
    }
    public Node_2511531004 getLeft_2511531004 () {
        return left_1004;
    }
    public Node_2511531004 getRight_2511531004 () {
        return right_1004;
    }
    public int getData_2511531004 () { 
        return data_1004;
    }
    
    public void setData_2511531004 (int data_1004) {
        this.data_1004 = data_1004;
    }
    
    void printPreorder_2511531004 (Node_2511531004 node_1004) {
        if (node_1004 == null)
            return;
        System.out.print(node_1004.data_1004 + " ");
        printPreorder_2511531004 (node_1004.left_1004);
        printPreorder_2511531004 (node_1004.right_1004);
    }
    
    void printPostorder_2511531004 (Node_2511531004 node_1004) {
        if (node_1004 == null)
            return;
        printPostorder_2511531004 (node_1004.left_1004);
        printPostorder_2511531004 (node_1004.right_1004);
        System.out.print(node_1004.data_1004 + " ");
    }
    
    void printInorder_2511531004 (Node_2511531004 node_1004) {
        if (node_1004 == null)
            return;
        printInorder_2511531004 (node_1004.left_1004);
        System.out.print(node_1004.data_1004 + " ");
        printInorder_2511531004 (node_1004.right_1004);
    }
    
    public String print_2511531004() {
        return this.print_2511531004("", true, "");
    }
    
    public String print_2511531004(String prefix_1004, boolean isTail_1004, String sb_1004) {
        if (right_1004 != null) {
            right_1004.print_2511531004(prefix_1004 + (isTail_1004 ? "|   " : "   "), false, sb_1004);
        }
        System.out.println(prefix_1004 + (isTail_1004 ? "\\--" : "/--") + data_1004);
        if (left_1004 != null) {
            left_1004.print_2511531004(prefix_1004 + (isTail_1004 ? "   " : "|   "), true, sb_1004);
        }
        return sb_1004;
    }
}
