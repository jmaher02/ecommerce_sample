/**
 * The Book class
 * 
 * Designed to store information about products for purchase
 * 
 * A few assumptions: 
 *   - ISBN13 should be used
 */


public class Book extends Product
{
	private String title, author;
	private int pages;
	private long isbn;
	
	public Book(int itemNum, String name, double price, String author, int pageCount, long isbn)
	{
		super(itemNum, price, name);
		this.title = name;
		this.author = author;
		pages = pageCount;
		this.isbn = isbn;
	}

	public String displayCharacteristics()
	{
		String display = "\nITEM " + getItemNumber() + " " + getName() + "\t" + printPrice() + "\n";
		
		display += "\tAUTHOR: " + author + "\n";
		display += "\tPAGE COUNT: " + pages + "\n";
		display += "\tISBN: " + isbn + "\n";
		
		return display;
	}
	
	public String showFeaturedPicture()
	{
		return title + " by " + author + "\n";
	}
	
	public String readSampleChapter()
	{
		return "Show preview of chapter 1\n";
	}

}
