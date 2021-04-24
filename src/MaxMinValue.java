public class MaxMinValue {
    public static void main(String[] args) {
        int[] checkArr = {123, 243, 2, 5, 1, 8, 43};
        System.out.println(minValue(checkArr));
        System.out.println(maxValue(checkArr));
    }

    private static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    private static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
