package in.ac.adit.ajt;

import java.sql.SQLException;

//import java.awt.print.Book;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.setBookId(1001);
		book.setName("Harry potter");
		book.setAuthor("xy5500z");
		book.setPrice(1000);
		//book.addBook(book);
		
		
		
		BookDAOImpl book1=new BookDAOImpl();
		//book1.addBook(book);
		//System.out.println(book1.getBook(1001));
		//book1.deleteBook(2001);
		
		Book ubook=new Book();
		ubook.setBookId(3001);
		ubook.setName("SP");
		ubook.setAuthor("xyz");
		ubook.setPrice(5000);
	    //book1.addBook(ubook);
		//book1.updateBook(ubook);
		 System.out.println(book1.getAllBook());
		
	}

}
