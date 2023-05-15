import java.util.*;

public class first{
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        n.add(10);
        n.add(20);
        n.add(40);
        n.add(15);
        n.add(19);
        n.add(26);
        n.add(100);
        System.out.println("Size of the Array "+n.size());
        System.out.println(n.contains(400));   // this function is return true if element is exist in the list
        // for(Integer x: n)
        // {
        //     System.out.println(x);
        // }
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("hello");
        System.out.println(ll);
        // n.addAll(0, n);
    }
}
