/**
 * Created by abc on 6/19/2016.
 */
//19june java class
public class One_arr {
    public static void main(String[] args) {
       //one way of defining arrays         another way of defining array
       //one dimension array
/*int a[] =new int[4];                           // int i[]=new int[5];
        for( int i=0;i<4;i++){                 //  i[0]=1;
           // i[j]=j+1;
              a[0]=2;
            a[1]=4;
            a[2]=7;
            a[3]=8;
            System.out.println("a"+"["+i+"]"+"="+a[i]);         //   i[2]=3;
        }}*/
        //2nd dimension array
      /*  int x[][]=new int[2][2];
        x[0][0]=23;
        x[0][1]=21;
        x[0][2]=6;
        x[1][0]=26;
        x[1][1]=38;
        x[1][2]=29;
        x[2][0]=24;
        x[2][1]=26;
        x[2][2]=20;
        System.out.println(x[0][1]);
        }
*/
    //three ways of array declaration
  // int i[]=new int[5];
   /* int[]b=new int[5];
    int []c=new int[5];

    c[0]=7;
    int [][]x =new int[3][2];
    x[0][0] = 1 ;
  x[0][1] = 4;
    x[0][2] = 4;
   for(int i=0;i<x.length;i++){
       for(int j=0;j<x[i].length;j++){
            System.out.println("x["+i"]["+j+"]" + x[i][j]);*/

   /* int [][]a=new int[2][];
    a[0]=new int[3];
    a[1]=new int[5];
    int b[] = new int[2];
    b[0]=5;

//irregular arry;
    a[0]=new int[3];
    a[1]=new int[5];
   // rectangular arry;
    a[0]=new int[3];
    a[1]=new int[5];
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            System.out.println("a["+i+"]"+j+"[");
        }
    }*/
/*
int a[];
    int b[]=new int[3];
    int c[]=new int[]{2,4,5,6,7,8,10};
    System.out.println(c.length);
    for(int i=0;i<b.length;i++){
        System.out.println(b[i]);
    }
    System.out.println(c.length);
    for(int i=0;i<c.length;i++){
        System.out.println(c[i]);
    }
    int c[][]=new int[][]{
            {3,4,5},
            {1,2,5},
            {5,7,8,9}
    };
*/
   /* Assignment= 01prime number within arr

    user input;
    generate,
    every prime on each indexes;
        int i,k ,j;

    Scanner s =new Scanner(System.in);

        int a;
        System.out.println("Enter the range of array: ");
        a=s.nextInt();

        int num[]= new int[a];
System.out.println("Enter any number: ");
        num[a-1]=s.nextInt();
        System.out.println("");
        for(i=1;i<num.length;i++)
        {
        k = 0;
        for (j = 2; j < i; j++) {
        if (i % j == 0) {
        k = 1;
        break;
        }
        }
        if (k == 0) {
        System.out.println("a"+"["+i+"]"+"="+i + " ");
        }

        }
        }

        }
    */

    /*assign 2;
    multi dimension arry ka
            tic tac to;*/
        //self study stuff
//enhanced for loop:it dont count index number rather fetches only values from index
/*    int value[]={4,7,9,0,23};
        for (int i : value){
            System.out.println(i);
        }*/
    //2D array
        int p[][]={
            {0,1,2},
            {3,4,5},
            {6,7,8}
        };

    /*    System.out.println(  p[0][0] +"|"+  p[0][1] +"|"+  p[0][2]   );
        System.out.println("------");
        System.out.println(  p[1][0] +"|"+ p[1][1]   +"|"+ p[1][2]   );
        System.out.println("------");
        System.out.println( p[2][0]  +"|"+ p[2][1] +"|"+ p[2][2]   );*/
       /* for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(p[i][j]+",");

            }
            System.out.println(" ");
        }*/
//enhanced for loop for 2d array
  /*  for(int i[]:p){
        for (int j:i){

        System.out.print(j+" ");

    }
        System.out.println("");

    }*/

    }

        //jagged array or irregular array
     /*   int p[][]={
                {3,6,5,1},
                {3,0},
                {3,1,7},

        };
        //defining the size of jagged arrays
        //implement when we know the number of rows for sure
        // but dnt 9 the no. of columns
        int k[][]=new int[3][];
        k[0]=new int[4];
        k[1]=new int[2];
        k[2]=new int[3];


        for(int i[]:p){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println("");}*/
//3D array
       // int a[]=new int[4];
       // int b[][]=new int[4][4];
       // int c[][][]=new int[3][3][3];
//c[i][][]
       /* for (int i=0;i<3;i++){
            //c[][j][]
         for (int j=0;j<3;j++){
             //c[][][l]
             for (int l=0;l<3;l++){
                 c[i][j][l]=i+j+l;

             }
         }
        }*/
        /*//for printing the values
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                for (int l=0;l<4;l++){
                    System.out.print(" "+c[i][j][l]);
                }
                System.out.println(" ");
            }
        }*/

        //for printing the values in enhanced loop
        /*for (int i[][]:c){
            for (int j[]:i){
                for (int l:j){
                    System.out.print(" "+l);
                }
                System.out.println(" ");
            }
        }*/


    }

