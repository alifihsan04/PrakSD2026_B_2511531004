package pekan1_2511531004;
import java.util.Scanner;
public class jamDriver2_2511531004 {

	public static void main (String [] args ) {
		
		Scanner input = new Scanner(System.in) ;
		System.out.println("==== Program Driver Objek jam ====");
		
		// 1. input jam pertama 
		System.out.println("\n ---- input jam 1 ----");
		jam_2511531004 j1 = buatJamDariInput(input);
		
		// 2. input jam kedua
		System.out.println("\n ---- input jam 2 ----");
		jam_2511531004 j2 = buatJamDariInput(input);
		
		// 3. menampilkan data 
		System.out.println("\n ---- hasil operasi ----");
		System.out.println("jam 1 (String) : "  + j1.toString());
		System.out.println("jam 2 (String) : " + j2.toString());
		System.out.println("jam 1 dalam detik : " + j1.toSeconds());
		System.out.println("Jam 2 dalam detik : " + j2.toSeconds());
		
		
		// 4. menampilkan relasional (perbandingan)
		int perbandingan = j1.compareTo(j2) ;
		if (perbandingan > 0 ) {
			System.out.println("Status :  jam 1 lebih lambat (setelah) jam 2 ");
		} else if (perbandingan < 0) {
			System.out.println("Status : jam 1 lebih awal (sebelum) jam 2");
		} else {
			System.out.println("Status : jam 1 dan jam 2 sama sama persisi");
		
	
		}
		
		
		// 5. operasi aritmatika 
		System.out.println("Durasi (j1 ke j2) : " + jam_2511531004.durasiDetik(j1, j2) + "detik");
		jam_2511531004 jNext = j1.nextSecond();
		System.out.println("jam 1 detik berikutnya : " + jNext);
		
		jam_2511531004 jPrev = j1.prevSecond();
		System.out.println("Jam 1 detik sebelumnya : " + jPrev);
		
		
		// 6. operasi penjumlahan jam 
		jam_2511531004 jHasilPlus = j1.plus(j2);
		System.out.println("Hasil J1 + J2 : " + jHasilPlus);
		
		
		input.close();
	}
	
	public static jam_2511531004 buatJamDariInput(Scanner input ) {
		int h, m, s ;
		while ( true ) {
			System.out.println("Masukkan jam ( 0-23) : " );
			h = input.nextInt();
			System.out.println("Masukkan Menit (0-59) : ");
			m = input.nextInt();
			System.out.println("Masukkan Detik (0-59) : " );
			s = input.nextInt();
			
			
			
			// memanggil method static isValid dari kelas jam_2511531004
			if (jam_2511531004.isValid(h, m, s)) {
				return new jam_2511531004 (h,m,s);
				
			} else {
				System.out.println("[error] input tidak valid silahkan ulangi. \n");
				}
			}
		}
		 
	}

