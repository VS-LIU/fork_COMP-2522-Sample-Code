package code.arraylist;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Demonstrates the use of the toArray method in collections.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public final class UsingToArray {

    private UsingToArray() { }

    /**
     * Constructs an object of type UsingToArray.
     */
    public static void toArrayDemo() {
        String[] colours = {"black", "blue", "yellow"};

        final LinkedList<String> links = new LinkedList<>(Arrays.asList(colours));
        links.addLast("red"); // add as last item
        links.add("pink"); // add to the end
        links.add(3, "green"); // add at 3rd index
        links.addFirst("cyan"); // add as first item

        colours = links.toArray(new String[0]);

        System.out.println("colours: ");
        for (String color : colours) {
            System.out.println(color);
        }

    }

    /**
     * Drives the program.
     *
     * @param args command line arguments (unused)
     */
    public static void main(final String[] args) {
        UsingToArray.toArrayDemo();
    }
}
