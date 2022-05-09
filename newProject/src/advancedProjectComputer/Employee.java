package advancedProjectComputer;

import javax.print.attribute.standard.RequestingUserName;
import javax.security.auth.login.AccountException;

public class Employee extends Person {

Account a1;
boolean loginflag=false;
	//public Employee (String username,String password) {
		//this.username=username;
		//this.password=password;
	//}
	
	
	

	
	
	public void registerAccount(String username,String password) {
		
		a1.setuserName(username);
		 a1.setPassword(password);
	}
	public void signInAccount(String username,String password) {
	
	if(a1.getuserName()==username && a1.getPassword()== password) {
		}
	loginflag=true;
	}
public void signOutAccount(Account a1) {
		loginflag=false;
	}
	public void addClient(Client c1) {
		
	}
	public void deleteClient(Client c1){
		c1=null;
		
	}
}
	/*ublic void getClientBySerial(int serialNumber){
		
		
	}
	public void getClientBByName(String name){
		
	}
}*/