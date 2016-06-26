import java.util.Scanner;

/**
 * Created by abc on 6/16/2016.
 */
public class Fabo_Series {
    public static void main(String[] args) {
        int k,a,b;
        a=1;
        b=1;
        Scanner sc = new Scanner(System.in);
        k=0;
        System.out.println("Enter a number to generate its Fabonascci series: ");
        int n= sc.nextInt();
        System.out.println("1 1");
        while(k<=n){
            k=a+b;
            if (k>=n)
                break;
            System.out.print(k+" ");

            a=b;
            b=k;
        }
    }
}
