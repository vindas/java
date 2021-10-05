package underscore;
import static java.util.Arrays.asList;

import java.util.List;

class Person implements Comparable<Person> {
    public final String name;
    public final Integer age;

    public Person(final String name, final Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        return person.age - this.age;
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }
}


public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		test.first();
	}

	 public void first() {
		 System.out.println(Underscore.first(asList(5, 4, 3, 2, 1)));
		 System.out.println(Underscore.chain(asList(5, 4, 3, 2, 1)).first(2).value());
		 
		 final List<Person> resultObjectChain =
				 Underscore.chain(
	                                asList(
	                                        new Person("moe", 40),
	                                        new Person("moe", 50),
	                                        new Person("curly", 60)))
	                        .uniq((Person person) -> person.name)
	                        .value();
		 System.out.println(resultObjectChain.toString());
    }
}
