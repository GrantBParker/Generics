
public class GenericTester {

	public static void main(String[] args) {
		
		DataSetGeneric<Book> book = new DataSetGeneric<>();
		DataSetGeneric<Boat> boat = new DataSetGeneric<>();
		
		Book idk = new Book("Someone", "Somthing", 10000);
		Book who = new Book("Who", "What", 100);
		
		Boat titanic = new Boat("Titanic", 50000,10000);
		Boat toottoot = new Boat("toot", 2, 1);
		
		book.add(idk);
		book.add(who);
		
		boat.add(titanic);
		boat.add(toottoot);
		
		System.out.println(book.toString());
		System.out.println(boat.toString());
		
	}

}
