package Pekan8_2511531004;

public class QuickShort_2511531004 {
	
	public static void swap_2511531004 (int [] arr, int i , int j ) {
		int temp_1004 = arr[i] ;
		arr[i] = arr[j];
		arr[j] = temp_1004;
	}
	
	// metode tambahan untuk mengatur pivot menggunakan median median of three
	static void medianOfThree_2511531004 (int [] arr, int low, int high) {
		int mid_1004 = low + (high - low) / 2;
		
		// urutkan elemen low, mid, dan high
		if (arr[low] > arr[mid_1004]) {
			swap_2511531004(arr,low,mid_1004);
		}
		if (arr[low] > arr[high]) {
			swap_2511531004(arr, low, high);
		}
		if (arr[mid_1004] > arr[high]) {
			swap_2511531004(arr, mid_1004, high);
		}
		swap_2511531004(arr,mid_1004, high);
	}
	
	static int partition_2511531004 (int[] arr, int low, int high) {
		// panggil fungsi median of three sebelum menentukan pivot
		 medianOfThree_2511531004(arr, low, high);
		 
		 int pivot = arr[high]; // sekarang arr[high] sudah berisi nilai median 
		 int i = (low - 1);
		 
		 for (int j = low; j <= high - 1 ; j ++) {
			 // jika elemen saat ini lebih kecil dari atau sama dengan pivot 
			 if (arr[j] < pivot) {
				 // increament indeks elemen yang lebih kecil
				 i++;
				 swap_2511531004(arr, i , j);
			 }
		 }
		 swap_2511531004(arr, i + 1, high);
		 return (i + 1);
	}
	
	public static void quickSort_2511531004 (int[] arr, int low , int high) {
		if (low < high) {
			int pi = partition_2511531004(arr, low, high);
			quickSort_2511531004(arr, low, pi - 1);
			quickSort_2511531004(arr, pi + 1, high) ;
		}
	}
	
	public static void printArr_2511531004(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {10,7,8,9,1,5} ;
		int N = arr.length;
		System.out.print("Data sebelum diurutkan : ");
		printArr_2511531004(arr);
		
		quickSort_2511531004 (arr, 0, N - 1);
		
		System.out.print("data setelah diurutkan : ");
		printArr_2511531004(arr);
		
		
	}
}
