package pekan4_2511531004;

public class queueArrayDriver_2511531004 {

	public static void main(String[] args) {
		queueArray_2511531004 queue = new queueArray_2511531004 (1000);
		queue.enqueue_2511531004(10);
		queue.enqueue_2511531004(20);
		queue.enqueue_2511531004(30);
		queue.enqueue_2511531004(40);
		System.out.println("item di depan " + queue.front_1004 () );
		System.out.println("item di belakang " + queue.rear_1004() );
		System.out.println("tampilkan queue");
		queue.display_2511531004();
		System.out.println();
		System.out.println(queue.dequeue_1004() + " dihapus dari queue");
		System.out.println("item di depan " + queue.front_1004 () );
		System.out.println("item di belakang " + queue.rear_1004() );
		System.out.println("tampilkan queue setelah satu data dihapus");
		queue.display_2511531004();
		 
		
		
	}

}
