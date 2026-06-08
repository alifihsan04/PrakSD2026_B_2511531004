package Pekan8_2511531004;

public class Lagu_2511531004 {
    String judul_1004;
    String penyanyi_1004;
    int durasi_1004;

    Lagu_2511531004(String judul, String penyanyi, int durasi) {
        this.judul_1004 = judul;
        this.penyanyi_1004 = penyanyi;
        this.durasi_1004 = durasi;
    }

    @Override
    public String toString() {
        return judul_1004 + " - " + penyanyi_1004 + " (" + durasi_1004 + " detik)";
    }
}
