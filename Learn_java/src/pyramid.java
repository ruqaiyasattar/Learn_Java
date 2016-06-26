/**
 * Created by abc on 6/19/2016.
 */
public class pyramid {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int k=0;k<5-i;k++){       //   *
                System.out.print(" ");   //   ***
                                    //       *****
            }
            for(int j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.println("");

        }
        for(int i=7;i>0;i-=2){          //********
            for(int k=0;k<7-i;k++){     // ******
                System.out.print(" ");  //  ***
                                       //    *
            }
            for(int j=0;j<i;j++){
                System.out.print(" *");
            }
            System.out.println("");

        }

       /* for(int i=0;i<5;i++){
            for(int k=0;k<i-5;k++){
                System.out.print(" ");

            }                          //*
            for(int j=0;j<i;j++){      //**
                System.out.print(" *");//***
            }                          //****
            System.out.println("");

        }
       */


    }}

