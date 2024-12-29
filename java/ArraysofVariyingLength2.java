import java.util.Arrays;

public class arraysofVariyingLength2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[10];
        arr[1] = new int[5];
        arr[2] = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 10;
            }
            System.out.println(Arrays.deepToString(arr));
        }
    }
}
