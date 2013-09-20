package cz.velim.sandbox.exceptions;

public class ExceptionsTest {

	public static void runTest() {
		try {
			throwException();
		} catch (MyException e) {
			System.out.println(e.getMessage());	
			e.printStackTrace();
		}
	}

	@SuppressWarnings("null")
	static void throwException() throws MyException {

		Integer bigI = null;

		try {

			if (bigI.equals(new Integer(2))) {
				System.out.println("equal");
			} else {
				System.out.println("not equal");
			}

		} catch (Exception e) {
			System.out.println("exception");
			e.printStackTrace();
			throw new MyException("my message");
		} finally {
			System.out.println("finally");
			System.out.println("closing sources");
		}

	}

}
