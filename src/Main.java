
public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("AAA"));
		bookShelf.appendBook(new Book("BBB"));
		bookShelf.appendBook(new Book("CCC"));
		bookShelf.appendBook(new Book("DDD"));
		bookShelf.appendBook(new Book("EEE"));
		Iterator it = bookShelf.iterator();
		while(it.hasNext()){
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}

}
