import java.util.Scanner;

/**
 * Created by abc on 6/16/2016.
 */
//123   1     2      3
//   1*1*1  2*2*2  3*3*3
//     1  +8 +  27
    //123 != 36 hence it's not amstrong number
public class Amstrong_Num {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sc.nextInt();
        int temp=n;
        while(n>0){
            int r =n%10;
            n=n/10;
            sum+=r*r*r;
        }
        if(temp==sum) {
            System.out.println("It's An Amstrong number..:)");
        }else{
            System.out.println("It's not An Amstrong number");

        }
    }
}
