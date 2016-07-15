import java.util.Scanner;

/**
 * Created by abc on 7/15/2016.
 */
public class Char_At_Index {
    public static void main(String[] args) {
        String str ="abcdefghijklmnopqrstuvwxyz";
        System.out.println("The String is: " +str);
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the index at which the character is to be found ");
        int index =in.nextInt();
        if (index<=26){
            System.out.println("the character at the index "+index+" is: "+str.charAt(index));
        }
        else{
            System.out.println("Enter the number between 0 and 25");
        }
    }
}
