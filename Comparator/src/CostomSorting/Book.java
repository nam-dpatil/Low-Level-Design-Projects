package CostomSorting;

import java.util.TreeSet;

public class Book implements Comparable<Book>{
	private String bookName;
	private int bookId;
	private int year;
	public Book(String name)
	{
		bookName=name;
	}
	
 public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString()
	{
		return "BookName : "+bookName;
	}
	public int compareTo(Book obj)
	{
		return obj.bookName.compareTo(this.bookName);
	}

	public static void main(String[] args) {
//		SortBookById s=new SortBookById();
//		TreeSet<Book> ts=new TreeSet<Book>(s);
//		Book b1=new Book();
//		b1.setBookId(20);
//		ts.add(b1);
//		Book b2=new Book();
//		b2.setBookId(30);
//		ts.add(b2);
//		Book b3=new Book();
//		b2.setBookId(10);
//		ts.add(b2);
//		for(Book obj:ts)
//		{
//			System.out.println(obj);
//		}
		
		
		
		
		
		
		
		

	}

	

}
