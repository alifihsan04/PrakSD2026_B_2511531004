package Pekan8_2511531004;

import java.util.Scanner;

public class Sorting_2511531004 {
    Lagu_2511531004[] dataLagu_1004 = new Lagu_2511531004[20];
    int jumlah_1004 = 0;

    // Input minimal 7 lagu
    void inputData_1004() {
        dataLagu_1004[jumlah_1004++] = new Lagu_2511531004("La Perla", "Juanes", 196);
        dataLagu_1004[jumlah_1004++] = new Lagu_2511531004("La Rumba Del Perdon", "Carlos", 252);
        dataLagu_1004[jumlah_1004++] = new Lagu_2511531004("Mio Cristo Piange Diamanti", "Andrea", 270);
        dataLagu_1004[jumlah_1004++] = new Lagu_2511531004("Shape of You", "Ed Sheeran", 240);
        dataLagu_1004[jumlah_1004++] = new Lagu_2511531004("Fix You", "Coldplay", 300);
        dataLagu_1004[jumlah_1004++] = new Lagu_2511531004("Yellow", "Coldplay", 260);
        dataLagu_1004[jumlah_1004++] = new Lagu_2511531004("Perfect", "Ed Sheeran", 280);
    }

    // Tampil data
    void tampilData_1004() {
        for (int i = 0; i < jumlah_1004; i++) {
            System.out.println((i+1) + ". " + dataLagu_1004[i]);
        }
    }

    // === SHELL SORT (judul A-Z) ===
    void shellSort_1004() {
        int n = jumlah_1004;
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Lagu_2511531004 temp = dataLagu_1004[i];
                int j;
                for (j = i; j >= gap && dataLagu_1004[j-gap].judul_1004.compareTo(temp.judul_1004) > 0; j -= gap) {
                    dataLagu_1004[j] = dataLagu_1004[j-gap];
                }
                dataLagu_1004[j] = temp;
            }
        }
    }

    // === QUICK SORT (durasi ascending) ===
    void quickSort_1004(int low, int high) {
        if (low < high) {
            int pi = partition_1004(low, high);
            quickSort_1004(low, pi-1);
            quickSort_1004(pi+1, high);
        }
    }

    int partition_1004(int low, int high) {
        int pivot = dataLagu_1004[high].durasi_1004;
        int i = (low-1);
        for (int j = low; j < high; j++) {
            if (dataLagu_1004[j].durasi_1004 <= pivot) {
                i++;
                Lagu_2511531004 temp = dataLagu_1004[i];
                dataLagu_1004[i] = dataLagu_1004[j];
                dataLagu_1004[j] = temp;
            }
        }
        Lagu_2511531004 temp = dataLagu_1004[i+1];
        dataLagu_1004[i+1] = dataLagu_1004[high];
        dataLagu_1004[high] = temp;
        return i+1;
    }

    // === MERGE SORT (judul A-Z) ===
    void mergeSort_1004(int left, int right) {
        if (left < right) {
            int mid = (left+right)/2;
            mergeSort_1004(left, mid);
            mergeSort_1004(mid+1, right);
            merge_1004(left, mid, right);
        }
    }

    void merge_1004(int left, int mid, int right) {
        int n1 = mid-left+1;
        int n2 = right-mid;

        Lagu_2511531004[] L = new Lagu_2511531004[n1];
        Lagu_2511531004[] R = new Lagu_2511531004[n2];

        for (int i=0; i<n1; i++) L[i] = dataLagu_1004[left+i];
        for (int j=0; j<n2; j++) R[j] = dataLagu_1004[mid+1+j];

        int i=0, j=0, k=left;
        while (i<n1 && j<n2) {
            if (L[i].judul_1004.compareTo(R[j].judul_1004) <= 0) {
                dataLagu_1004[k++] = L[i++];
            } else {
                dataLagu_1004[k++] = R[j++];
            }
        }
        while (i<n1) dataLagu_1004[k++] = L[i++];
        while (j<n2) dataLagu_1004[k++] = R[j++];
    }

    // === DRIVER ===
    public static void main(String[] args) {
        Sorting_2511531004 s = new Sorting_2511531004();
        s.inputData_1004();

        Scanner sc = new Scanner(System.in);
        System.out.println("=== Sorting Playlist NIM: 2511531004 ===");
        System.out.println("Pilih Algoritma (1=Shell, 2=Quick, 3=Merge): ");
        int pilih = sc.nextInt();

        System.out.println("\nData Sebelum Sorting:");
        s.tampilData_1004();

        if (pilih == 1) {
            s.shellSort_1004();
            System.out.println("\nData Setelah Shell Sort (Judul A-Z):");
        } else if (pilih == 2) {
            s.quickSort_1004(0, s.jumlah_1004-1);
            System.out.println("\nData Setelah Quick Sort (Durasi Asc):");
        } else if (pilih == 3) {
            s.mergeSort_1004(0, s.jumlah_1004-1);
            System.out.println("\nData Setelah Merge Sort (Judul A-Z):");
        }
        s.tampilData_1004();
    }
}
