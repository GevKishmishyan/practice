import java.util.Arrays;

public class SecondLargesNumber {
    public static void main(String[] args) {
        int[] checkArr = {123, 243, 2, 5, 1, 8, 43};
        Arrays.sort(checkArr);
        System.out.println(checkArr[checkArr.length - 2]);

        int[] checkArr2 = {123, 243, 2, 5, 1, 8, 43};
        BubbleSort.bubbleSort(checkArr2);
        System.out.println(checkArr2[checkArr2.length - 2]);
    }
}
