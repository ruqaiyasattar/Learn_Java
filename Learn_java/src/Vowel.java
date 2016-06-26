/**
 * Created by abc on 6/18/2016.
 */
public class Vowel {
    public static void main(String[] args) {
    for(int i=65;i<91; i++){
        char c=(char)i;
        System.out.println(c);
        switch (c){
            case 'A':
                System.out.print(" IS VOWEL\n");
                break;
            case 'E':
                System.out.print(" IS VOWEL\n");
                break;
            case 'I':
                System.out.print(" IS VOWEL\n");
                break;
            case 'O':
                System.out.print(" IS VOWEL\n");
                break;
            case 'U':
                System.out.print(" IS VOWEL\n");
                break;
            default:
                System.out.print(" is not Vowel !\n");
                break;
        }

    }}
}
