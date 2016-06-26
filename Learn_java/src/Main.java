/**
 * Created by abc on 6/23/2016.
 */

import java.util.Random;
public class Main {

        public static void main(String[] args) {
        /*    // write your code here
            int b[] = new int[2];
            b[0] = 5;
            Random r = new Random();
            int [][]a = new int[2][];
            a[0] = new int[3];
            a[1] = new int[5];

            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    a[i][j] = r.nextInt(100);
                }
            }
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    System.out.print("a["+i+"]["+j+"] = "+a[i][j]+" ");
                }
                System.out.println();}}*/
            // non_repeating Random number
/*
            int []arr = new int[10];
            Random r = new Random();
            boolean isMatched = false;
            for(int i=0;i<arr.length;i++){
                isMatched = false;
                arr[i] = r.nextInt(10);
                for(int j=0;j<i;j++){
                    if(arr[i]==arr[j]){
                        isMatched = true;
                        break;
                    }
                }
                if(isMatched){
                    i--;
                }
            }
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
}
*/



            int a[];
            int b[] = new int[3];
            int c[] = new int[]{2,7,8,7,8,5,9,7};
            System.out.println(c.length);
            for(int i=0;i<c.length;i++){
                System.out.print(c[i]);
            }

            int d[][] = new int[][]
                    {
                            {3,4,5},
                            {6,7,8},
                            {3,6,7,8}
                    };

            System.out.println("  x |    |    ");
            System.out.println("--------------");
            System.out.println("    |    |    ");
            System.out.println("--------------");
            System.out.println("    |    |    ");

        }
}