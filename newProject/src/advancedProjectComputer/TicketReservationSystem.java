package advancedProjectComputer;

import java.awt.desktop.AboutHandler;import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
import javax.swing.text.DefaultEditorKit.InsertBreakAction; 

public class TicketReservationSystem {
	
	public void makeEmployee(Employee employee) {
		
		employee.setName("youssef");
		employee.getAccount().setUserName("youssef1");
		employee.getAccount().setPassword("youssef1");
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		Scanner  input = new Scanner(System.in);
		
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
		Category categ1 = new Category();
		
		categ1.setType("Category1");
		categories.add(categ1);
	//	categories.add(dummyAdmin1.alreadyAddedCategory());
		
		
		ArrayList<Event> events = new ArrayList<Event>();
		
		Event event1 = new Event();
	
		
		event1.setTitle("event");
		
		event1.setLocation("city");
		
		
		event1.setDate(LocalDate.of(2022, 5, 9));
		
		event1.setStartTime(LocalTime.of(10,30 ));
		
		event1.setEndTime(LocalTime.of(11,30 ));
		
		event1.setCategory(categ1);
		
		events.add(event1);

		//events.add(dummyAdmin1.alreadyAddEvent());
		
		
		System.out.println("welcome to Yalla Tazaker please insert A for (Admin) and E for (Employee) ");
		//Start of the Program
		// Here it chooses the Admin or the Employee
		// Here is the adminCheck
		char checkChar=input.next().charAt(0);
	if (checkChar =='A') {
		 
		
		
		
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
			System.out.println("Account not exist ");
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
	else if (checkChar =='E'){
		
		
		
		System.out.println("Do you Already have an Account (Y/N) : ");
		
		char checkChar2=input.next().charAt(0);
		if(checkChar=='Y') {
			

			System.out.println("please insert your username : " );
			Employee currentEmployee= new Employee();
			
			String userName = input.next();
			System.out.println("please insert your password : " );

			  String password = input.next();
			boolean accountExist=false;
			for (int i = 0; i <employees.size(); i++) {
				
		      if(employees.get(i).getAccount().getUserName().equals(userName)&&employees.get(i).getAccount().getPassword().equals(password)) {
		    	  
		    	  accountExist = true;
		    	  currentEmployee= employees.get(i);
		    	  currentEmployee.signInAccount(userName,password);
		      }
		    }
			
			if(!accountExist)
				System.out.println("Account not exist ");
			
			
			
			// here employee check start
			//
			System.out.println("Please insert the one of the following numbers" );
			System.out.println("1: Add client");
			System.out.println("2: Delete client");
			System.out.println("3: search client by name");
			System.out.println("4: search client by serial number");
			System.out.println("5: book event for client ");
			System.out.println("6: unbook event for client");
			System.out.println("7: search event by name ");
			System.out.println("0: Signout");
			
			
			switch (input.nextInt()) {
			case 0: {
				
				currentEmployee.signOutAccount();
				break;
			}
			
			case 1: {
				
				
				clients.add(currentEmployee.addClient());
				break;
			}
			
			
			case 2: {
				
				System.out.println("Please insert the name of the client you wish to edit his information");
				String clientName = input.next();
				for (int i = 0; i < clients.size(); i++) {
					
				      if(clients.get(i).getName() .equals(clientName)) {
				    	  
				    	 currentEmployee.deleteClient(clients.get(i), clients);
				    	  break;  
				      }
				      
				}
				
				
				break;
			}
			
			
			
			case 3: {
				
				System.out.println("Please insert the name of the client ");
				String clientName = input.next();
				currentEmployee.getClientByName(clientName, clients);
				
				break;
			}
			
			case 4: {
				
				System.out.println("Please insert the serial number of the client ");
				int clientNumber = input.nextInt();
				currentEmployee.getClientBySerial(clientNumber, clients);
				
				break;
			}
			
			case 5: {
				
				System.out.println("plese insert title of event you want to book :");
				
				String eventTitle = input.nextLine();
				System.out.println("please insert name of the client you want to book for him :");
				String clientName = input.next();
				currentEmployee.bookEvent(currentEmployee.getClientByName(clientName, clients), currentEmployee.searchEventByTitle(eventTitle, events));
				
				
				break;
			}
			
			case 6: {
				
				

				System.out.println("plese insert title of event you want to unbook :");
				
				String eventTitle = input.nextLine();
				System.out.println("please insert name of the client you want to unbook for him :");
				String clientName = input.next();
				currentEmployee.unbookEvent(currentEmployee.getClientByName(clientName, clients), currentEmployee.searchEventByTitle(eventTitle, events));
				
				
				break;
			}
			
			case 7: {
				
				System.out.println("insert the name of the event ");
				String eventName= input.nextLine();
				currentEmployee.viewEventDetails(currentEmployee.searchEventByTitle(eventName, events));	
				
				break;
			}
			
		
			
			
			default: 
				System.out.println("Invalid input");
				
			}
			
		}
			

		else if (checkChar2=='N') {
			
			System.out.println("creating a new account ");
			System.out.println("insert your user name ");
			String userName =input.next();
			System.out.println("insert your password ");
			String password =input.next();
			Employee newEmployee= new Employee();
			newEmployee.registerAccount(userName, password);
			employees.add(newEmployee);
			
			Employee currentEmployee= new Employee();
			
			System.out.println(" now please sign in ");
			
			System.out.println(" please insert your user name ");
			 userName = input.next();
			System.out.println("please insert your password : " );

			  password = input.next();
			boolean accountExist=false;
			for (int i = 0; i <employees.size(); i++) {
				
		      if(employees.get(i).getAccount().getUserName() .equals(userName)&&employees.get(i).getAccount().getPassword().equals(password)) {
		    	  
		    	  accountExist = true;
		    	  currentEmployee= employees.get(i);
		    	  currentEmployee.signInAccount(userName,password);
		      }
		    }
			
			if(!accountExist)
				System.out.println("Account not exist ");
			
			//employee roll start here
			System.out.println("Please insert the one of the following numbers" );
			System.out.println("1: Add client");
			System.out.println("2: Delete client");
			System.out.println("3: search client by name");
			System.out.println("4: search client by serial number");
			System.out.println("5: book event for client ");
			System.out.println("6: unbook event for client");
			System.out.println("7: search event by name ");
			System.out.println("0: Signout");
			
			
			switch (input.nextInt()) {

			case 0: {
				
				currentEmployee.signOutAccount();
				break;
			}
			
			case 1: {
				
				
				clients.add(currentEmployee.addClient());
				break;
			}
			
			
			case 2: {
				
				System.out.println("Please insert the name of the client you wish to edit his information");
				String clientName = input.next();
				for (int i = 0; i < clients.size(); i++) {
					
				      if(clients.get(i).getName() .equals(clientName)) {
				    	  
				    	 currentEmployee.deleteClient(clients.get(i), clients);
				    	  break;  
				      }
				      
				}
				
				
				break;
			}
			
			
			
			case 3: {
				
				System.out.println("Please insert the name of the client ");
				String clientName = input.next();
				currentEmployee.getClientByName(clientName, clients);
				
				break;
			}
			
			case 4: {
				
				System.out.println("Please insert the serial number of the client ");
				int clientNumber = input.nextInt();
				currentEmployee.getClientBySerial(clientNumber, clients);
				
				break;
			}
			
			case 5: {
				
				System.out.println("plese insert title of event you want to book :");
				
				String eventTitle = input.nextLine();
				System.out.println("please insert name of the client you want to book for him :");
				String clientName = input.next();
				currentEmployee.bookEvent(currentEmployee.getClientByName(clientName, clients), currentEmployee.searchEventByTitle(eventTitle, events));
				
				
				break;
			}
			
			case 6: {
				
				

				System.out.println("plese insert title of event you want to unbook :");
				
				String eventTitle = input.nextLine();
				System.out.println("please insert name of the client you want to unbook for him :");
				String clientName = input.next();
				currentEmployee.unbookEvent(currentEmployee.getClientByName(clientName, clients), currentEmployee.searchEventByTitle(eventTitle, events));
				
				
				break;
			}
			
			case 7: {
				
				System.out.println("insert the name of the event ");
				String eventName= input.nextLine();
				currentEmployee.viewEventDetails(currentEmployee.searchEventByTitle(eventName, events));	
				
				break;
			}
			
		
			
			
			default: 
				System.out.println("Invalid input");
				
			}
			
		
		
	}
	// Here is the employeeCheck and the adminCheck are both wrong
	else {
		System.out.println("Wrong Choice ");
		
	}
	
	
		
	
		
		
		
		
		
		
	}

}
}
