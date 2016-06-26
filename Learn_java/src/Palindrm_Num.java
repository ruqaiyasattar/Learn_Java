import java.util.Scanner;

/**
 * Created by abc on 6/16/2016.
 */
//logic for reversing a number
public class Palindrm_Num {
    public static void main(String[] args) {
        int r,s=0,n,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to generate to check it's palindrom or not : ");
        n = sc.nextInt();
        t=n;
        while(n>0){   //n   r   s
        r= n %10;    //12  3   0
        n=n/10;      //1   2   32
        s=s*10+r;}   //0  1    321
        System.out.println(t+" "+" After reverse "+s+" ");
        if(t==s)
        System.out.println(" It's Palindrom number.. :)");
        else
            System.out.println(" it's not Palindrom number");
        }

}
