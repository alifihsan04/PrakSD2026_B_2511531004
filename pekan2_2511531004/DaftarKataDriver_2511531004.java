package pekan2_2511531004;

public class DaftarKataDriver_2511531004 {

	public static void main(String[] args) {
		daftarKata_2511531004 al = new daftarKata_2511531004();
		
		// menambah elemen akhir
		al.tambah_2511531004("kami");
		al.tambah_2511531004("informatika");
		
		
		// menyisipkan elemen pada indeks 1 
		al.tambahPada_2511531004 (1, "Mahasiswa");
		
		// cetak isi awal
		System.out.println("Awal :  " + al);
		
		// mengubah elemen pada indeks 1 
		al.ubahElemen_2511531004 (1 , "Departemen");
		System.out.println("Setelah ubah: " + al) ;
		
		// menghapus elemen (hapus index 0)
		String terhapus = al.hapusElemen_2511531004(0);
		System.out.println("Terhapus : " + terhapus);
		System.out.println("setelah hapus :  " + al);
		
		
		// iterasi pada ArrayList
		System.out.println("Iterasi:"); 
		al.iterasiCetak_2511531004();
		System.out.println();
		
		
	
}
}