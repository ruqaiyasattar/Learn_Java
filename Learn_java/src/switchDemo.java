/**
 * Created by abc on 6/11/2016.
 */
public class switchDemo {
    public static void main(String[] args) {
        int x;
        for (x = 0; x <= 10; x++) {
            switch (x) {
                case 0:
                    System.out.println("pointer is at zero location");
                    break;
                case 1:
                    System.out.println("pointer is at one's location");
                    break;
                case 2:
                    System.out.println("pointer is at two's location");
                    break;
                case 3:
                    System.out.println("pointer is at third's location");

                    break;
                case 4:
                    System.out.println("pointer is at fourth location");
                    break;
                default:
                    System.out.println("x exceeds towards more than four location x"+x);

            }
        }
    }}