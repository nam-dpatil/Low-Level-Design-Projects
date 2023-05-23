package CostomSorting;

import java.util.TreeSet;

public class Solution {

	public static void main(String[] args) {
		TreeSet<Student> st= new TreeSet<Student>(new SortStudentByAge());
		st.add(new Student(20));
		st.add(new Student(100));
		st.add(new Student(80));
		
		for(Student s : st)
		{
			System.out.println(s);
		}

	}

}
