/**
 * Created by abc on 6/23/2016.
 */
public class String_Demo {
    public static void main(String[] args) {
        String s="Hafsa,marium,naina,xara";
        String name[]=s.split(",");
       // System.out.println(name[3]);
        for (String val:name){
            System.out.println(val);
        }
    }
}
