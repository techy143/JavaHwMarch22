package techy.java.hw.march;

import java.util.ArrayList;
import java.util.Iterator;

public class HwIterator {


    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<String>();

        name.add("Mashuk");
        name.add("Jahid");
        name.add("Sabbir");
        name.add("Tauhid");
        name.add("Mamun");
        name.add("Humaun");

        // Iterator to traverse the list

        Iterator iterator = name.iterator();

        System.out.println("Name elements : ");

        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");


    }
}
