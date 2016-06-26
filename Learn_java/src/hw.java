/**
 * Created by abc on 6/12/2016.
 */
public class hw {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] % 10 + " ");
                arr[j] = arr[j] + 1;
            }
            System.out.println("\n");
        }
    }
}
