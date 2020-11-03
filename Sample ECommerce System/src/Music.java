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
	
	public Music(int itemNum, String title, double price, String artist, int year, String[] songs)
	{
		super(itemNum, price, title + " BY " + artist);
		this.title = title;
		this.artist = artist; 
		released = year;
		tracks = songs;
	}

	public String displayCharacteristics()
	{
		String display = "\nITEM " + getItemNumber() + " " + getName() + "\t" + printPrice() + "\n";
		
		display += showTracks();
		display += "RELEASED: " + released + "\n";

		return display;
	}

	private String showTracks()
	{
		String trackOutput = "";
		
		for(int i = 0; i < tracks.length; i++)
		{
			trackOutput += "\t" + (i+1) + ".) " + tracks[i] + "\n";
		}
		
		return trackOutput;
	}
	
	public String showFeaturedPicture()
	{
		return getName();
	}

}
