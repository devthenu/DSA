import java.util.Collection;
import java.util.LinkedList;

public class CollectionPractical1 {

    public static void main(String[] args) {
        Collection<Integer> c = new LinkedList<>();

        c.add(15);
        c.add(25);
        c.add(50);
        c.add(85);
        c.add(99);

        System.out.println("Is the collection empty? " + c.isEmpty());

        System.out.println("Size of the collection: " + c.size());

        System.out.println("Does the collection contain 50 ? " + c.contains(50));

        c.remove(85);

        System.out.println("Elements in the collection after removal: " + c);
    }
}
