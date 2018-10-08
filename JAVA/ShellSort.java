public class ShellSort {
    public static int[] sort(int arr[]) {
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int tmp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > tmp; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = tmp;
            }
        }
        return arr;
    }
}
