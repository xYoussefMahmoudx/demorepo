package advancedProjectComputer;

//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class admin {
	private Account account = new Account();
	Scanner adminInput = new Scanner(System.in);
	boolean adminLoginFlag = false;
	
	public Account getAccount() {
		return account;
	}
	public void signInAccount(String userName ,String password) {
		if(account.getUserName() == userName && account.getPassword() == password) {
			System.out.println("You've logged in successfully !!");
			adminLoginFlag = true;
		}
		else System.out.println("wrong user name or password plese try again");
	}
	public void signOutAccount() {
		if(adminLoginFlag == true) {
			adminLoginFlag = false;
			System.out.println("you have signed out");
		}
		else System.out.println("you are not signed in");
	}
	public Category addCategory() {
		Category categ1 = new Category();
		if(adminLoginFlag == true) {
			System.out.println("Adding new categoty...");
			System.out.println("Enter category type:");
			categ1.setType(adminInput.next());
			System.out.println("Added a new category.");
			return categ1;
		}
		else {
			System.out.println("You are not signed in.");
			return null;
		}
		
	}
	public void setCategory(Category cat1) {
		System.out.println("Current type of category is: "+ cat1.getType());
		System.out.println("Enter new category type:");
		cat1.setType(adminInput.next());
		
	}
	public void deleteCategory(Category cat1) {
		cat1 = null;
		System.out.println("Successfully deleted category.");
	}
	public Event addEvent() {
		Event event1 = new Event();
		if(adminLoginFlag == true) {
			System.out.println("Adding new event...");
			System.out.println("Enter event title:");
			event1.setTitle(adminInput.next());
			System.out.println("Enter event location:");
			event1.setLocation(adminInput.next());
			System.out.println("Enter event date dd/MM/yyyy :");
			//DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			event1.setDate(LocalDate.parse(adminInput.next()));
			System.out.println("Enter event start time:");
			event1.setStartTime(LocalTime.parse(adminInput.next()));
			System.out.println("Enter event end time:");
			event1.setEndTime(LocalTime.parse(adminInput.next()));
			System.out.println("Added a new event.");
			return event1;
		}
		else {
			System.out.println("You are not signed in.");
			return null;
		}
	}
	public void setEvent(Event event1) {
		System.out.println("Adding new event...");
		System.out.println("Enter event title:");
		event1.setTitle(adminInput.next());
		System.out.println("Enter event location:");
		event1.setLocation(adminInput.next());
		System.out.println("Enter event date dd/MM/yyyy :");
		event1.setDate(LocalDate.parse(adminInput.next()));
		System.out.println("Enter event start time:");
		event1.setStartTime(LocalTime.parse(adminInput.next()));
		System.out.println("Enter event end time:");
		event1.setEndTime(LocalTime.parse(adminInput.next()));
		System.out.println("Successfuly modified event.");
	}
	public void deleteEvent(Event event1) {
		event1 = null;
		System.out.println("Successfuly deleted event.");
	}
}
