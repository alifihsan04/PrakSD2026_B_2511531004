package pekan4_2511531004;

public class queueArray_2511531004 {
	int front_1004,rear_1004,size_1004;
	int capacity_1004;
	int array_1004[];
	
	public queueArray_2511531004(int capacity) {
		this.capacity_1004 = capacity;
		front_1004 = this.size_1004 = 0;
		rear_1004 = capacity - 1;
		array_1004 = new int [this.capacity_1004];
		
	}
	
	boolean isFull_2511531004 (queueArray_2511531004 queue) {
		return (queue.size_1004 == queue.capacity_1004) ;
	
	}
	
	boolean isEmpty_2511531004 (queueArray_2511531004 queue) {
		return (queue.size_1004 == 0) ;
		
	}
	
	void enqueue_2511531004 ( int item ) {
		if (isFull_2511531004 (this)) 
			return ;
		this.rear_1004 = (this.rear_1004 + 1 ) % this.capacity_1004;
		this.array_1004 [this.rear_1004] = item;
		this.size_1004 = this.size_1004 + 1;
		System.out.println(item + " enqueued to queue");
	}
	int dequeue_1004 () {
		if (isEmpty_2511531004 (this))
			return Integer.MIN_VALUE;
		int item = this.array_1004[this.front_1004];
		this.front_1004 = (this.front_1004 + 1 )  % this.capacity_1004;
		this.size_1004 = this.size_1004 - 1;
		return item;		
	}
	int front_1004() {
		if(isEmpty_2511531004(this) )
		return Integer.MIN_VALUE;
		
		return this.array_1004[this.front_1004];
		
	}
	int rear_1004() {
		if (isEmpty_2511531004(this))
			return Integer.MIN_VALUE;
		return this.array_1004 [this.rear_1004];
			
	}
	// mencetak elemen antrian
	void display_2511531004 () {
		int i_1004;
		if ( front_1004 == rear_1004) {
			System.out.println("\nAntrian kosong\n");
			return;
		}
		// kunjungi dari belakang dan cetak
		for (i_1004 = front_1004; i_1004 < rear_1004; i_1004++) {
			System.out.printf(" %d <-- " , array_1004[i_1004]);
		}
		return;
	}

}
