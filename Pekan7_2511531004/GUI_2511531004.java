package Pekan7_2511531004;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI_2511531004 extends JFrame {
    private ArrayList<Mahasiswa_2511531004> daftarMahasiswa_31004 = new ArrayList<>();
    private JTextArea areaOutput_31004;
    private JComboBox<String> comboSort_31004;

    public GUI_2511531004() {
        setTitle("Sorting Mahasiswa - 2511531004");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JTextField inputNama = new JTextField(10);
        JTextField inputNim = new JTextField(10);
        JTextField inputProdi = new JTextField(10);

        JButton btnTambah = new JButton("Tambah");
        JButton btnSort = new JButton("Mulai Sorting");

        comboSort_31004 = new JComboBox<>(new String[]{"Insertion Sort", "Selection Sort", "Bubble Sort"});
        areaOutput_31004 = new JTextArea(10, 40);

        add(new JLabel("Nama:")); add(inputNama);
        add(new JLabel("NIM:")); add(inputNim);
        add(new JLabel("Prodi:")); add(inputProdi);
        add(btnTambah); add(comboSort_31004); add(btnSort);
        add(new JScrollPane(areaOutput_31004));

        // Event Tambah
        btnTambah.addActionListener(e -> {
            daftarMahasiswa_31004.add(new Mahasiswa_2511531004(
                inputNama.getText(), inputNim.getText(), inputProdi.getText()
            ));
            tampilkanData();
        });

        // Event Sorting
        btnSort.addActionListener(e -> {
            String pilihan = (String) comboSort_31004.getSelectedItem();
            if (pilihan.equals("Insertion Sort")) insertionSort_31004();
            else if (pilihan.equals("Selection Sort")) selectionSort_31004();
            else bubbleSort_31004();
            tampilkanData();
        });
    }

    private void tampilkanData() {
        areaOutput_31004.setText("");
        for (Mahasiswa_2511531004 m : daftarMahasiswa_31004) {
            areaOutput_31004.append(m.toString() + "\n");
        }
    }

    // Sorting Methods
    private void insertionSort_31004() {
        for (int i = 1; i < daftarMahasiswa_31004.size(); i++) {
            Mahasiswa_2511531004 key = daftarMahasiswa_31004.get(i);
            int j = i - 1;
            while (j >= 0 && daftarMahasiswa_31004.get(j).getNama_31004()
                    .compareToIgnoreCase(key.getNama_31004()) > 0) {
                daftarMahasiswa_31004.set(j + 1, daftarMahasiswa_31004.get(j));
                j--;
            }
            daftarMahasiswa_31004.set(j + 1, key);
            areaOutput_31004.append("Step " + i + ": " + daftarMahasiswa_31004 + "\n");
        }
    }

    private void selectionSort_31004() {
        for (int i = 0; i < daftarMahasiswa_31004.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < daftarMahasiswa_31004.size(); j++) {
                if (daftarMahasiswa_31004.get(j).getNama_31004()
                        .compareToIgnoreCase(daftarMahasiswa_31004.get(minIndex).getNama_31004()) < 0) {
                    minIndex = j;
                }
            }
            Mahasiswa_2511531004 temp = daftarMahasiswa_31004.get(minIndex);
            daftarMahasiswa_31004.set(minIndex, daftarMahasiswa_31004.get(i));
            daftarMahasiswa_31004.set(i, temp);
            areaOutput_31004.append("Pass " + (i+1) + ": " + daftarMahasiswa_31004 + "\n");
        }
    }

    private void bubbleSort_31004() {
        for (int i = 0; i < daftarMahasiswa_31004.size() - 1; i++) {
            for (int j = 0; j < daftarMahasiswa_31004.size() - i - 1; j++) {
                if (daftarMahasiswa_31004.get(j).getNama_31004()
                        .compareToIgnoreCase(daftarMahasiswa_31004.get(j+1).getNama_31004()) > 0) {
                    Mahasiswa_2511531004 temp = daftarMahasiswa_31004.get(j);
                    daftarMahasiswa_31004.set(j, daftarMahasiswa_31004.get(j+1));
                    daftarMahasiswa_31004.set(j+1, temp);
                }
            }
            areaOutput_31004.append("Pass " + (i+1) + ": " + daftarMahasiswa_31004 + "\n");
        }
    }

    public static void main(String[] args) {
        new GUI_2511531004().setVisible(true);
    }
}
