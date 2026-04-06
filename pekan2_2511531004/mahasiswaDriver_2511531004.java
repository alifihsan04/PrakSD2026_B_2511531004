package pekan2_2511531004;
import java.util.Scanner;
import java.util.ArrayList;

public class mahasiswaDriver_2511531004 {
	
	public static void tampilkanMenu_2511531004() {
		System.out.println("\nMenu: ");
		System.out.println("1. Tambah Mahasiswa ") ;
		System.out.println("2. Tampilkan Semua Mahasiswa");
		System.out.println("3. Hapus mahasiswa berdasarkan nim");
		System.out.println("4. Cari mahaiswa berdasarkan nim");
		System.out.println("5. keluar");
	}
	
	// method untuk tambah mahasiswa 
	public static void tambahMahasiswa_2511531004(ArrayList<mahasiswa_2511531004> list, Scanner sc) {
		System.out.print("Masukkan NIM : ");
		String nim = sc.nextLine() ;
		System.out.println("Masukkan Nama : ");
		String nama = sc.nextLine();
		System.out.println("Masukkan Prodi : ");
		String prodi = sc.nextLine();
		list.add(new mahasiswa_2511531004(nama, nim, prodi) ) ;
		System.out.println("Mahasiswa berhasil ditampilkan");
	}
		
		// method untuk menampilkan semua data 
		public static void tampilkanSemuaMahasiswa_2511531004(ArrayList<mahasiswa_2511531004> list) {
			if (list.isEmpty() ) {
				System.out.println("Daftar mahasiswa kosong");
			}else {
				System.out.println("Data Mahasiswa :");
				for (mahasiswa_2511531004 mhs : list ) {
					System.out.println(mhs);
				}
			}
		}
		
		// method untuk hapus mahasiswa berdasarkan nim
		
		public static void hapusMahasiswa_2511531004(ArrayList <mahasiswa_2511531004> list, Scanner sc) {
			String nimHapus = sc.nextLine() ;
			boolean removed = list.removeIf(mhs -> mhs.nim.equals(nimHapus)) ;
			
			if (removed) {
				System.out.println("Data dengan NIM" + nimHapus + "berhasil dihapus.");
				
			} else {
				System.out.println("NIM tidak ditemukan.");
			}
		}
		// method untuk cari mahasiswa berdasasrkan nim
		
		public static void  cariMahasiswa_2511531004(ArrayList <mahasiswa_2511531004> list, Scanner sc) {
			System.out.println("Masukkan NIM yang dicari : ");
			String nimCari = sc.nextLine() ;
			boolean ditemukan = false;
			
			
			
			for (mahasiswa_2511531004 mhs : list) {
				if(mhs.nim.equals(nimCari)) {
					System.out.println("Hasil pencarian : " + mhs );
					ditemukan = true ;
					break;
				}
			}
			if (!ditemukan ) {
				System.out.println("Nim tidak ada.");
				
			}
			
			
		}
		public static void main (String[] args) {
			ArrayList<mahasiswa_2511531004> mahasiswaList = new ArrayList<> ();
			Scanner input = new Scanner (System.in) ;
			int choice ;	
		
		
		do {
			tampilkanMenu_2511531004() ;
			System.out.println("Tampilkan menu : ");
			choice = input.nextInt() ;
			input.nextLine(); // consume new line
			
			
			
			switch ( choice ) {
			
			case 1 :
				tambahMahasiswa_2511531004(mahasiswaList, input);
				break;
				
			case 2 :
				tampilkanSemuaMahasiswa_2511531004(mahasiswaList);
				break;
			case 3 :
				hapusMahasiswa_2511531004(mahasiswaList, input);
				break;
			case 4 :
				cariMahasiswa_2511531004 (mahasiswaList, input) ;
				break;
			case 5 :
				System.out.println("keluar dari program.");
				break;
				
				default :
				System.out.println("Pilihan tidak valid");	
			} }while (choice != 5);
			input.close();
		
		
		}
}
		
	


