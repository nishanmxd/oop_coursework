
public class Task {
	
	//fields
	private int id;
	private String name;
	private String description;
	
	
	public Task(int id, String name, String description) {
		
		this.id = id;
		this.name = name;
		this.description = description;
		
	}
	
	public int getId(){
		
		return id;
	}
	
	public String getName(){
		
		return name;
	}
	
	public String getDescription() {
		
		return description;
	}
	
	public void displayID() {
		System.out.println("Task ID: " + id + "| Task Name: " + name + "| Task Description: " + description);
	}
}