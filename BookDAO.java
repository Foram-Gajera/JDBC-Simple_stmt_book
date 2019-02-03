package in.ac.adit.ajt;

public interface BookDAO {
	final String DRIVER="com.mysql.jdbc.Driver";
	final String URL="jdbc:mysql://localhost:3306/book_mgt";
	final String DBUSER="root";
	final String DBPASSWORD="";
	
	public Boolean addBook(Book book);
	public Book getBook(int BookId);
	public Boolean updateBook(Book book);

}
