package advancedProjectComputer;

public class Client extends Person {
	
	
	
	static int SerialCounter = 0 ;
	protected int serialNumber ;
	protected String nationalID;
	protected char gender ;
	protected String mobile;
	private History history;
	
	
	
	
	public Client() {
		
	}
	
	public void setSerialNumber() {
		this.serialNumber=SerialCounter;
		SerialCounter++;
		
	}
	public void setNationalID(String nationalID) {
		this.nationalID=nationalID;
		
	}
	public void setGender(char gender){
		this.gender=gender;
		
		}
	public void setMobile(String mobile)
		{
		this.mobile=mobile;
		}
	public int getSerialNumber()
		{
		return serialNumber;
		}
	public String getNationalID()
	{
		return nationalID;
	}
	public char getGender()
	{
		 return gender;
	}
	public String getMobile()
	{
		return mobile;
	}

	public History getHistory() {
		
		return history;
	}

	
}
