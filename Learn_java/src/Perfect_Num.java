import java.util.Scanner;

/**
 * Created by abc on 6/16/2016.
 */
//when we add all the factor number and get the that axact
// number then its number is said to be perfect nymber
    // i.e 6 = 3+ 2 =6
public class Perfect_Num {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        n = sc.nextInt();
        boolean b = isperfect(n);
        if (b)
            System.out.println("It's perfect number.. :)");
        else
            System.out.println(" It's not perfect number");

    }

    public static boolean isperfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        System.out.println("After adding factors of given number "+sum);

            if (n == sum)
                return true;
            return false;
        }
    }

