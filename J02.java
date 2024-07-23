
import java.util.Arrays;

public class J02 {

    static int[] revArray(int[] arr) {
        int size = arr.length -1;
        int[] revArr = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            revArr[size] = arr[i];
            size--;
        }

        return revArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print(Arrays.toString(revArray(arr)));
    }
}
