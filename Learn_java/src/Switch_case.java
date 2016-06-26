/**
 * Created by abc on 6/15/2016.
 */
public class Switch_case {
    public static void main(String[] args) {
        /*for(int i=0;i<=4;i++){
            switch (i){
                case 0:
                    System.out.println("now i is at zero");
                    break;
                case 1:
                    System.out.println("now i is at one");
                    break;
                case 2:
                    System.out.println("now i is at two");
                    break;
                case 3:
                    System.out.println("now i is at three");
                    break;
                case 4:
                    System.out.println("now i is at four ");
                    break;
                case 5:
                    System.out.println("greater then 4");
            }*/
String s ="Ruqx";
        switch (s){
            case "Mu":
                System.out.println("it would not execute");
                break;
            case "it":
                System.out.println("it would not execute");
                break;
            case "Ruqx":
                System.out.println("String matches to this case");
                break;
            case "Rux":
                System.out.println("now i is at three");
                break;
            case "Hello":
                System.out.println("now i is at four ");
                break;
            default:
                System.out.println("Nothing matches");
        }

    }
}
