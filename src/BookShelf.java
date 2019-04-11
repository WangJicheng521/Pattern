import java.util.ArrayList;

public class BookShelf implements Aggregate {
	private ArrayList<Book> books;
	
	public BookShelf(int maxsize){
		this.books = new ArrayList<Book>(maxsize);
	}
	public int getLength(){
		return books.size();
	}
	public void appendBook(Book book){
		this.books.add(book);
	}
	public Book getBook(int index){
		return this.books.get(index);
	}
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}
