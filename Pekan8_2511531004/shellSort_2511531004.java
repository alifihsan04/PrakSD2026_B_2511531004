package Pekan8_2511531004;

public class shellSort_2511531004 {
	
	public static void shellSort_2511531004 ( int[] A) {
		int n_1004 = A.length;
		int gap_1004 = n_1004 / 2;
		
		while ( gap_1004 > 0 ) {
			for (int i = gap_1004; i < n_1004 ; i++) {
				int temp = A[i];
				int j = i;
				while (j >= gap_1004 && A[j - gap_1004] > temp) {
					A[j] = A[j-gap_1004];
					j = j - gap_1004;
				}
				A[j] = temp;
			}
			gap_1004 = gap_1004/2;
		}
		
		
	}


public static void main(String [] args) {
	int [] data_1004 = {3,10,4,6,0,9,7,2,1,5} ;
	System.out.print("sebelum : ");
	printArray_2511531004(data_1004);
	
	shellSort_2511531004(data_1004);
	
	System.out.print("Sesudah (Shell Sort) : ");
	printArray_2511531004(data_1004);
	
	
	
}

public static void printArray_2511531004 (int[] arr) {
	for (int i : arr) System.out.print(i + " ");
	System.out.println();
}
}