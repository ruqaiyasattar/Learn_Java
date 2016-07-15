import java.util.Scanner;

/**
 * Created by abc on 6/12/2016.
 * patterns
 */

public class pattren {
    public static void main(String[] args) {
        /*int i,j;
        for(i=1;i<5;i++){              //****
            for(j=1;j<5;j++){          //****
                System.out.print("*"); //****
            }                          //****
            System.out.println(" ");
        }*/
        /*int i,j;                       //*
        for(i=1;i<=6;i++){               //**
            for (j=1;j<=i;j++){          //***
                System.out.print("*");   //****
            }
            System.out.println(" ");

        }*/
        /*int i,j;                          //****
        for(i=1;i<5;i++){                     *  *
            for(j=1;j<5;j++){                 *  *
                if(i==1|i==4|j==1|j==4){      ****
                System.out.print("*");
            }
            else
            System.out.print(" ");

            }
            System.out.println("");}*/
               /* int i,j;
        for(i=1;i<=4;++i){
            for (j=1;j<=i;++j){          //1
                System.out.print(i);     //22
            }                            //333
            System.out.println(" ");     //4444

        }
*/
 /*       int i,j;
        for(i=1;i<5;i++){
            for(j=1;j<5;j++){        //1234
                //int sum=i*j;       //1234
                System.out.print(j); //1234
                                     //1234
            }
            System.out.println(" ");
        }*/
        /*int i,j;
        for(i=1;i<=4;i++){
            for(j=1;j<=4;j++){          //1234
                        int k=i+j-1;    //2341
                if(k>4)                 //3412
               System.out.print(k-4);   //4123
                   else
                    System.out.print(k);
            }
            System.out.println("");
    }
    System.out.println("");*/
        /*int i,j;
        for(i=1;i<8;i++){
            for(j=1;j<i;j++){          //1
                  if ((i+j)%2==0)      //01
                System.out.print("0"); //101
                else                   //0101
                System.out.print("1");
            }
            System.out.println(" ");
        }*/
        /*int a,b;                       //    *
        for(a=0;a<5;a++){                //   * *
            for (b=0;b<5-a;b++){         //  * * *
                System.out.print(" ");   // * * * *
            }                          /*//* * * * *
            for(int z=0;z<=a;z++) {
                System.out.print(" *");
                continue;
            }
            System.out.println("");
        }*/
      /*  int i,j;
        for(i=1;i<=9;++i){
            for (j=1;j<=i;++j){          //1
                System.out.print(j+"");  //12
            }                            //123
            System.out.println(" ");     //1234

        }


        }
    }*/
/*        int i, k, j;
        *//*Scanner s = new Scanner(System.in);
        int a;
        System.out.println("Enter the size of array: ");
        a = s.nextInt();*//*
        int num[] = new int[10];
        *//*System.out.println("Enter the range of prime number: ");
        num[a-1]=s.nextInt();*//*
        System.out.println("");
        for (int h = 0; h < num.length; h++) {
            for (i = 2; i < 8; i++) {
                k = 0;
                for (j = 2; j < i; j++) {
                    if (i % j == 0) {
                        k = 1;
                        break;
                    }
                }
                if (k == 0) {
                System.out.println(i + " ");

                }
            }
       }
    }
}*/
        int a,i;
        System.out.println("Enter the size of array: ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        int num[]=new int[a];
        boolean fix=true;
for (i=1;i<num.length;i++){
for (int j=2;j<i;j++){
if(i%j==0){
    fix=false;
    System.out.println("\t:it's not prime");
    break;
}
    else if(fix=true) {

    for (int k=0;k<num.length;k++){
        System.out.println("["+k+"]"+"="+i);
    }
    }

    }
}
}
    }