package Pekan5_2511531004;

public class Pasien_2511531004 {
    private String namaPasien_1004;
    private String penyakit_1004;
    private int nomorAntrian_1004;
    private Pasien_2511531004 next_1004;

    // Constructor
    public Pasien_2511531004(String namaPasien_1004, String penyakit_1004, int nomorAntrian_1004) {
        this.namaPasien_1004 = namaPasien_1004;
        this.penyakit_1004 = penyakit_1004;
        this.nomorAntrian_1004 = nomorAntrian_1004;
        this.next_1004 = null;
    }

    // Getter & Setter
    
    public String getNamaPasien_1004() { 
    	return namaPasien_1004; }
    
    public void setNamaPasien_1004(String namaPasien_1004)
    { this.namaPasien_1004 = namaPasien_1004; }

    public String getPenyakit_1004() { 
    	return penyakit_1004; }
    
    public void setPenyakit_1004(String penyakit_1004) 
    { this.penyakit_1004 = penyakit_1004; }

    public int getNomorAntrian_1004() {
    	return nomorAntrian_1004; }
    
    public void setNomorAntrian_1004(int nomorAntrian_1004) 
    { this.nomorAntrian_1004 = nomorAntrian_1004; }

    public Pasien_2511531004 getNext_1004() {
    	return next_1004; }
    
    public void setNext_1004(Pasien_2511531004 next_1004) 
    { this.next_1004 = next_1004; }
}

