package pekan2_2511531004;
import java.util.ArrayList;


public class daftarKata_2511531004 {
	
private final ArrayList<String> data;
// konstruktor inisialisasi list kosong 
public daftarKata_2511531004() {
	this.data = new ArrayList<> ();
}
// menambahkan elemen di akhir list.
public void tambah_2511531004 ( String elemen) {
	data.add(elemen);
}
// menambahkan elemen pada indeks tertentu(menyisipkan)

public void tambahPada_2511531004 ( int index, String elemen) {
	data.add(index, elemen) ;
}

public void ubahElemen_2511531004(int index, String nilaiBaru) {
	data.set(index, nilaiBaru);
}

public String hapusElemen_2511531004 (int index) {
	return data.remove(index);
}
public void iterasiCetak_2511531004() {
	for ( int i = 0; i < data.size(); i++) {
		System.out.println(data.get(i) + " ");
	}
}
// mengambil elemen berdasarkan indeks
public String get(int index) {
	return data.get(index);
}

// repsresentasi string agar mudah dicetak

@Override
public String toString () {
	return data.toString();
}

}
