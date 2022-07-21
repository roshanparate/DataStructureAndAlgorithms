package ds.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] ar = new int[]{20,60,8,55,9,70};
		
		mergeSort(ar, 0, ar.length-1);
		
		for(int a : ar) {
			System.out.print(a+" ");
		}
	}
	
	
	public static void mergeSort(int[] ar , int start, int end) {
		
		if(start >=end) return;
		
		int mid = (start + end)/2;
		
		mergeSort(ar, start, mid);
		mergeSort(ar, mid+1, end);
		merge(ar, start,end);
	}

	
	// merge using extra array 
	private static void merge(int[] ar, int start, int end) {
		
		int mid = (start + end)/2;
		
		int len1 = mid-start + 1;
		int len2 = end-mid;
		
		int[] first = new int[len1];
		int[] second = new int[len2];
		
		int indexArray = start;
		for(int i = 0; i<len1; i++) {
			first[i] = ar[indexArray++];
		}
		
		indexArray = mid+1;
		for(int i = 0; i<len2; i++) {
			second[i] = ar[indexArray++];
		}
		
		
		// merge 2 sorted array logic
		int index1 = 0;
		int index2 = 0;
		indexArray = start;
		
		while(index1 < len1 && index2 <len2) {
			if(first[index1] < second[index2]) {
				ar[indexArray++]=first[index1++];
			}else {
				ar[indexArray++]=second[index2++];
			}
		}
		
		while(index1 < len1) {
			ar[indexArray++]=first[index1++];
		}
		
		while(index2 <len2) {
			ar[indexArray++]=second[index2++];
		}
		
	}

}
