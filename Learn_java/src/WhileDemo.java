/**
 * Created by abc on 6/11/2016.
 */
public class WhileDemo {
    public static void main(String[] args) {
        char ch;
        ch= 'a';


        while (ch<='z'){
            System.out.print(ch+ "\t");
            ch++;

            if(ch=='z'){
                System.out.println("\n");
            }
        }
        ch='A';
        while (ch<='Z'){
            System.out.print(ch+ "\t");
            ch++;
        }

    }
}
