package Struktur_data;
import java.util.Scanner;

public class Queue_2511531004 {

	Scanner input = new Scanner(System.in);
	int front_1004, rear_1004, size_1004;
	int capacity_1004;
	String antrian_1004 [];

	public Queue_2511531004( int capacity_1004) {
		this.capacity_1004 = capacity_1004;
		front_1004 = this.size_1004 = 0;
		rear_1004 = capacity_1004 - 1;
		antrian_1004 = new String [this.capacity_1004];
		
	
	}
	void menuAntri_1004() {
		System.out.println("======Menu Antrian Loket Pelayanan=====");
		System.out.println("1. Tambah Pelanggan");
		System.out.println("2. Hapus pelanggan");
		System.out.println("3. Reverse antrian pelanggan");
		System.out.println("4. Tampilkan Antrian");
		System.out.println("5. Keluar");
		
	}
	
	boolean isFull_2511531004 (Queue_2511531004 queue ) {
		return (queue.size_1004 == queue.capacity_1004);
		
	}
	
	boolean isEmpty_2511531004 ( Queue_2511531004 queue ) {
		return ( queue.size_1004 == 0);
		
	}
	
	void enqueue_2511531004 (Scanner input ) {
		if (isFull_2511531004 (this) )
			
		return;
	
		this.rear_1004 = (this.rear_1004 + 1) % capacity_1004;
		System.out.println("Masukkan Nama Pelanggan : ");
		String Pelanggan_1004 = input.nextLine();
		this.antrian_1004 [this.rear_1004] = Pelanggan_1004;
		this.size_1004 = this.size_1004 + 1;
		System.out.println("data sudah dimasukkan ke dalam Queue");
	}
	
	String dequeue_2511531004 () {
		if(isEmpty_2511531004 (this)) {
			System.out.println("Antrian Kosong");
			return null;
		}
		String Pelanggan_1004 = this.antrian_1004 [this.front_1004];
		this.front_1004 = (this.front_1004 + 1 ) % this.capacity_1004;
		this.size_1004 = this.size_1004 - 1;
		System.out.println(Pelanggan_1004 + "Sudah diberikan pelayanan");
		return Pelanggan_1004;
	}
	
	public void reverseAntrian_1004 () {
		System.out.println("=====Hasil Reverse Antrian=====");
		for ( int i = 0; i < this.size_1004; i ++) {
			if ( i== (this.size_1004 / 2 ))
				break;
			String temp = this.antrian_1004 [this.front_1004 + i];
			this.antrian_1004 [this.front_1004 + i ] = this.antrian_1004 [this.rear_1004];
			this.antrian_1004 [this.rear_1004 - i] = temp; 
					
		}
		System.out.print("[");
		for ( int i = 0; i < this.size_1004; i++) {
			System.out.println(" " + this.antrian_1004[this.front_1004 + i] + " " ) ;
			
			}
		System.out.print("]");
		System.out.println();
	}
	
	public void tampilkan_1004 () {
		System.out.println("=====Tampilkan Antrian Loket=====");
		System.out.print("[");
		for ( int i = 0; i < this.size_1004; i++) {
			System.out.println(this.antrian_1004[this.front_1004 + i ]);
		}
		System.out.print("]");
		System.out.println();
	}
	
		
	
		
	
	

}
