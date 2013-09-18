package cz.velim.sandbox.compare;

import java.util.Arrays;

public class CompareTest {

	public static void runTest() {

		Fruit[] fruits = new Fruit[4];

		Fruit pineappale = new Fruit("Pineapple", "brown", "Pineapple description", 70);
		Fruit apple = new Fruit("Apple", "red", "Apple description", 100);
		Fruit orange = new Fruit("Orange", "orange", "Orange description", 80);
		Fruit banana = new Fruit("Banana", "yellow", "Banana description", 90);

		fruits[0] = pineappale;
		fruits[1] = apple;
		fruits[2] = orange;
		fruits[3] = banana;

		Arrays.sort(fruits);

		printArray(fruits);
		
		Arrays.sort(fruits, new FruitNameComparator());

		printArray(fruits);
		
		Arrays.sort(fruits, new FruitColorComparator());

		printArray(fruits);
	}

	private static void printArray(Fruit[] fruits) {
		int i = 0;
		for (Fruit temp : fruits) {
			System.out.println("fruits " + ++i + " : " + temp.getFruitName()
					+ ", Quantity : " + temp.getQuantity() + ", Color : " + temp.getFruitColor());
		}
		System.out.println("");
	}

}
