package advancedProjectComputer;


//import java.lang.invoke.WrongMethodTypeException;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee extends Person  {
	
	private Account account=new Account();
	Scanner  input = new Scanner(System.in);
	boolean loginFlag = false;
	//Scanner scanner = new Scanner(System.in);
	
	
	public Account getAccount() {
		return account;
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
		Client c1=new Client();
		
		if(loginFlag==true) {
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
		}
		else {
			System.out.println(" you are not signed in");
			
		
		}
		return c1;
	}
	
	public void deleteClient(Client c1)
	{
		if(loginFlag==true) {
		c1=null;
		System.out.println("client is deleted");
		}
		else {
			System.out.println(" you are not signed in");
		}
	}
	
	public void getClientBySerial(int serialNumber ,ArrayList<Client> clients)
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
			
		}
		else if (loginFlag==false) {
			System.out.println(" you are not signed in");
		}
		else {
			System.out.println("wrong serial number");
		}
	}
	
	public void getClientByName(String name ,ArrayList<Client> clients)
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
			
		}
		else if (loginFlag==false) {
			System.out.println(" you are not signed in");
		}
		else {
			System.out.println("wrong name");
		}
	}
	
	
	public void bookEvent(Client c1,Event e1) {
		if(loginFlag==true) {
			
			
			
		}
		else {
			System.out.println(" you are not signed in");
		}
	}

}
