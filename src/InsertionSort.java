import java.util.Arrays;

public class InsertionSort {
        public static void main(String[] args) {
            int[] arr = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 10);
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            insertionSort(arr);
        }

        public static void insertionSort(int[] list) {
            for (int i = 1; i < list.length; i++) {
                int currentNum = list[i];
                int k;
                System.out.println(i + " pass");
                for (k = i - 1; k >= 0 && list[k] > currentNum; k--) {
                    list[k + 1] = list[k];
                }
                list[k + 1] = currentNum;
                System.out.println(Arrays.toString(list));
            }
        }
    }
