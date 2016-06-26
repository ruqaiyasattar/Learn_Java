/**
 * Created by abc on 6/15/2016.
 */
public class var {
    public static void main(String[] args) {
        float a= 6.5f;
        float b= 3.3f;
        System.out.println(a+b);
        char c='M',
        x='m';
        System.out.println((int)c);
        System.out.println((int)x);
        System.out.println((int)c+(int)x);
        System.out.println(""+(int)c+" "+(float)x);
        System.out.println(""+(char)73+" "+(char)76+(char)111+(char)118+(char)69+" "+(char)121+(char)111+(char)117);
        byte w=8;
       // w=(byte)w *2.5;
        w*=2.5;
        System.out.println(w);
        int f=0B10111111;//by adding 0B in front of 0101's it would convert from 01's to binary number
        int r=0b01_01_01_01_11_11_11_11_11_11_00_00;
        System.out.println(f);
        System.out.println(r);
    }
}
