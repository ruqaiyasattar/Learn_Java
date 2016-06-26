/**
 * Created by abc on 6/24/2016.
 */

import java.util.Scanner;

class bigest {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println ("how many number you want to put in the pot?");
        int num = input.nextInt();
        int numbers[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println ("number" + i + ":");
            numbers[i] = input.nextInt();
        }

        for (int temp : numbers){
            System.out.print (temp + "\t");
        }
        /*int numbers[][];
        numbers = new int[10][10];
        for (int x = 0; x < 10; x++)
        {
            for (int y = 0; y < 10; y++)
            {
                numbers[x][y] = (int)(Math.random() * 100) + 1;
            }
        }*/
    }
}