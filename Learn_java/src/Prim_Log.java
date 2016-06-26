import java.util.Scanner;

/**
 * Created by abc on 6/17/2016.
 */
public class Prim_Log {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number to check it's prime or not: ");
        int num=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<num;i++){
            if (num%i==0){
                isPrime = false;
                break;
            }}
            if(isPrime) {
                System.out.println("It's Prime number..:)");
            }else {
                System.out.println("It's Not Prime number");
            }
            }
        }


