import java.util.HashSet;
import java.util.Set;
public class longest_subsequence {
    public static int longest(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return 0;

        int len = 1;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        for (int it : set) {
            if (!set.contains(it - 1)) {
                int c = 1;
                int x = it;

                while (set.contains(x + 1)) {
                    x += 1;
                    c += 1;
                }

                len = Math.max(len, c);
            }
        }

        return len;
    }

    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longest(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
