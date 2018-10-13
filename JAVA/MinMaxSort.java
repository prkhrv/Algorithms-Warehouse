public class MinMaxSort {

    private static void swap(int arr[], int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    private static int[] sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i <= n; ++i) {
            int max = (n - 1) - i;
            for (int j = i; j < max; ++j) {
                if(arr[j] < arr[i])
                    swap(arr, j, i);
                if(arr[j] > arr[max])
                    swap(arr, j, max);
            }
        }
        return arr;
    }

    private static void printArray(int arr[]) {
        for (int anArr : arr)
            System.out.print(anArr + " ");
        System.out.println("\n");
    }

    public static void main (String ... args) {
        int arr[] = {37, 56, 61, 34, 27, 11, 14};

        System.out.println("ARRAY BEFORE SORT => ");
        printArray(arr);

        int res[] = sort(arr);

        System.out.println("ARRAY AFTER SORT => ");
        printArray(res);

    }
}
