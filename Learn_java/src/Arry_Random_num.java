import java.util.Random;

/**
 * Created by abc on 6/21/2016.
 */
public class Arry_Random_num {
    public static void main(String[] args) {
        /*Random r =new Random();
        int i[]=new int[10];
        for(int j=0;j<i.length;j++){
            i[j]=r.nextInt(10);
        }
      //  System.out.println(i[6]);
        for(int j:i){
            System.out.println(j);
        }*/
//Exceptional handling
        Random r =new Random();
        int i[]=new int[10];
        for(int j=0;j<i.length;j++){
            i[j]=r.nextInt(10);
        }
        try{
            System.out.println(i[16]);
        }
        //catch (Exception e)   OR
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Maximum index is 9");
        }
        for(int j:i){
            System.out.println(j);
        }
    }
}
