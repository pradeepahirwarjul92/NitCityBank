package com.heg.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorPrevents {
	public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // This will throw ConcurrentModificationException
        for (String name : names) {
            if (name.equals("Bob")) {
                names.remove(name);  // ❌ This modification causes the exception
            }
        }

        System.out.println(names);
        
        
        List<String> names1 = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        ListIterator<String> listIterator = names1.listIterator();

        while (listIterator.hasNext()) {
            String name = listIterator.next();
            if (name.equals("Bob")) {
                listIterator.set("Bobby"); // ✅ Modify element
            }
        }

        System.out.println(names);  // Output: [Alice, Bobby, Charlie]

        
    }

}
