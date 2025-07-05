import java.util.ArrayList;

public class arraylist {
public static void main(String[] args) {
    ArrayList<Integer>list = new ArrayList<>();
    list.add(67);
    list.add(456);
    list.add(565);
    list.add(90);
    list.add(987);
    list.add(89);
    list.add(897);
    list.add(697);
    list.add(6097);
    list.add(6877);
    list.add(637);
    
    //System.out.println(list.contains(6097));
   System.out.println(list.remove(3));
   System.out.println(list);
}
}
