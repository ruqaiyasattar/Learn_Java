/**
 * Created by abc on 6/11/2016.
 */
public class NoBreak {
    public static void main(String[] args) {
        int i;
        for(i=0;i<=5;i++){
            switch (i){
                case 0:

                case 1:

                case 2:

                case 3:
                    System.out.println("* :"+i);
                    break;
                case 4:
                    System.out.println("*... "+i);
                    break;
            }
            System.out.println("x"+i);


        }
    }
}
