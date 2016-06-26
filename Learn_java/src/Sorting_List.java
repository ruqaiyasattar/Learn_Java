/**
 * Created by abc on 6/21/2016.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{

    @Override

    public int compare(String s1, String s2) {
        int len1=s1.length();
        int len2=s2.length();
        if(len1>len2){
            return 1;
        }
        if(len1<len2){
            return -1;
        }
        return 0;
    }

}
public class Sorting_List {
    public static void main(String[] args) {
        List<String> Friends =new ArrayList<String>();
        Friends.add("Marium");
        Friends.add("Zahi");
        Friends.add("Mah");
        Friends.add("Nyub");
        Friends.add("Zobia_kanwal");

        Friends.add("Jv");
        Friends.add("Farheen_naseem");
        Friends.add("Nuzhhhat");
        Friends.add("Kiran");

       // Collections.sort(Friends, new StringLengthComparator());
      for(String Friend:Friends){
    System.out.println(Friends);
}
        List<Integer> numbers =new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(23);
        numbers.add(76);
        numbers.add(56);
        numbers.add(20);
        numbers.add(1);
        numbers.add(90);
        numbers.add(45);
        numbers.add(9);
        numbers.add(4);
        Collections.sort(numbers);

        for(Integer number:numbers){
            System.out.println(numbers);
        }
    }
}
