/**
 * Created by abc on 6/12/2016.
 */
public class DWdemo {
    public static void main(String[] args) throws java.io.IOException{
        char ch;
        do{
            System.out.print("press a key followed by  ENTER");

            ch=(char) System.in.read();
        }while(ch!='q');
    }
}
