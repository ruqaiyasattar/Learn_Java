import java.util.Scanner;
public class Prime {
    public static void main(String[] args) throws java.io.IOException {
/*
        for (int j = 2; j < 100; j++) {
            if (isprime(j)) {
                System.out.println("It is prime number! :) "+j);
            }
            else {
                System.out.println("it is not prime number! "+ j);
            }
        }
    }

    private static boolean isprime(int j) {
        for (int i = 2; i < j; i++) {
            if (j % i == 0) {
                return false;
            }

        }

        return true;
    }
*/
        // to get input from user we have to write nextInt(); after scanner
        // for getting integer from user, in the same way
        // for floating value nextFloat() and for string of input
        // we would write nextline()
 /*       int i,k ,j;

        Scanner s =new Scanner(System.in);
        int num;
        System.out.println("Enter any number: ");
        num=s.nextInt();
        System.out.println("");
        for(i=1;i<num;i++) {
            k = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    k = 1;
                    break;
                }
            }
            if (k == 0) {
                System.out.print(i + ", ");
            }

            }*/


        int i, k, j;

        Scanner s = new Scanner(System.in);

        int a;
        System.out.println("Enter the size of array: ");
        a = s.nextInt();

        int num[] = new int[a];
        System.out.println("Enter range of prime number: ");
        num[a - 1] = s.nextInt();
        System.out.println("");
        for (i = 1; i < num.length; i++) {
            k = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    k = 1;
                    break;
                }
            }
            if (k == 0) {
                System.out.println("a" + "[" + i + "]" + "=" + i + " ");
            }

        }
    }}

