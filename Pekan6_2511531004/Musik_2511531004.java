package Pekan6_2511531004;

public class Musik_2511531004 {
    private Lagu_2511531004 head_1004;
    private Lagu_2511531004 tail_1004;

    public Musik_2511531004() {
        head_1004 = null;
        tail_1004 = null;
    }

    // 1. Tambah Lagu di akhir
    public void tambahLagu_1004(String judul, String penyanyi) {
        Lagu_2511531004 baru = new Lagu_2511531004(judul, penyanyi);
        if (head_1004 == null) {
            head_1004 = tail_1004 = baru;
        } else {
            tail_1004.next_1004 = baru;
            baru.prev_1004 = tail_1004;
            tail_1004 = baru;
        }
        System.out.println("Lagu berhasil ditambahkan!");
    }

    // 2. Hapus Lagu Awal
    public void hapusLaguAwal_1004() {
        if (head_1004 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        System.out.println("Menghapus: " + head_1004.getJudul_1004());
        head_1004 = head_1004.next_1004;
        if (head_1004 != null) {
            head_1004.prev_1004 = null;
        } else {
            tail_1004 = null;
        }
    }

    // 3. Tampil Maju
    public void tampilMaju_1004() {
        if (head_1004 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511531004 temp = head_1004;
        while (temp != null) {
            System.out.println(temp.getJudul_1004() + " - " + temp.getPenyanyi_1004());
            temp = temp.next_1004;
        }
    }

    // 4. Tampil Mundur
    public void tampilMundur_1004() {
        if (tail_1004 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511531004 temp = tail_1004;
        while (temp != null) {
            System.out.println(temp.getJudul_1004() + " - " + temp.getPenyanyi_1004());
            temp = temp.prev_1004;
        }
    }

    // 5. Cari Lagu
    public void cariLagu_1004(String judul) {
        if (head_1004 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511531004 temp = head_1004;
        boolean ketemu = false;
        while (temp != null) {
            if (temp.getJudul_1004().equalsIgnoreCase(judul)) {
                System.out.println("Lagu ditemukan: " + temp.getJudul_1004() + " - " + temp.getPenyanyi_1004());
                ketemu = true;
                break;
            }
            temp = temp.next_1004;
        }
        if (!ketemu) {
            System.out.println("Lagu tidak ditemukan!");
        }
    }
}

