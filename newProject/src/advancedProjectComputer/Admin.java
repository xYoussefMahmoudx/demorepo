package advancedProjectComputer;

//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
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
		
		if(adminLoginFlag == true) {
			Category categ1 = new Category();
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
	public void editCategory(Category cat1) {
		System.out.println("Current type of category is: "+ cat1.getType());
		System.out.println("Enter new category type:");
		cat1.setType(adminInput.nextLine());
		
	}
	public void deleteCategory(Category cat1,ArrayList<Category> categories) {
		for(int i=0;i<categories.size();i++) {
		
			if(categories.get(i).equals(cat1)) {
				categories.remove(i);
				break;
			}
		}
		
		cat1 = null;
		System.out.println("Successfully deleted category.");
	}
	public Event addEvent() {
		Event event1 = new Event();
		if(adminLoginFlag == true) {
			System.out.println("Adding new event...");
			System.out.println("Enter event title:");
			event1.setTitle(adminInput.nextLine());
			System.out.println("Enter event location:");
			event1.setLocation(adminInput.nextLine());
			System.out.println("Enter event date YYYY-MM-DD :");
			
			event1.setDate(LocalDate.parse(adminInput.nextLine()));
			System.out.println("Enter event start time:");
			event1.setStartTime(LocalTime.parse(adminInput.nextLine()));
			System.out.println("Enter event end time:");
			event1.setEndTime(LocalTime.parse(adminInput.nextLine()));
			System.out.println(" you have succesfully Added a new event.");
			return event1;
		}
		else {
			System.out.println("You are not signed in.");
			return null;
		}
	}
	public void editEvent(Event event1) {
		System.out.println("Editing event " + event1.getTitle() + " of category " + event1.getCategory().getType());
		System.out.println("Enter event title:");
		event1.setTitle(adminInput.nextLine());
		System.out.println("Enter event location:");
		event1.setLocation(adminInput.nextLine());
		System.out.println("Enter event date YYYY-MM-DD :");
		event1.setDate(LocalDate.parse(adminInput.nextLine()));
		System.out.println("Enter event start time:");
		event1.setStartTime(LocalTime.parse(adminInput.nextLine()));
		System.out.println("Enter event end time:");
		event1.setEndTime(LocalTime.parse(adminInput.nextLine()));
		System.out.println("Successfuly modified event.");
	}
	public void deleteEvent(Event event1,ArrayList<Event>events) {
		
		for(int i=0;i<events.size();i++) {
			
			if(events.get(i).equals(event1)) {
				events.remove(i);
				break;
			}
		}
		
		
		
		event1 = null;
		System.out.println("Successfuly deleted event.");
	}
	
	public static void main(String[] args) {
		
		Category category =new Category();
		
		Event event=new Event();
		
		System.out.println("add new category");
		
		Admin admin=new Admin() ;
		
		admin.editCategory(category);
		System.out.println("add event");
		event.setCategory(category);
		 admin.editEvent(event);
		
	}
}
