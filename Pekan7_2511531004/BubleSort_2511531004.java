package Pekan7_2511531004;

public class BubleSort_2511531004 {

    public static void BubleSort_2511531004(int[] arr_1004) {
        int n_1004 = arr_1004.length;
        for (int i = 0; i < n_1004; i++) {
            for (int j = 0; j < n_1004 - i - 1; j++) {
                if (arr_1004[j] > arr_1004[j + 1]) {
                    int temp_1004 = arr_1004[j];
                    arr_1004[j] = arr_1004[j + 1];
                    arr_1004[j + 1] = temp_1004;

                    // System.out.println("data:" + arr[j] + " " + arr[j + 1]);
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr_1004[] = {23, 78, 45, 0, 32, 56, 1};

        int n = arr_1004.length;

        System.out.print("Array yang belum terurut: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr_1004[i] + " ");
        }

        System.out.println("");

        BubleSort_2511531004(arr_1004);

        System.out.print("Array yang terurut menggunakan Bubble Sort: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr_1004[i] + " ");
        }

        System.out.println("");
    }
}