public class BucketSort {
	public void bucketSort(int[] array){
		int n = maxVal(array);
		int[] bucket = new int[n + 1];
		
		for (int x = 0; x < bucket.length; x++) {
			bucket[x] = 0;
		}
		
		for (int y = 0; y < array.length; y++) {
			bucket[array[y]]++;
		}
		
		int outPos = 0;
		for (int p = 0; p < bucket.length; p++) {
			for (int q = 0; q < bucket[p]; q++) {
				array[outPos++] = p;
			}
		}
	}	
	
	private int maxVal(int[] array) {
		int max = 0;
		for (int i : array) {
			if (i > max) max = i;
		}
		
		return max;
	}

	public static void main(String[] args){
		BucketSort bs = new BucketSort();
		
		int[] array = {4,5,6,2,1,4,9,0,8,4,5,6,7,9};
		bs.bucketSort(array);
		
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}