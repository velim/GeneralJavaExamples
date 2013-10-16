package temp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.UUID;

class Foo {
	public Long getLength() {
		return new Long(4);
	}
}

public class Temp extends Foo {

	public Integer getLength(int val) {// -- nelze - zdedena trida nesmi menit
		// navratovy typ method
		// public Long getLength() {
		return new Integer(5);
		// return new Long(5);
	}

	public static void main(String[] args) {
		Foo foo = new Foo();
		Temp temp = new Temp();
		System.out.println(foo.getLength().toString() + ","
				+ temp.getLength().toString());
		System.out.println();

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(2, "hi");
		hm.put(1, "ahoj");

		// Set<Integer> ks = hm.keySet();
		// for (Integer key : ks)
		// System.out.println(hm.get(key));

		List<String> list = Arrays.asList("a", "x", "a", "a", "a", "a", "x", "a", "a");
		for (String s : list) {
			System.out.println(s);
		}

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(2, "abc");
		tm.put(3, "def");
		tm.put(1, "klm");

		Iterator<Entry<Integer, String>> it = tm.entrySet().iterator();

		while (it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			// System.out.println(entry.getKey() + "/" + entry.getValue());
		}

		// treemap test
		Map<Integer, Person> hmap = new TreeMap<Integer, Person>( // sorting
																	// treemap
																	// using
																	// comparator
				new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						return o1 - o2;
					}
				});
		for (int i = 0; i < 50; i++)
			hmap.put(i, new Person(String.valueOf(i), UUID.randomUUID()
					.toString()));

		// sort by arraylist
		List<Person> lp = new ArrayList<Person>(hmap.values());
		Collections.sort(lp, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// return o1.getUUID().compareTo(o2.getUUID());
				String s1 = o1.getUUID().split("-")[1];
				String s2 = o2.getUUID().split("-")[1];
				return s1.compareTo(s2);
			}

		});

		// sorted arraylist - sorted by UUID by Comparator
		for (Person p : lp) {
			// System.out.println(p.getName());
			//System.out.println(p.getUUID());
		}

		System.out.println(" * * * * * * *");

//		// iterate via keys
//		for (Integer key : hmap.keySet()) {
//			System.out.println(key.hashCode());
//			System.out.println(hmap.get(key).getName());
//			System.out.println(hmap.get(key).getUUID());
//		}

		System.out.println("\n * * * * * * *");

		// iterate using iterator from entrySet
		// Iterator<Entry<Integer, Person>> hmit = hmap.entrySet().iterator();
		// while (hmit.hasNext()) {
		// Person pers = hmit.next().getValue();
		// System.out.println(pers.getName());
		// System.out.println(pers.getUUID());
		// }

		System.out.println(test());

	}

	@SuppressWarnings("finally")
	private static int test() {
		try {
			throw new IOException();
		} catch (Exception e) {
			System.out.println("catch");
			return 1;
		} finally {
			return 2;
		}

	}

	// static void test(Map map){
	// map.
	// }

}
