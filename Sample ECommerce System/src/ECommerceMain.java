

import java.util.ArrayList;
import java.util.Scanner;

public class ECommerceMain 
{
	public static void title()
	{
		System.out.println("==========================");
		System.out.println("I                        I");
		System.out.println("I    ECOMMMERCE HOME     I");
		System.out.println("I         PAGE           I");
		System.out.println("I                        I");
		System.out.println("==========================");
	}
	
	public static void displayCategoryProducts(ArrayList<Product> products)
	{
		for(Product product : products)
		{
			System.out.println(product.getItemNumber() + ": " + product.showFeaturedPicture());
		}
	}
	
	public static Product searchCategory( ArrayList<Product> products, int itemNumber)
	{
		for(Product product: products)
		{
			if(product.getItemNumber() == itemNumber)
				return product;
		}
		
		return null;
	}

	public static void main(String[] args) 
	{	
		//Sample products in each category
		
		Computer comp1 = new Computer(100001, "Inspiron Desktop", 349.99, "Dell", 
				"10th Generation Intel® Core™ i3 Processor", 
				4, 1000, 21.5);
		Computer comp2 = new Computer(100002, "G3 15 Gaming Laptop", 599.99, "Dell", 
				"10th Generation Intel® Core™ i5 Processor", 
				8, 256, 15.6);
		
		Book book1 = new Book(200001, "Pride and Prejudice", 7.99, "Jane Austin",
				278, 9798684163333L);
		Book book2 = new Book(200002, "The Girl with the Dragon Tattoo", 10.99, "Steig Larsson",
				465, 9780307949486L);
		
		String[] songs = {"Rotten to the Core", "Evil Like Me", "If Only", "Be Our Guest", "Set It Off"};
		Music music1 = new Music(300001, "Descendants TV Movie Soundtrack", 14.99, "Various Artists", 
				2015, songs);
		
		System.out.println(music1.displayCharacteristics());
		//System.out.println(book2.showFeaturedPicture());
		
		
		
		//------ Catalog of all items ------//
		ArrayList<Product> allComps = new ArrayList<Product>();
		allComps.add(comp1);
		allComps.add(comp2);
		
		ArrayList<Product> allBooks = new ArrayList<Product>();
		allBooks.add(book1);
		allBooks.add(book2);

		ArrayList<Product>[] allProducts = new ArrayList[5];
		allProducts[1] = allComps;
		allProducts[2] = allBooks;
		Scanner input = new Scanner(System.in);
		
		//------- Start User Display ------//
		ECommerceMain.title();
		System.out.println("\nPlease set your User Account.");
		
		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();
		
		System.out.print("Enter your last name: ");
		String lastName = input.nextLine();
		
		System.out.print("Enter your email address: ");
		String email = input.nextLine();
		
		User user = new User(firstName, lastName, email);
		
		System.out.println("\n\nThank you for registering.");
		System.out.println(user);
		
		ECommerceMain.title();
		System.out.println("Welcome " + user.showFeaturedPicture());
		
		while(true)
		{
			int category = 0;
			
			System.out.println("Select a category to view products");
			System.out.println("\t1. Computers");
			System.out.println("\t2. Books");
			System.out.println("\t3. Art");
			System.out.println("\t4. Music");
			System.out.println("\tA. Account Details");
			System.out.println("\tC. View Cart");
			System.out.print("\nEnter your choice: ");
			char choice = input.nextLine().toUpperCase().charAt(0);
			
			switch(choice)
			{
			case '1': 	category = 1; break;
			case '2': 	category = 2; break;
			case 'A': 	System.out.println("\n\n=================");
						System.out.println("Your Account: ");
						System.out.println("=================");
						System.out.println(user); break;
			case 'C': 	System.out.println("\n\n=================");
						System.out.println("Your Cart: ");
						System.out.println("=================");
						System.out.println( user.getUserCart().displayCart() ); break;
			}
			
			while(category != 0)
			{
				System.out.println("\n\n=================");
				System.out.println("View Products: ");
				System.out.println("=================");
				ECommerceMain.displayCategoryProducts(allProducts[category]);
				System.out.println("Provide the item number for more details. ");
				System.out.println("OR Press (A) for Account Details");
				System.out.println("OR Press (B) to go back");
				
				System.out.print("\nEnter your choice: ");
				String detail = input.nextLine();
				
				choice = detail.toUpperCase().charAt(0);
				
				switch(choice)
				{
				case 'A': System.out.println("\n=================");
					System.out.println("Your Account: ");
					System.out.println("=================");
					System.out.println(user); break;
				case 'B': category = 0;
				default: 
					if(Character.isDigit(choice))
					{
						Product found = ECommerceMain.searchCategory(allProducts[category], Integer.parseInt(detail));
						if( found == null)
							System.out.println("\n\nITEM NOT FOUND");
						else
						{
							System.out.println("=================");
							System.out.println("Product Page: ");
							System.out.println("=================");
							System.out.println(found.displayCharacteristics());
							
							System.out.println("Press (C) to Add Product to Cart");
							System.out.println("OR Press (A) for Account Details");
							System.out.println("OR Press (B) to go back");
							
							System.out.print("\nEnter your choice: ");
							choice = input.nextLine().toUpperCase().charAt(0);
							
						}
					}
				}
				
			}
			
		}	
		
		//input.close();
	}

}
