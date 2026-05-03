package Struktur_data;
import java.util.Scanner;

public class AntrianLoket_2511531004 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue_2511531004 queue_1004 = new Queue_2511531004 (5);
		int pilihan_1004;
		
		
		do {
			queue_1004.menuAntri_1004();
			System.out.println("Pilih menu : ");
			 pilihan_1004 = sc.nextInt();
			System.out.println();
			sc.nextLine();
			
			
			switch (pilihan_1004) {
			case 1 : 
				queue_1004.enqueue_2511531004(sc);
				break;
				
			case 2 : 
				queue_1004.dequeue_2511531004();
				break;
				
			case 3 :
				queue_1004.reverseAntrian_1004();
				break;
				
			case 4 :
				queue_1004.tampilkan_1004();
				break;
				
			case 5 :
			
				break;
			}
			
		} while (pilihan_1004 != 5);
			sc.close();
			
	
		
	}

}
