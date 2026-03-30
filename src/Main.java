import Sorting.InstertionSort;

import java.util.Arrays;

public class Main {
    static void main() {
        int[] arr = new int[] {1, 2, 5, 4, 6, 7, 3, 8, 10, 9};
        InstertionSort  inst = new InstertionSort();
        System.out.println(Arrays.toString(arr));
        inst.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
