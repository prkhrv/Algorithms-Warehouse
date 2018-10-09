public class GnomeSort {
    public static int[] sort(int[] arr) {
        int first = 1;
        int second = 2;

        while(first < arr.length) {
            if (arr[first - 1] <= arr[first]) {
                first = second;
                second++;
            } else {
                int tmp = arr[first - 1];
                arr[first - 1] = arr[first];
                arr[first] = tmp;
                first -= 1;
                if (first == 0) {
                    first = 1;
                    second = 2;
                }
            }
        }
        return arr;
    }
}
