import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] checkArr = {123, 243, 2, 5, 1, 8, 43};
        bubbleSort(checkArr);
        System.out.println(Arrays.toString(checkArr));


        int[] checkArr2 = {123, 243, 2, 5, 1, 8, 43};
        Arrays.sort(checkArr2);
        System.out.println(Arrays.toString(checkArr2));
    }

    protected static void bubbleSort(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmpElem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmpElem;
                }
            }
        }
    }
}
