package cf;

import java.util.HashSet;
import java.util.Set;

/// in order for 2 items in Set regarded as duplicated 
// it has to match 2 condition 
/// object1.equal(object2) must be true
/// object1.hashcode == object2.hashcode must be true

public class Person {

	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// @Override
	// public boolean equals(Object obj) {
	//
	// Person p = (Person) obj ;
	// return this.name.equals(p.name) && this.age == p.age ;
	// }
	//
	// @Override
	// public int hashCode() {
	// return 100;
	// }

	public static void main(String[] args) {

		Set<Person> personSet = new HashSet<>();
		personSet.add(new Person("adam", 25));
		personSet.add(new Person("adam", 25));
		personSet.add(new Person("adam", 25));
		personSet.add(new Person("adam", 25));

		// System.out.println( new Person("adam",25).toString() );
		// System.out.println( new Person("adam",25).toString() );

		System.out.println(personSet.size());

	}

}