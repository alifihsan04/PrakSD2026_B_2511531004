package Pekan8_2511531004;

public class mergeSort_2511531004 {
    
    void merge_2511531004 (int[] arr, int l , int m , int r) {
        int n1_1004 = m - l + 1;
        int n2_1004 = r - m;

        int L_1004[] = new int[n1_1004];
        int R_1004[] = new int[n2_1004];

        for (int i = 0; i < n1_1004; ++i)
            L_1004[i] = arr[l + i];
        for (int j = 0; j < n2_1004; ++j)
            R_1004[j] = arr[m + 1 + j]; // ✅ diperbaiki

        int i = 0, j = 0;
        int k = l;

        while (i < n1_1004 && j < n2_1004) {
            if (L_1004[i] <= R_1004[j]) {
                arr[k] = L_1004[i];
                i++;
            } else {
                arr[k] = R_1004[j];
                j++;
            }
            k++;
        }

        while (i < n1_1004) {
            arr[k] = L_1004[i];
            i++;
            k++;
        }

        while (j < n2_1004) {
            arr[k] = R_1004[j];
            j++;
            k++;
        }
    }

    void sort_2511531004 (int[] arr, int l , int r) {
        if (l < r) { // ✅ diperbaiki
            int m = l + (r - l) / 2; // ✅ diperbaiki
            sort_2511531004(arr, l, m);
            sort_2511531004(arr, m + 1, r);
            merge_2511531004(arr, l, m, r);
        }
    }

    static void printArray_2511531004 (int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n ; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        System.out.println("Data sebelum diurutkan:");
        printArray_2511531004(arr);

        mergeSort_2511531004 ob = new mergeSort_2511531004();
        ob.sort_2511531004(arr, 0, arr.length - 1);

        System.out.println("Data setelah diurutkan:");
        printArray_2511531004(arr);
    }
}
