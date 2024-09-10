public class ArrayUtils {

    public static void mergeSort(int[] elements, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(elements, low, mid);
            mergeSort(elements, mid + 1, high);
            merge(elements, low, mid, high);
        }
    }

    private static void merge(int[] subset, int low, int mid, int high) {
        int n = high - low + 1;
        int[] temp = new int[n];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid || j <= high) {
            if (i > mid)
                temp[k++] = subset[j++];
            else if (j > high)
                temp[k++] = subset[i++];
            else if (subset[i] < subset[j])
                temp[k++] = subset[i++];
            else
                temp[k++] = subset[j++];
        }

        for (j = 0; j < n; j++) {
            subset[low + j] = temp[j];
        }
    }

    public static int search(int[] sortedArray, int key) {
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void getOutput(int index, int key) {
        if (index == -1)
            System.out.println("Элемент " + key + " не найден.");
        else
            System.out.println("Элемент " + key + " найден на позиции " + (index + 1)  + ".");
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}