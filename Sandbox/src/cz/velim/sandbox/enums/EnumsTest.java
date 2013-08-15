package cz.velim.sandbox.enums;

public class EnumsTest {

	public static void runTest() {
		for (Currency coin : Currency.values())
			System.out.println(coin);

		Currency usCoin = Currency.NICKLE;
		switch (usCoin) {
		case PENNY:
			System.out.println("Penny coin");
			System.out.println(usCoin.color());
			break;
		case NICKLE:
			System.out.println("Nickle coin");
			System.out.println(usCoin.color());
			break;
		case DIME:
			System.out.println("Dime coin");
			System.out.println(usCoin.color());
			break;
		case QUARTER:
			System.out.println("Quarter coin");
			System.out.println(usCoin.color());
		}

	}
}
