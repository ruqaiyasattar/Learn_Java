/**
 * Created by abc on 6/11/2016.
 */
public class looping {
    public static void main(String[] args)
    throws java.io.IOException{
        int i;
        /*for(i=0, j=10;i<j;++i,--j){
            System.out.println("i and j " + i +"\t"+ j);
        }*/
        System.out.println("press S to stop. ");
        for(i=0; (char) System.in.read()!='S';i++)
            System.out.println("pass# "+i);
        }

    }

