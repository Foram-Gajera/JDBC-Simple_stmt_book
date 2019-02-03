package in.ac.adit.ajt;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAOImpl implements BookDAO{
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	private String query;
	
	public BookDAOImpl() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection(URL,DBUSER,DBPASSWORD);
		statement=connection.createStatement();
		System.out.println("Connected!");
	}
	public Boolean addBook(Book book){
		query="Insert into book_tbl values("+book.getBookId()+",'"+book.getName()+"','"+book.getAuthor()+"',"+book.getPrice()+")";
	//	query="update book_tbl set Name='"+book.getName()+"',Author='"+book.getAuthor()+"',price="+book.getPrice()+" where BookId="+book.getBookId()+"";
		try {
			statement.execute(query);
			System.out.println("Book is added!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
		
	}
	
	public Book getBook(int BookId){
		query="select * from book_tbl where BookId="+BookId+"";
		Book book=new Book();
		try{
		resultSet=statement.executeQuery(query);
		while(resultSet.next()){
			
				book.setBookId(resultSet.getInt(1));
				book.setName(resultSet.getString(2));
				book.setAuthor(resultSet.getString(3));
				book.setPrice(resultSet.getInt(4));
			}
		return book;
		}
		catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	
		return new Book();
			
	}
	
	public boolean deleteBook(int BookId){
		query="delete from book_tbl where BookId="+BookId+"";
		//Book book=new Book();
		try {
			statement.execute(query);
			System.out.println("book is deleted!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;	
	}
	
	public Boolean updateBook(Book book){
		//Book ubook=new Book();
		 query="update book_tbl set Name='"+book.getName()+"',Author='"+book.getAuthor()+"',price="+book.getPrice()+" where BookId="+1001+"";
		//query="update book_tbl set Name='"+book.getName()+"',Author='"+book.getAuthor()+"',price="+book.getPrice()+" where BookId="+book.getBookId()+"";
		try {
			statement.executeUpdate(query);
			System.out.println("Updated!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public ArrayList<Book> getAllBook(){
		ArrayList<Book> bookList=new ArrayList<Book>();
		query="select * from book_tbl";
		try {
			resultSet=statement.executeQuery(query);
			while(resultSet.next()){
				Book book= new Book();
				book.setBookId(resultSet.getInt(1));
				book.setName(resultSet.getString(2));
				book.setAuthor(resultSet.getString(3));
				book.setPrice(resultSet.getInt(4));
				bookList.add(book);
				//System.out.println("\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return bookList;
	}
	
}

