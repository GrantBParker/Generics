

import java.util.ArrayList;

/**
 * A simple store for Book objects.
 * 
 * @author student
 *
 */
public class DataSetBook{
	
	private ArrayList<Book> data;

	/**
	 * Default constructor
	 */
	public DataSetBook() {
		data = new ArrayList<>();
	}
	
	/**
	 * Add a Book to the store
	 * 
	 * @param objToAdd Book to add
	 */
	public void add(Book objToAdd) {
		data.add(objToAdd);
	}
	
	/**
	 * The number of Books currently in the store
	 * 
	 * @return number of Book objects
	 */
	public int size() {
		return data.size();
	}
	
	/**
	 * Determine the Book with the fewest pages
	 * 
	 * @return null if the store is empty.  The book with the fewest pages
	 * otherwise.  If more than one book has the fewest number of pages,
	 * the first one is returned.
	 */
	public Book getMin() {
		if (data.isEmpty()) {
			return null;
		}
		Book mEle = data.get(0);
		for (int i = 1; i < data.size(); i++) {
			if (mEle.getPages() > (data.get(i).getPages())) {
				mEle = data.get(i);
			}
		}
		return mEle;
	}

	/**
	 * Determine the Book with the most pages
	 * 
	 * @return null if the store is empty.  The book with the most pages
	 * otherwise.  If more than one book has the most number of pages,
	 * the first one is returned.
	 */
	public Book getMax() {
		if (data.isEmpty()) {
			return null;
		}
		Book mEle = data.get(0);
		for (int i = 1; i < data.size(); i++) {
			if (mEle.getPages() < (data.get(i).getPages())) {
				mEle = data.get(i);
			}
		}
		return mEle;
	}

	/**
	 * A String representation of the store.
	 * 
	 * @return A String containing the number of books in the store, 
	 * the minimum book, the largest book, and 
	 * the contents of the entire store.
	 */
	@Override
	public String toString() {
		return "DataSetBook [\n size()=" + size() + "\n getMin()=" + getMin() + " getMax()=" + getMax()
				+ " Books=\n" + data.toString() + "]";
	}



	

}
