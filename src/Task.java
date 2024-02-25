
public abstract class Task {
	
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
	
	@Override
	public String toString() {
		
		 return "Task ID: " + id + ", Name: " + name + ", Description: " + description ;
	}
		
}
