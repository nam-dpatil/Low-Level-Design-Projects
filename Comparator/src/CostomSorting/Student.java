package CostomSorting;

public class Student {
	int age;

	public Student(int age) {
		super();
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "age: "+age;
	}

}

/* Rules:
 * 1.Create a new class which implements comparator interface & import from java.util. package.
 * 2. Specify generics.
 * 3. Override compare().
 * 		Syntax : public int compare(Element e1, Element e2);
 * 4. create an Object of the sorting logic class & pass it to the constructor of TreeSet.
*/