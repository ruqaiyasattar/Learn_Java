import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by abc on 6/25/2016.
 */
public class Game_Assign3 {
    public static void main(String[] args) {

/*public*/
        char[][] game = new char[3][3];
        game[0][0]=' ';
        game[0][1]=' ';
        game[0][2]=' ';
        game[1][0]=' ';
        game[1][1]=' ';
        game[1][2]=' ';
        game[2][0]=' ';
        game[2][1]=' ';
        game[2][2]=' ';
        System.out.println(  game[0][0] +"|"+  game[0][1] +"|"+  game[0][2]   );
        System.out.println("------");
        System.out.println(  game[1][0] +"|"+ game[1][1]   +"|"+ game[1][2]   );
        System.out.println("------");
        System.out.println( game[2][0]  +"|"+ game[2][1] +"|"+ game[2][2] );

    }}