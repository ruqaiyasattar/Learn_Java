/**
 * Created by abc on 6/12/2016.
 */
public class desig {
    public static void main(String[] args) {
        int i,j;
        for(i=1; i<=5; i++){
            for(j=1;j<=i;j++){
                if((i+j)%2==0){
                System.out.print("1 ");

            }else
                    System.out.print("0 ");}
            System.out.println(" ");
        }
    }
}
