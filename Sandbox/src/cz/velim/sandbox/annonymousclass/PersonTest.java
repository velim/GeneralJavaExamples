package cz.velim.sandbox.annonymousclass;


public class PersonTest {

	public static void runTest() {
		
		IPerson person = new IPerson() {

			@Override
			public Integer getSalary() {
				return 0;
			}

			@Override
			public String getName() {
				return "mike";
			}

		};

		System.out.println(person.getSalary());
		System.out.println(person.getName());
	}

}
