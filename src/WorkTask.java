

public class WorkTask extends Task implements Remindable{
	
	public WorkTask(int id, String name, String description) {
		super(id, name, description);
		
	}
	
	public String toString() {
		
		return "Team Work Task ID: " + getId() + ", Name: " + getName() + ", Description: " + getDescription();
	
	}
	
	public void remindUser() {
		System.out.println("Reminder for Work Task: " + getName() + "| This task is important!");
		System.out.println();
	}
	

}
