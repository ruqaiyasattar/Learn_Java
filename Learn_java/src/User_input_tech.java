/**
 * Created by abc on 6/20/2016.
 */
public class User_input_tech {
    public static void main(String[] args) throws java.io.IOException{
        /*int i= System.in.read();

        System.out.println(i);*/
        int i= System.in.read();

      //  System.out.println((char) i);
        String str ="";
        while((i=System.in.read())!=48){
            str=str+(char)i;
        }
        System.out.println(str);

    }
}
