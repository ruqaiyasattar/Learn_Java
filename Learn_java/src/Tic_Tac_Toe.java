import java.util.Scanner;
public class Tic_Tac_Toe {
    public static void main(String[] args) throws java.io.IOException{
        int p[][]={
                {0,1,2},
                {3,4,5},
                {6,7,8}
        };
        System.out.println(  p[0][0] +"|"+  p[0][1] +"|"+  p[0][2]   );
        System.out.println("------");
        System.out.println(  p[1][0] +"|"+ p[1][1]   +"|"+ p[1][2]   );
        System.out.println("------");
        System.out.println( p[2][0]  +"|"+ p[2][1] +"|"+ p[2][2] );
         Scanner s =new Scanner(System.in);
        int a,b;
        System.out.println("where do you want to put your cross?  ");
        a=s.nextInt();

        switch (a){
            case 0:
                char c[][]={
                {'x',' ',' '},
                {' ',' ',' '},
                {' ',' ',' '}
            };
                System.out.println(  c[0][0] +"|"+  c[0][1] +"|"+  c[0][2]   );
                System.out.println("------");
                System.out.println(  c[1][0] +"|"+ c[1][1]   +"|"+ c[1][2]   );
                System.out.println("------");
                System.out.println( c[2][0]  +"|"+ c[2][1] +"|"+ c[2][2] );
                break;
            case 1:
                char d[][]={
                        {' ','x',' '},
                        {' ',' ',' '},
                        {' ',' ',' '}
                };
                System.out.println(  d[0][0] +"|"+  d[0][1] +"|"+  d[0][2]   );
                System.out.println("------");
                System.out.println(  d[1][0] +"|"+ d[1][1]   +"|"+ d[1][2]   );
                System.out.println("------");
                System.out.println( d[2][0]  +"|"+ d[2][1] +"|"+ d[2][2] );
                break;
            case 2:
                char e[][]={
                        {' ',' ','x'},
                        {' ',' ',' '},
                        {' ',' ',' '}
                };
                System.out.println(  e[0][0] +"|"+  e[0][1] +"|"+  e[0][2]   );
                System.out.println("------");
                System.out.println(  e[1][0] +"|"+ e[1][1]   +"|"+ e[1][2]   );
                System.out.println("------");
                System.out.println( e[2][0]  +"|"+ e[2][1] +"|"+ e[2][2] );
                break;
            case 3:
                char f[][]={
                        {' ',' ',' '},
                        {'x',' ',' '},
                        {' ',' ',' '}
                };
                System.out.println(  f[0][0] +"|"+  f[0][1] +"|"+  f[0][2]   );
                System.out.println("------");
                System.out.println(  f[1][0] +"|"+ f[1][1]   +"|"+ f[1][2]   );
                System.out.println("------");
                System.out.println( f[2][0]  +"|"+ f[2][1] +"|"+ f[2][2] );
                break;
            case 4:
                char t[][]={
                        {' ',' ',' '},
                        {' ','x',' '},
                        {' ',' ',' '}
                };
                System.out.println(  t[0][0] +"|"+  t[0][1] +"|"+  t[0][2]   );
                System.out.println("------");
                System.out.println(  t[1][0] +"|"+ t[1][1]   +"|"+ t[1][2]   );
                System.out.println("------");
                System.out.println( t[2][0]  +"|"+ t[2][1] +"|"+ t[2][2] );
                break;
            case 5:
                char i[][]={
                        {' ',' ',' '},
                        {' ',' ','x'},
                        {' ',' ',' '}
                };
                System.out.println(  i[0][0] +"|"+  i[0][1] +"|"+  i[0][2]   );
                System.out.println("------");
                System.out.println(  i[1][0] +"|"+ i[1][1]   +"|"+ i[1][2]   );
                System.out.println("------");
                System.out.println( i[2][0]  +"|"+ i[2][1] +"|"+ i[2][2] );
                break;
            case 6:
                char m[][]={
                        {' ',' ',' '},
                        {' ',' ',' '},
                        {'x',' ',' '}
                };
                System.out.println(  m[0][0] +"|"+  m[0][1] +"|"+  m[0][2]   );
                System.out.println("------");
                System.out.println(  m[1][0] +"|"+ m[1][1]   +"|"+ m[1][2]   );
                System.out.println("------");
                System.out.println( m[2][0]  +"|"+ m[2][1] +"|"+ m[2][2] );
                break;
            case 7:
                char j[][]={
                        {' ',' ',' '},
                        {' ',' ',' '},
                        {' ','x',' '}
                };
                System.out.println(  j[0][0] +"|"+  j[0][1] +"|"+  j[0][2]   );
                System.out.println("------");
                System.out.println(  j[1][0] +"|"+ j[1][1]   +"|"+ j[1][2]   );
                System.out.println("------");
                System.out.println( j[2][0]  +"|"+ j[2][1] +"|"+ j[2][2] );
                break;
            case 8:
                char z[][]={
                        {' ',' ',' '},
                        {' ',' ',' '},
                        {' ',' ','x'}
                };
                System.out.println(  z[0][0] +"|"+  z[0][1] +"|"+  z[0][2]   );
                System.out.println("------");
                System.out.println(  z[1][0] +"|"+ z[1][1]   +"|"+ z[1][2]   );
                System.out.println("------");
                System.out.println( z[2][0]  +"|"+ z[2][1] +"|"+ z[2][2] );
                break;

        }

    }
    }

