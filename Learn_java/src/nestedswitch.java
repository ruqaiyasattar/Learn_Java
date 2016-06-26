/**
 * Created by abc on 6/11/2016.
 */
public class nestedswitch {
    public static void main(String[] args) {
        char ch1 ='A';
        char ch2 ='A';
        switch (ch1){
            case 'A':
            System.out.println("this is part of outer switch "+ch1);


        switch (ch2){
            case 'A':
                System.out.println("this is part of inner switch "+ch2 );

        }
        }
    }
}
