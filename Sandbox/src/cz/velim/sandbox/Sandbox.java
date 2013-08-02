package cz.velim.sandbox;

public class Sandbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
