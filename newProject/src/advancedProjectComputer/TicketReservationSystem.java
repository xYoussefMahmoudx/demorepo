package advancedProjectComputer;

import java.awt.desktop.AboutHandler;import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;import javax.swing.text.DefaultEditorKit.InsertBreakAction; 

public class TicketReservationSystem {
	
	public void makeEmployee(Employee employee) {
		
		employee.setName("youssef");
		employee.getAccount().setUserName("youssef1");
		employee.getAccount().setPassword("youssef1");
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		Scanner  input = new Scanner(System.in);
		// initiating ArrayLists
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Employee dummyEmployee1=new Employee();
		
		employees.add(dummyEmployee1);
		dummyEmployee1.registerAccount("dummy1", "dummy1");
		
		employees.add(dummyEmployee1);
		ArrayList<Admin> admines = new ArrayList<Admin>();
		Admin dummyAdmin1=new Admin();
		dummyAdmin1.registerAccount("dummy1", "dummy1");
		
		admines.add(dummyAdmin1);
		
		ArrayList<Client> clients = new ArrayList<Client>();
		Client client =new Client();
		client.setName("dummy");
		client.setMobile("01011111111");
		client.setGender('M');
		client.setSerialNumber(2002);
		client.setNationalID("2001");
		
		clients.add(client);
		
		ArrayList<Category> categories = new ArrayList<Category>();
		
		categories.add(dummyAdmin1.alreadyAddedCategory());
		
		
		ArrayList<Event> events = new ArrayList<Event>();

		events.add(dummyAdmin1.alreadyAddEvent());
		
		
		System.out.println("welcome to Yalla Tazaker please insert A for (Admin) and E for (Employee) ");
		//Start of the Program
		// Here it chooses the Admin or the Employee
		// Here is the adminCheck
	if (input.next().charAt(0) =='A') {
		 
		
		
		
		System.out.println("please insert your username : " );
		Admin currentAdmin= new Admin();
		
		String userName = input.next();
		System.out.println("please insert your password : " );

		  String password = input.next();
		boolean accountExist=false;
		for (int i = 0; i < admines.size(); i++) {
			
	      if(admines.get(i).getAccount().getUserName() .equals(userName)&&admines.get(i).getAccount().getPassword().equals(password)) {
	    	  
	    	  accountExist = true;
	    	  currentAdmin= admines.get(i);
	    	  //ASystem.out.println("Please Enter your password\n");
	    	
	    	  currentAdmin.signInAccount(userName,password);
	      }
	    }
		
		if(!accountExist)
			System.out.println("Account not exist ,please sign up !!!");
		// Here is the Start of the adminRole
		// He will choose Add, Delete or Edit Category or events or Signout
		System.out.println("Please insert the one of the following numbers" );
		System.out.println("1: Add category");
		System.out.println("2: Edit category");
		System.out.println("3: Delete category");
		System.out.println("4: Add event");
		System.out.println("5: Edit event");
		System.out.println("6: Delete event");
		System.out.println("0: Signout");
		
		switch (input.nextInt()) {
		
		
		case 0: {
			
			currentAdmin.signOutAccount();
			break;
		}
		case 1:{
			categories.add(currentAdmin.addCategory());
			break;
		}
		case 2:{
			System.out.println("Please insert the Category  you wish to edit");
			String catType = input.next();
			for (int i = 0; i < categories.size(); i++) {
				
			      if(categories.get(i).getType() .equals(catType)) {
			    	  
			    	  currentAdmin.editCategory(categories.get(i));
			    	  break;  
			      }
			      
			
			
		}break;
		}
		case 3:{
			System.out.println("Please insert the Category  you wish to delete");
			String catType = input.next();
			for (int i = 0; i < categories.size(); i++) {
				
			      if(categories.get(i).getType() .equals(catType)) {
			    	  
			    	  currentAdmin.deleteCategory(categories.get(i), categories);
			    	  break;  
			      }
		}break;
			}
		case 4:{
			events.add(currentAdmin.addEvent());
			
			break;
		}
		case 5:{
			System.out.println("Please insert the event  you wish to edit");
			String catType = input.next();
			for (int i = 0; i < events.size(); i++) {
			
				if(events.get(i).getTitle() .equals(catType)) {
		    	  
		    	  currentAdmin.editEvent(events.get(i));
		    	  break;  
		      }
		      
		
		
	}break;
	}
		case 6:{
			System.out.println("Please insert the event  you wish to delete");
			String catType = input.next();
			for (int i = 0; i < events.size(); i++) {
				
			      if(events.get(i).getTitle() .equals(catType)) {
			    	  
			    	  currentAdmin.deleteEvent(events.get(i), events);
			    	  break;  
			      }
			
		}
		break;
		}
		
		default:
			System.out.println("Invalid input");
			
		}
		
	}
	
	// Here is the employeeCheck
	else if (input.next().charAt(0) =='E'){
		
	}
	// Here is the employeeCheck and the adminCheck are both wrong
	else {
		System.out.println("Wrong Choice ");
		
	}
	
	
		
	
		
		
		
		
		
		
	}

}
