package ds.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = new int[]{20,60,8,55,9,70};
		
		for(int i= 0; i < ar.length; i++) {
			for(int j = i+1 ; j <ar.length; j++) {
				if(ar[i] > ar[j]) {
					int temp = ar[j];
					ar[j] = ar[i];
					ar[i] = temp;
				}
			}
		}

		for(int i : ar) {
			System.out.print(i +" ");
		}
	}

}
