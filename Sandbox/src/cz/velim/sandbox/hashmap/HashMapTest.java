package cz.velim.sandbox.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class HashMapTest {

	public static void runTest() {

		Map<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "test 1");
		hm.put(2, "test 2");
		
		System.out.println("get bytes - " + hm.get(1).getBytes());
		System.out.println("get bytes - " + hm.get(2).getBytes());
		
		Set<Entry<Integer, String>> s = hm.entrySet();

		for (Entry<Integer, String> entry : s) {

			System.out.println(entry.hashCode());
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}

		System.out.println("done");
		
		Set<Integer> hs = new TreeSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(2); // duplicate value 2 - not allowed
		System.out.println(hs.size()); // prints "3"
		
		System.out.println("adam".compareToIgnoreCase("Bedøich"));
		
	}

}
