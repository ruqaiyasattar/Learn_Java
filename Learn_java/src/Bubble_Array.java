/**
 * Created by abc on 6/25/2016.
 */
public class Bubble_Array {
    public static void main(String[] args) {
       // bubble sort
      /*  int num[]={99,67,45,23,10};
        int a,b,t;
        int size=5;
        System.out.println("original array:");
        for (int val:num){
            System.out.print(val+"\t");
        }
        for ( a=1;a<size;a++)
            for (b=size-1;b>=a;b--){
                if (num[b-1]>num[b]){
                    t=num[b-1];
                    num[b-1]=num[b];
                    num[b]=t;
                }
            }
        System.out.println("\nSorted array:");
        for (int sort:num){
            System.out.print(sort+"\t");
        }
*/
        int tab[][]=new int[3][4];
        for (int t=0;t<3;++t){
            for (int i=0;i<4;++i){
                tab[t][i]=(t*4)+i+1;
                System.out.print(tab[t][i]+"\t ");
            }
            System.out.println();
        }
    }
}
