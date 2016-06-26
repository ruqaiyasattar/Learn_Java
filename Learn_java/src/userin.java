/**
 * Created by abc on 6/12/2016.
 */
//import java.util.Scanner;
public class userin {
    public static void main(String[] args)
  throws java.io.IOException {
        int i;
i=(int)System.in.read();
        System.out.println((char)i);
        String str="";
        while((i=System.in.read())!=48){
str=str+(char)i;
        }
        System.out.println(str);
        /* Scanner s =new Scanner(System.in);
        String name;
        System.out.println("What is your name?");
        name=s.nextLine();
        System.out.println("");
       System.out.println("happy ramzan "+ name);*/

    }

}
