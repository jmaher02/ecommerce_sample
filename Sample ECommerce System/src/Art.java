/**
 * The Computer class
 * 
 * Designed to store information about products for purchase
 * 
 * A few assumptions: 
 *   - All Art are wall hangings
 *   - size is the diagonal measurement in inches
 */


public class Art extends Product
{
	private String title, artist, medium;
	private int size;

	public Art(int itemNum, String name, double price)
	{
		super(itemNum, price, name);
	}

	public String displayCharacteristics()
	{
		return "";
	}
	
	public String showFeaturedPicture()
	{
		return "";
	}
}
