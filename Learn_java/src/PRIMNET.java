/**
 * Created by abc on 6/13/2016.
 */

    import java.util.Arrays;
    import java.util.Scanner;

public class PRIMNET {

        Scanner scan;
        int[] num;
        int n;

        void getVal() {

            scan = new Scanner(System.in);
            System.out.println("Sort an Array");

            System.out.println("\nEnter 'n' value :");
            n = Integer.parseInt(scan.nextLine());

            System.out.println("Enter the numbers :");
            num = new int[n];

            for(int i=0; i<n; i++) {

                num[i] = Integer.parseInt(scan.nextLine());
            }
        }

        void sort() {

            System.out.println("\nBefore Sorting");

            for(int i=0; i<n; i++) {

                System.out.println("*");
            }

            Arrays.sort(num);

            System.out.println("\n\nAfter Sorting");

            System.out.println("\nAscending Order");

            for(int i=0; i<n; i++) {

                System.out.println("*" + num[i]);
            }

            System.out.println("\nDescending Order");

            for(int i=n-1; i>=0; i--) {

                System.out.println("*" + num[i]);
            }
        }
    }

    class MainClass {

        public static void main(String args[]){

            PRIMNET obj = new PRIMNET();

            obj.getVal();
            obj.sort();
        }
    }