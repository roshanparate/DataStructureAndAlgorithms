package ds.sorting;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] ar = new int[]{20,60,8,55,9,70};
		
		quickSort(ar, 0, ar.length-1);
		
		for(int a : ar) {
			System.out.print(a+" ");
		}
	}
	
	
	public static void quickSort(int[] ar , int start, int end) {
		
		if(start >=end) return;
		
		int pivot = end;
		int fixed = newPartition(ar, pivot, start, end);
		
		quickSort(ar, start, fixed-1);
		quickSort(ar, fixed+1, end);
	}

	
	// merge using extra array 
	private static int partition(int[] ar, int start, int end) {
		
		int pivot = ar[start];
		
		int count = 0;
	
		for(int i = start+1; i<end; i++) {
			if(ar[i] < pivot) count++;
		}
		
		// place pivot at right place
		int pivotIndex = start + count;
		
		swap(ar,pivotIndex, start);
		
		int index1 = start;
		int index2 = end;
		
		while(index1 < pivotIndex && index2 > pivotIndex) {
			while(ar[index1] < pivot) {
				index1++;
			}
			
			while(ar[index2] > pivot){
				index2--;
			}
			
			if(index1 < pivotIndex && index2 > pivotIndex) {
				swap(ar,index1++, index2--);
			}
		}
		
		return pivotIndex;
		
	}
	
	private static int newPartition(int[] ar, int pivot, int start, int end) {
		
		int pivotValue = ar[pivot];
		
		int pivotIndex = start;
		
		
	
		for(int i = start; i < end; i++) {
			if(ar[i] < pivotValue) {
			 swap(ar,i, pivotIndex);
			 pivotIndex++;
			} 
		}
		
		swap(ar,end, pivotIndex);
		
		return pivotIndex;
		
	}
	
	private static void swap(int[] ar, int pivotIndex, int index) {
		int temp = ar[index];
		ar[index] = ar[pivotIndex];
		ar[pivotIndex] = temp;
	}

}
