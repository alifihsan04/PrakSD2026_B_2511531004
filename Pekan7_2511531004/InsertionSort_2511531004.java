package Pekan7_2511531004;

public class InsertionSort_2511531004 {
	public static void InsertionSort_2511531004(int[] arr) {
		int n_1004 = arr.length;
		for (int i = 1; i < n_1004 ; i++) {
			int key_1004 = arr[i];
			int j_1004 = i - 1;
			while ( j_1004 >= 0 && arr[j_1004] > key_1004 ) {
				arr [j_1004 + 1] = arr[j_1004] ;
				j_1004--;
			}
			arr[j_1004+1] = key_1004;
		}
	}
	
	public static void main(String[] args) {
		int arr_1004[] = {23,78,45,0,32,56,1};
		int n = arr_1004.length;
		
		System.out.print("Array yang belum terurut : \n");
		for ( int i = 0; i < n; i++) 
			System.out.print(arr_1004[i] + " ");
			System.out.println("");
			InsertionSort_2511531004(arr_1004);
			System.out.print("array yang sudah terurut :\n");
			for ( int i = 0; i < n; i++) 
				System.out.print(arr_1004[i] + " ");
			System.out.println();
				
			
			
		
	}

}
