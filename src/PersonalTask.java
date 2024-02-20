
public class PersonalTask extends Task {
	
	public PersonalTask(int id, String name, String description) {
		super(id, name, description);
		
	}
	
	public void displayID() {
		
		System.out.println("Personal Task ID: " + getId() + ", Name: " + getName() + ", Description: " + getDescription()) ;
		System.out.println();
	}
}
