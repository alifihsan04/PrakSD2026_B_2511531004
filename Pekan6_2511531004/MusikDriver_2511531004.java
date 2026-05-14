package Pekan6_2511531004;
import java.util.Scanner;
public class MusikDriver_2511531004 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Musik_2511531004 playlist = new Musik_2511531004();
	        int pilihan;

	        do {
	            System.out.println("=== Playlist Musik NIM: 2511531004 ===");
	            System.out.println("1. Tambah Lagu");
	            System.out.println("2. Hapus Lagu Pertama");
	            System.out.println("3. Lihat Playlist (Maju)");
	            System.out.println("4. Lihat Playlist (Mundur)");
	            System.out.println("5. Cari Lagu");
	            System.out.println("6. Keluar");
	            System.out.print("Pilihan: ");
	            pilihan = sc.nextInt();
	            sc.nextLine(); // clear buffer
	            
	            switch (pilihan) {
                case 1:
                    System.out.print("Judul: ");
                    String judul = sc.nextLine();
                    System.out.print("Penyanyi: ");
                    String penyanyi = sc.nextLine();
                    playlist.tambahLagu_1004(judul, penyanyi);
                    break;
                case 2:
                    playlist.hapusLaguAwal_1004();
                    break;
                case 3:
                    playlist.tampilMaju_1004();
                    break;
                case 4:
                    playlist.tampilMundur_1004();
                    break;
                case 5:
                    System.out.print("Masukkan judul lagu: ");
                    String cari = sc.nextLine();
                    playlist.cariLagu_1004(cari);
                    break;
                case 6:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    
	            }
	        } while (pilihan != 6);
	        
	        sc.close();
	  }
	  
	}


