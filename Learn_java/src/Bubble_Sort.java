/**
 * Created by abc on 6/21/2016.
 */
public class Bubble_Sort {
    public static void main(String[] args) {
        int a[]={4,3,1,6,4,3,6,4};

        for(int i=0;i<a.length-1;i++){
            int temp;
            boolean fixed=false;
            while (fixed==false){
fixed=true;

            if(a[i]>a[i+1]) {
                temp = a[i + 1];
                a[i + 1] = a[i];
                a[i] = temp;
            fixed=false;
            }
            }
            }
        for(int i=0;i<a.length;i++){
        System.out.print(" "+a[i]);
        }
    }
}
