package CostomSorting;

import java.util.Comparator;

public class SortStudentByAge implements Comparator<Student> {
	@Override
	public int compare(Student x, Student y)
	{
		return x.age-y.age; // return y.age-x.age;
	}

}
