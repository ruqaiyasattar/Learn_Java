/**
 * Created by abc on 6/15/2016.
 */
//odd,even,prime numbers
public class Demo_If {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        for(int i=1;i<30;i++) {
            if (i % 2 == 0)
                System.out.println("Even numbers are: " + i);
            else {
                System.out.println("\t\t\t\t\t\t\t\tOdd numbers are " + i);
            }
            int k=0;
            for(int j=2;j<i;j++){
                if(i%j==0)
                {
                    k=1;
                    break;
                                    }
                if(k==0){
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tprime numbers "+i);

                }
            }
        }
        long end=System.currentTimeMillis();
        System.out.println(start-end);
    }    }

