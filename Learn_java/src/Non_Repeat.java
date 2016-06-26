import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by abc on 6/18/2016.
 */
public class Non_Repeat {
    public static void main(String[] args) {


/*
int [] mynumb={0,3,4,6,1,24,89,90};
        int[] rand=new int[100];
        for(int index=0;index<rand.length;index++){
rand [index]=(int)(Math.random()*100);
            System.out.println("Random numbers are :"+rand[index]);
        }*/
        //  System.out.println((int) (Math.random()*26));
        // System.out.println((int) ((Math.random()*21)+5);
        Scanner input = new Scanner(System.in);
        System.out.println("Input lowest number :");
        int min_num =input.nextInt();
        System.out.println("Input highest number :");
        int max_num =input.nextInt();
        System.out.println((int) ((Math.random()*(max_num-min_num))+min_num));

    }}