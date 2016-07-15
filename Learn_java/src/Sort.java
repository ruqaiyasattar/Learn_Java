import java.util.Random;

/**
 * Created by abc on 6/21/2016.
 */
//input:[4,3,1,6,4,3,6,4]
//output:[1,3,3,4,4,4,6,6]
public class Sort {
    public static void main(String[] args) {
        //int a[]={4,3,1,6,4,3,6,4};
        Random r = new Random();
        int a[] = new int[10];
        for (int j = 0; j < a.length; j++) {
            a[j] = r.nextInt(10);
        }//sorting
        for (int i = 0; i < a.length; i++) {
            int j;
            for (j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int t;
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for(int i:a){
            System.out.print(i+",");
        }
    }}
