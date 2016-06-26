/**
 * Created by abc on 6/11/2016.
 */
public class GuessLettr {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, answer = 'k';
        System.out.println("I am thinking of letters from b/w A to Z: ");
        System.out.println("can you guess it? ");
        ch = (char) System.in.read();
        if (ch == answer) System.out.println("***RIGHT...HURRAY!****");
        else {
            System.out.println("try again! don't give up!..***  \n");

        if (ch <answer) System.out.println(" it's too low");
        else
            System.out.println("it's too high...");

    }}
}