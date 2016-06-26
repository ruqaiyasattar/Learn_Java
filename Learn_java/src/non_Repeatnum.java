import java.util.Random;

/**
 * Created by abc on 6/22/2016.
 */
public class non_Repeatnum {
    public static void main(String[] args) {

        int[] num =new int[10];
        Random r =new Random();
        boolean Ismatch=false;
        for(int i=0;i<num.length;i++){
            Ismatch=false;
            num[i]=r.nextInt(15);
            for(int j=0;j<i;j++){
                if(num[i]==num[j]){
                    Ismatch =true;
                    break;
                }}
                if(Ismatch) {
                    i--; }}
            for(int i=0;i<num.length;i++){
            System.out.println("num"+"["+i+"]"+"="+" "+num[i]);
        }}}

