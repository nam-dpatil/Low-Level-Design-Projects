package CostomSorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSet1 {
	

	public static void main(String[] args) {
		Map<Book,String> hs= new HashMap<Book,String>();
		hs.put(new Book("A"),"java");
		hs.put(new Book("D"),"sql");
		hs.put(new Book("C"),"springs");
		hs.put(new Book("B"),"hibernate");
		hs.put(new Book("E"),"web");
		
		
//		System.out.println(hs);
		
		Set<Book> keys = hs.keySet();
		for(Book key:keys)
		{
			System.out.println(key);
		}
		
		

	}

}
