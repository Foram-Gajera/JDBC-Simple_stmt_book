package in.ac.adit.ajt;

public class Book {
	private int BookId;
	private String Name;
	private String Author;
	private int price;
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int i) {
		this.price = i;
	}
	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", Name=" + Name + ", Author=" + Author + ", price=" + price + "]";
	}
	
	
}
