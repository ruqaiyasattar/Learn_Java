/**
 * Created by abc on 6/11/2016.
 */
public class help {
    public static void main(String[] args)
    throws java.io.IOException{
        char choice;
        System.out.println("Help on:");
        System.out.println("A. if");
        System.out.println("B. Switch");
        System.out.println("Choose one:");
    choice =(char) System.in.read();
    switch (choice){
        case 'A':
            System.out.println("The if;\n");
            System.out.println("if(Condition)statement;");
            System.out.println("else statement;");
            break;
        case 'B':
            System.out.println("The switch ;\n");
            System.out.println("switch(expression){;");
            System.out.println("case(constant)");
            System.out.println("sequences of statment");
            System.out.println("break:");
            System.out.println("//......");
            System.out.println("}");
            break;
        default:
            System.out.println("Selection not found...!");

    }
    }
}
