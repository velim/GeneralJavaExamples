package cz.velim.sandbox.compare;

import java.util.Comparator;

public class FruitColorComparator implements Comparator<Fruit> {
	
	public int compare(Fruit fruit1, Fruit fruit2) {

		String fruitName1 = fruit1.getFruitColor().toUpperCase();
		String fruitName2 = fruit2.getFruitColor().toUpperCase();

		// ascending order
		return fruitName1.compareTo(fruitName2);

		// descending order
		// return fruitName2.compareTo(fruitName1);
	}

}
