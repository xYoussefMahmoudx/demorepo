package advancedProjectComputer;

import java.util.ArrayList;
import java.util.Scanner; 

public class TicketReservationSystem {

	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Employee dummyEmployee1=new Employee();
		dummyEmployee1.registerAccount("dummy1","dummy1");
		employees.add(dummyEmployee1);
		
		
		Employee dummyEmployee2=new Employee();
		dummyEmployee2.registerAccount("dummy2","dummy2");
		employees.add(dummyEmployee2);
		
		ArrayList<Client> clients = new ArrayList<Client>();
		
		Employee currentEmployee;
		
		System.out.println("Welcome to EVENTS program , You already have an account (Y/N)?");
		if(input.next().charAt(0)=='Y') {
			System.out.println("Please Enter your username\n");
			String userName = input.next();
			boolean accountExist=false;
			for (int i = 0; i < employees.size(); i++) {
				
		      if(employees.get(i).getAccount().getUserName() .equals(userName) ) {
		    	  
		    	  accountExist = true;
		    	  currentEmployee= employees.get(i);
		    	  System.out.println("Please Enter your password\n");
		    	  String password = input.next();
		    	  currentEmployee.signInAccount(userName,password);
		      }
		    }
			
			if(!accountExist)
				System.out.println("Account not exist ,please sign up !!!");
		}else {
			System.out.println("Will create account for you");
			currentEmployee=new Employee();
			
			employees.add(currentEmployee);
			String userName = input.next();
			String password = input.next();
			 currentEmployee.registerAccount(userName,password);
			 //currentEmployee.registerAccount();
			
			
		}
		
		
		
		
		
		
		
	}

}
