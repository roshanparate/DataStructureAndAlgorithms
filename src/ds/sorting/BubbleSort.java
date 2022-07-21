package ds.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ar = new int[]{20,60,8,55,9,70};
		
		for(int i= 1; i < ar.length; i++) {
			
			for(int j = 0 ; j <ar.length-i; j++) {
				if(ar[j] > ar[j+1]) {
					int temp = ar[j+1];
					ar[j+1] = ar[j];
					ar[j] = temp;
				}
			}
		}

		for(int i : ar) {
			System.out.print(i +" ");
		}

	}

}
