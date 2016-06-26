/**
 * Created by abc on 6/11/2016.
 */
public class net {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] % 10 + " ");
                arr[j] = arr[j] + 2;
            }
            System.out.println("\n");
        }
    }
}
