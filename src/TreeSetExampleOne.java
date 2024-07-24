import java.util.SortedMap;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetExampleOne {
    public static void main(String[] args) {
        TreeSet<Integer> num_TreeSet = new TreeSet<>();
        num_TreeSet.add(20);
        num_TreeSet.add(5);
        num_TreeSet.add(15);
        num_TreeSet.add(25);
        num_TreeSet.add(10);

        //Call iterator() method to define Iterator for TreeSet
        Iterator<Integer> iter_set = num_TreeSet.iterator();
        System.out.println("TreeSet using Iterator: ");

        //access treeset elements using iterator

        while(iter_set.hasNext()){
            System.out.print(iter_set.next());
            System.out.print(", ");
        }
    }
}
