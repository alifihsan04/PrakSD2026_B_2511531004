package Pekan6_2511531004;

public class Lagu_2511531004 {
    private String judul_1004;
    private String penyanyi_1004;
    Lagu_2511531004 next_1004;
    Lagu_2511531004 prev_1004;

    // Constructor
    public Lagu_2511531004(String judul_1004, String penyanyi_1004) {
        this.judul_1004 = judul_1004;
        this.penyanyi_1004 = penyanyi_1004;
        this.next_1004 = null;
        this.prev_1004 = null;
    }

    // Getter
    public String getJudul_1004() { return judul_1004; }
    public String getPenyanyi_1004() { return penyanyi_1004; }

    // Setter
    public void setJudul_1004(String judul_1004) { this.judul_1004 = judul_1004; }
    public void setPenyanyi_1004(String penyanyi_1004) { this.penyanyi_1004 = penyanyi_1004; }
}
