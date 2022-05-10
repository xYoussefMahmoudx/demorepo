package advancedProjectComputer;

import java.time.LocalDate;
import java.time.LocalTime;
//import java.util.Set;



public class Event {
	
	
	private String title ;
	private String location ;
	private LocalDate date ;
	
	private LocalTime startTime;
	private LocalTime endTime ;
	
	private Category category;
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
	/* public static void main(String[] args) {  
		 Event event=new Event();
		 
		 event.setStartTime(LocalTime.of(10,43,12));
		 System.out.println(event.getStartTime());
		 event.setEndTime(LocalTime.of(10,20,12));
		 System.out.println(event.getEndTime());
		 
		 int v=event.getStartTime().compareTo(event.getEndTime());
		 System.out.println(v);
		 LocalTime time = LocalTime.now();
		 System.out.println(time);
		 int x=event.getStartTime().compareTo(time);
		 System.out.println(x);
		 LocalDate date =LocalDate.of(2022, 5, 9);
		 System.out.println(date);
	 }

}*/
