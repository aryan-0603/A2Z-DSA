public class merge_sorted_var2 {
    public static void swap(long[] arr1, long[] arr2, int n, int m) {
        long t = arr1[n];
        arr1[n] = arr2[m];
        arr2[m] = t;
    }

    public static void merge(long[] arr1, long[] arr2, int n, int m) {
        int len = n + m;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < len) {
                if (left < n && right >= n) {
                    if (arr1[left] > arr2[right - n]) {
                        swap(arr1, arr2, left, right - n);
                    }
                } else if (left >= n) {
                    if (arr2[left - n] > arr2[right - n]) {
                        swap(arr2, arr2, left - n, right - n);
                    }
                } else {
                    if (arr1[left] > arr1[right]) {
                        swap(arr1, arr1, left, right);
                    }
                }
                left++;
                right++;
            }

            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
    }

    public static void main(String[] args) {
        long[] arr1 = {1, 4, 8, 10};
        long[] arr2 = {2, 3, 9};
        int n = 4, m = 3;
        merge(arr1, arr2, n, m);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
