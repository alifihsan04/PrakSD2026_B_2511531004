package Struktur_data;

public class Musik_2511531004 {
   
    private String judul_1004;
    private String penyanyi_1004;
    private int durasi_1004;

    // Constructor
    public Musik_2511531004(String judul_1004, String penyanyi_1004, int durasi_1004) {
        this.judul_1004 = judul_1004;
        this.penyanyi_1004 = penyanyi_1004;
        this.durasi_1004 = durasi_1004;
    }

    // Getter
    public String getJudul_1004() {
        return judul_1004;
    }

    public String getPenyanyi_1004() {
        return penyanyi_1004;
    }

    public int getDurasi_1004() {
        return durasi_1004;
    }

    // Setter
    public void setJudul_1004(String judul_1004) {
        this.judul_1004 = judul_1004;
    }

    public void setPenyanyi_1004(String penyanyi_1004) {
        this.penyanyi_1004 = penyanyi_1004;
    }

    public void setDurasi_1004(int durasi_1004) {
        this.durasi_1004 = durasi_1004;
    }

    // Representasi String
    @Override
    public String toString() {
        return "Judul: " + judul_1004 + ", Penyanyi: " + penyanyi_1004 + ", Durasi: " + durasi_1004 + " detik";
    }
}
