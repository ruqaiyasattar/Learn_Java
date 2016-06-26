import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by abc on 6/11/2016.
 */
//read a character from a program
public class keyInp {
    public static void main(String[] args)
    throws java.io.IOException{
        char ch;
        System.out.print("print any character: ");
        ch = (char) System.in.read();
        System.out.println("Your key is " + ch);
    }
}
