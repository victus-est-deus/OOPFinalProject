package Project.Employee;

import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

import Enums.Language;
import Project.User;

public class Librarian extends Employee {

	private HashMap<User,Book> borrowedBooks;
	
	
	public Librarian(String id, String password, String firstName, String lastName, String userInfo, int age,
			boolean status, Language language, boolean isLoggedIn, Date hireDate, Vector<Message> myMessages,HashMap<User,Book> borrowedBooks) {
		super(id, password, firstName, lastName, userInfo, age, status, language, isLoggedIn, hireDate, myMessages);
		this.borrowedBooks=borrowedBooks;
	}

	public HashMap<User,Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(HashMap<User,Book> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}
	
	
	@Override
	public void viewMenu() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void viewProfile() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void sendRequest() {
		// TODO Auto-generated method stub
		
	}


	
}
