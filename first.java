
class first {

    static int maxNum(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        return max;
    }
    static int minNum(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 9};
        System.out.println(maxNum(arr));
        System.out.println(minNum(arr));

    }
}
