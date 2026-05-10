package Pekan5_2511531004;

import java.util.Scanner;

public class RumahSakit_2511531004 {
    private Pasien_2511531004 head_1004;
    private int counter_1004;

    public RumahSakit_2511531004() {
        head_1004 = null;
        counter_1004 = 0;
    }

    // Menambahkan pasien
    public void daftarkanPasien_1004(String nama, String penyakit) {
        counter_1004++;
        Pasien_2511531004 newPasien = new Pasien_2511531004(nama, penyakit, counter_1004);

        if (head_1004 == null) {
            head_1004 = newPasien;
        } else {
            Pasien_2511531004 temp = head_1004;
            while (temp.getNext_1004() != null) {
                temp = temp.getNext_1004();
            }
            temp.setNext_1004(newPasien);
        }
        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_1004);
    }

    // Menghapus Head
    public void panggilPasien_1004() {
        if (head_1004 == null) {
            System.out.println("Tidak ada pasien dalam antrian.");
        } else {
            System.out.println("Memanggil Pasien: " + head_1004.getNamaPasien_1004() +
                               " | Keluhan: " + head_1004.getPenyakit_1004() +
                               " | Nomor Antrian: " + head_1004.getNomorAntrian_1004());
            head_1004 = head_1004.getNext_1004();
        }
    }

    // Menampilkan
    public void tampilkanAntrian_1004() {
        if (head_1004 == null) {
            System.out.println("Antrian kosong.");
        } else {
            Pasien_2511531004 temp = head_1004;
            while (temp != null) {
                System.out.println("Nomor Antrian: " + temp.getNomorAntrian_1004() +
                                   " | Nama: " + temp.getNamaPasien_1004() +
                                   " | Keluhan: " + temp.getPenyakit_1004());
                temp = temp.getNext_1004();
            }
        }
    }

    // mencari pasien
    public void cariPasien_1004(String nama) {
        Pasien_2511531004 temp = head_1004;
        boolean found = false;
        while (temp != null) {
            if (temp.getNamaPasien_1004().equalsIgnoreCase(nama)) {
                System.out.println("Pasien ditemukan: " + temp.getNamaPasien_1004() +
                                   " | Keluhan: " + temp.getPenyakit_1004() +
                                   " | Nomor Antrian: " + temp.getNomorAntrian_1004());
                found = true;
                break;
            }
            temp = temp.getNext_1004();
        }
        if (!found) {
            System.out.println("Pasien dengan nama '" + nama + "' tidak ditemukan.");
        }
    }

    // Status
    public void cekStatusAntrian_1004() {
        if (head_1004 == null) {
            System.out.println("Antrian kosong.");
        } else {
            int total = 0;
            Pasien_2511531004 temp = head_1004;
            while (temp != null) {
                total++;
                temp = temp.getNext_1004();
            }
            System.out.println("Jumlah total pasien: " + total);
            System.out.println("Pasien terdepan: " + head_1004.getNamaPasien_1004() +
                               " | Keluhan: " + head_1004.getPenyakit_1004());
        }
    }

    // Main Menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RumahSakit_2511531004 rs = new RumahSakit_2511531004();
        int pilihan;

        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511531004 ===");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Pasien: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Keluhan: ");
                    String penyakit = sc.nextLine();
                    rs.daftarkanPasien_1004(nama, penyakit);
                    break;
                case 2:
                    rs.panggilPasien_1004();
                    break;
                case 3:
                    rs.tampilkanAntrian_1004();
                    break;
                case 4:
                    System.out.print("Masukkan Nama Pasien yang dicari: ");
                    String cari = sc.nextLine();
                    rs.cariPasien_1004(cari);
                    break;
                case 5:
                    rs.cekStatusAntrian_1004();
                    break;
                case 6:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 6);
        sc.close();
    }
}
