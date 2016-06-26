/**
 * Created by abc on 6/12/2016.
 */
public class pattrn1 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++) {
                if (i == 1 || i == 4 || j == 1 || j == 4)
                    System.out.print("*");
                else{
                    System.out.print("");
            }
                System.out.println(" ");
            }
        }
    }}