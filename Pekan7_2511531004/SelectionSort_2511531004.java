package Pekan7_2511531004;

public class SelectionSort_2511531004 {

	public static void SelectionSort_2511531004 (int[] arr) {
		int n_1004 = arr.length;
		for(int i = 0; i < n_1004 ; i++) {
			int minIndex = i;
			for (int j = i + 1 ; j < n_1004 ; j ++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp_1004 = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp_1004;
			
		}
	}
	
	public static void main(String[] args) {
		int arr_1004 [] = {23, 78,45,8,32,56,1} ;
		int n_1004= arr_1004.length;
		System.out.print("array yang belum terurut : \n");
		for (int i = 0; i < n_1004 ; i++ )
			System.out.print(arr_1004[i] + " ");
		System.out.println("");
		SelectionSort_2511531004(arr_1004);
		System.out.print("array yang sudah terurut : \n");
		for (int i = 0 ; i < n_1004 ; i++) 
			System.out.print(arr_1004[i] + " ");
		System.out.println("");
		
	} 
	
	
}
