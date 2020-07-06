package oops;


public class BookImpl {

	public static void main(String[] args) {
		Book book = new Book(1, "jordan", "Robert Kiyosaki, Sharon Lechter");
		book.addReviews(new Reviews(1, "great book", 5));
		book.addReviews(new Reviews(2, "nice book", 4));

		System.out.println(book);
	}
}
