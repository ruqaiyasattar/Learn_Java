/**
 * Created by abc on 6/18/2016.
 */
public class Random_num {
    public static void main(String[] args) {
        int i;
        int array[] = new int[10];
        System.out.println("Unsorted list of array");
        for (i = 0; i < array.length; i++) {
            System.out.println(i);
            array[i] = (int) (Math.random() * 30);
            System.out.println(array[i] + " ");
        }
            for (int c = 0; c < (i - 1); c++) {
                for (int d = 0; d < (i - c-1); d++) {
                    if (array[d] > array[d] + 1) {
                        int temp;
                        temp = array[d];
                        array[d] = array[d + 1];
                        array[d + 1] = temp;
                    }
                }
            }
            System.out.println("Sorted list of numbers!");
            for (int c = 0; c < i; c++)
                System.out.println(array[c]);


        }
    }

