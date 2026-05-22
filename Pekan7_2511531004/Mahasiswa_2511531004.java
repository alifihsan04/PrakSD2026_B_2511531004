package Pekan7_2511531004;

public class Mahasiswa_2511531004 {


	    private String nama_31004;
	    private String nim_31004;
	    private String prodi_31004;

	    // Constructor
	    public Mahasiswa_2511531004(String nama, String nim, String prodi) {
	        this.nama_31004 = nama;
	        this.nim_31004 = nim;
	        this.prodi_31004 = prodi;
	    }

	    // Getter & Setter
	    public String getNama_31004() { return nama_31004; }
	    public void setNama_31004(String nama) { this.nama_31004 = nama; }

	    public String getNim_31004() { return nim_31004; }
	    public void setNim_31004(String nim) { this.nim_31004 = nim; }

	    public String getProdi_31004() { return prodi_31004; }
	    public void setProdi_31004(String prodi) { this.prodi_31004 = prodi; }

	    @Override
	    public String toString() {
	        return "Nama: " + nama_31004 + ", NIM: " + nim_31004 + ", Prodi: " + prodi_31004;
	    }
	}


