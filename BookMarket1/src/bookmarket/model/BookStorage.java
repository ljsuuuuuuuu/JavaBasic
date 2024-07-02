package bookmarket.model;

import java.util.ArrayList;

public class BookStorage {

	ArrayList<Book> bookList = new ArrayList<Book>();

	public BookStorage() {
		bookList.add(new Book(2401, "쉽게 배우는 자바 프로그래밍 2판", "우종정", "한빛아카데미", 20000));
	}
	
	public int getNumBooks() {
		return bookList.size();
	}

	public String getBookInfo(int i) {
		return bookList.get(i).toString();
	}
	
	public boolean isValidBook(int bookId) {
		for (Book book : bookList) {
			if (book.getBookId() == bookId)
				return true;
		}
		return false;
	}

	public Book getBookId(int bookId) {
		for (Book book : bookList) {
			if (book.getBookId() == bookId)
				return book;
		}
		return null;
	}

}
