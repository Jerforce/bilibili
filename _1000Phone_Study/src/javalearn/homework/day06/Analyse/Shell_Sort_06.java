package javalearn.homework.day06.Analyse;

/**
 * @author Lenovo
 * @create 2023/3/30 11:45
 **/
public class Shell_Sort_06 {
    public static void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {312, 125, 42134, 321, 2, 121};
        shellSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
