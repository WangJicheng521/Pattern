
public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appenBook(new Book("AAAAA"));
		bookShelf.appenBook(new Book("BBBB"));
		bookShelf.appenBook(new Book("CCCC"));
		bookShelf.appenBook(new Book("DDDDD"));
		Iterator it = bookShelf.iterator();
		while(it.hasNext()){
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}

}
