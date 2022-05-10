package advancedProjectComputer;


//import java.lang.invoke.WrongMethodTypeException;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee extends Person  {
	
	private Account account=new Account();
	Scanner  input = new Scanner(System.in);
	boolean loginFlag = false;
	
	public Account getAccount() {
		if(loginFlag==true) {
			return account;
		}
		else {
			System.out.println(" you are not signed in ");
			return null;
		}
	}

	public void registerAccount(String userName,String password) {

		account.setUserName(userName);
		account.setPassword(password);
		
		System.out.println("You've registerd successfully !!");
	}

	public void signInAccount(String userName,String password) {

		if(account.getUserName()==userName && account.getPassword()==password)
		{
			System.out.println("You've logged in successfully !!");
			loginFlag=true;
		}
		else {
			System.out.println("wrong user name or password plese try again");
			
		}
	}
	
	public void signOutAccount() {
		if(loginFlag==true)
			{loginFlag=false;
			System.out.println("you have signed out");
			}
		else{System.out.println("you are not signed in");}
		
	}
	public Client addClient()
	{
		
		
		if(loginFlag==true) {
			Client c1=new Client();
			System.out.println("adding client to system");
			System.out.println("insert client serial number");
			c1.setName(input.next());
			System.out.println("insert client serial number");
			c1.setSerialNumber(input.nextInt());
			System.out.println("insert client mobile number");
			c1.setMobile(input.next());
			System.out.println("insert client gender");
			c1.setGender(input.next().charAt(0));
			System.out.println("insert client national ID");
			c1.setNationalID(input.next());
			System.out.println(" you have added client succesfuly");
			return c1;
		}
		else {
			System.out.println(" you are not signed in");
			return null;
			
		
		}
		
	}
	
	public void deleteClient(Client c1,ArrayList<Client>clients)
	{
		if(loginFlag==true) {
			for(int i=0;i<clients.size();i++) {
				
				if(clients.get(i).equals(c1)) {
					clients.remove(i);
					break;
				}
			}
			
			c1 = null;
			System.out.println("Successfully deleted category.");
		}
		else {
			System.out.println(" you are not signed in");
		}
	}
	
	public Client getClientBySerial(int serialNumber ,ArrayList<Client> clients)
	{
		int index=-1;
		for (int i = 0; i < clients.size(); i++) {
			
		      if(clients.get(i).getSerialNumber()==serialNumber ) {
		    	  
		    	 index=i;
		      }
		}
		if(loginFlag==true && index>=0) {
			System.out.println("client name is "+ clients.get(index).getName());
			System.out.println("client seial number is "+ clients.get(index).getSerialNumber());
			System.out.println("client national ID is "+ clients.get(index).getNationalID());
			System.out.println("client Gender is "+ clients.get(index).getGender());
			System.out.println("client mobile is "+ clients.get(index).getMobile());
			
			return clients.get(index);
		}
		else if (loginFlag==false) {
			System.out.println(" you are not signed in");
			return null;
		}
		else {
			System.out.println("wrong serial number");
			return null;
		}
	}
	
	public Client getClientByName(String name ,ArrayList<Client> clients)
	{
		int index=-1;
		for (int i = 0; i < clients.size(); i++) {
			
		      if(clients.get(i).getName().equals(name) ) {
		    	  
		    	 index=i;
		      }
		}
		
		if(loginFlag==true && index>=0) {
			System.out.println("client name is "+ clients.get(index).getName());
			System.out.println("client seial number is "+ clients.get(index).getSerialNumber());
			System.out.println("client national ID is "+ clients.get(index).getNationalID());
			System.out.println("client Gender is "+ clients.get(index).getGender());
			System.out.println("client mobile is "+ clients.get(index).getMobile());
			
			return clients.get(index);
		}
		else if (loginFlag==false) {
			System.out.println(" you are not signed in");
			return null;

		}
		else {
			System.out.println("wrong name");
			return null;
		}
	}
	
	
	public void bookEvent(Client c1,Event e1) {

		if(loginFlag==true) {
			
			c1.getHistory().setUpcomingEvent(e1);;
			
		}
		else {
			System.out.println(" you are not signed in");
		}
	}

	public void unbookEvent(Client c1,Event e1) {

         if(loginFlag==true) {
        	
			for(int i=0;i<c1.getHistory().getUpcomingEvents().size();i++) {
				
			
				if(c1.getHistory().getUpcomingEvents().get(i).equals(e1)) {

					
					c1.getHistory().getUpcomingEvents().remove(i);
					System.out.println(" event has been unbooked");
					break;
				}
			
				
			
			}
			
         }
		
		else {
			System.out.println(" you are not signed in");
		}
	}
	
	public Event searchEventByTitle(String title,ArrayList<Event>events) {
		
		if(loginFlag==true) {	
			for(int i=0;i<events.size();i++) {
				
				if(events.get(i).getTitle().equals(title)) {
					System.out.println(" found event " + events.get(i).getTitle());
					return events.get(i);
					
				}
			}
			System.out.println("event not found");
			return null;
			
			}
			else {
				System.out.println("you are not signed in");
				return null;
			}
	}

	public void viewEventDetails(Event event) {
		System.out.println("event title " + event.getTitle() );
		System.out.println("event location " + event.getLocation() );
		System.out.println("event Start time " + event.getStartTime() );
		System.out.println("event end time  " + event.getEndTime() );
		System.out.println("event date " + event.getDate() );
		System.out.println("event category " + event.getCategory().getType() );
		
	}
}


