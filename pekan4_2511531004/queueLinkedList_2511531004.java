package pekan4_2511531004;
import java.util.Queue;
import java.util.LinkedList;

public class queueLinkedList_2511531004 {
	public static void main(String[] args) {
		
		Queue<Integer> q_1004 = new LinkedList<> ();
		// menambah elemen ke dalam antrian
		
		for(int i = 0 ; i < 6 ; i ++) 
			q_1004.add(i);
		
		// menampilkan ke dalam antrian 
		System.out.println("elemen antrian " + q_1004);
		//untuk menghapus kepala antrian 
		int hapus_1004 = q_1004.remove();
		System.out.println("elemen yang dihpaus " + hapus_1004);
		System.out.println(q_1004);
		//untuk melihat antrian di depan
		int depan = q_1004.peek();
		System.out.println("elemen terdepan " + depan);
		
		int banyak = q_1004.size();
		System.out.println("size antrian " + banyak);
		
	}

}
