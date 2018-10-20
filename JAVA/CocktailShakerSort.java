class CocktailShakerSort implements SortAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {

        int length = array.length;
        int left = 0;
        int right = length - 1;
        int swappedLeft, swappedRight;
        while (left < right) {
            // front
            swappedRight = 0;
            for (int i = left; i < right; i++) {
                if (less(array[i + 1], array[i])) {
                    swap(array, i, i + 1);
                    swappedRight = i;
                }
            }
            // back
            right = swappedRight;
            swappedLeft = length - 1;
            for (int j = right; j > left; j--) {
                if (less(array[j], array[j - 1])) {
                    swap(array, j - 1, j);
                    swappedLeft = j;
                }
            }
            left = swappedLeft;
        }
        return array;

    }

	// Driver Program
	public static void main(String[] args) {
		// Integer Input
		Integer[] integers = { 4, 23, 6, 78, 1, 54, 231, 9, 12 };
		CocktailShakerSort shakerSort = new CocktailShakerSort();

		// Output => 1 4 6 9 12 23 54 78 231
		print(shakerSort.sort(integers));

		// String Input
		String[] strings = { "c", "a", "e", "b", "d" };
		System.out.println(shakerSort.sort(strings));
	}


}
