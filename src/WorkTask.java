
public class WorkTask extends Task{
	
	public WorkTask(int id, String name, String description) {
		super(id, name, description);
		
	}
	
	public void displayID() {
		
		System.out.println("Work Task ID: " + getId() + ", Name: " + getName() + ", Description: " + getDescription());
		System.out.println();
	}
}
