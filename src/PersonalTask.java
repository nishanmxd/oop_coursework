
public class PersonalTask extends Task {
	
	public PersonalTask(int id, String name, String description) {
		super(id, name, description);
		
	}
	
	@Override
	public String toString() {
		
		return "Personal Task ID: " + getId() + ", Name: " + getName() + ", Description: " + getDescription();
		
	}
}
