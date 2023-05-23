package CostomSorting;

import java.util.Comparator;

public class SortBookById implements Comparator<Book>{
	@Override
	public int compare(Book x, Book y)
	{
		return x.getBookId().compareTo(y.getBookId());
		
	}

	


}
