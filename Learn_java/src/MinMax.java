/**
 * Created by abc on 6/25/2016.
 */
public class MinMax {
    public static void main(String[] args) {

        int min,max,i;
        int num[]=new int[10];
        num[0]=10;
        num[1]=20;
        num[2]=24;
        num[3]=3456;
        num[4]=78;
        num[5]=67;
        num[6]=123;
        num[7]=90;
        num[8]=-10;
        num[9]=10;
        min=max=num[0];
        for (i=1;i<10;i++){
            if (num[i]<min)min=num[i];
            if (num[i]>max)max=num[i];
        }
        System.out.println("min is: "+min+"max is: "+max);
    }
}
 /*   Scanner Input=new Scanner(System.in);
System.out.println("Quit y/n");
        String astr =Input.next();
        char achar = astr.charAt(0);
        if (achar=='y'){
        System.out.println("ok by!");}
        else {
        System.out.println("stay here");
        }*/