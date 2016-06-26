/**
 * Created by abc on 6/15/2016.
 *///bitwise AND & , OR |
public class Bitwise_and_Or {
    public static void main(String[] args) {
        int a=0b001110;
        int b=0b111010;//111110
        int c=a&b;
        int z=a|b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c+" "+z);//001010
        int s=8;//1000
        int y=s<<2;//100000. :32
        System.out.println(y);
int e=25;
        System.out.println(e);
        int w=e>>3;//11001 in right shift left wali bits remove hongein i.e 3
        System.out.println(w);
    }
}
