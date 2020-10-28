/**
 * The Music class
 * 
 * Designed to store information about products for purchase
 * 
 * A few assumptions: 
 *   - All Music are CD's / Records
 *   - released is the year of the album
 */


public class Music extends Product
{
	private String title, artist;
	private int released;
	private String[] tracks;
	
	public Music(int itemNum, String name, double price)
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
