import java.util.HashSet;

public class TaskManager {
	
	private HashSet<Task> taskList = new HashSet<>(); //using HashSet to prevent duplication
	
	public Boolean addTask(Task newTask) {
		
		return taskList.add(newTask);  //successfully adding a new task
		
	}
	
	public Boolean removeTask(int taskId) {
		
		for(Task taskEntered : taskList) {			
			if (taskEntered.getId() == taskId) {					
				taskList.remove(taskEntered);
				System.out.println("Removed " + taskId);
				
				return true;   //successfully removing a task
			}		
			
		}
		System.out.println("Entered ID " + taskId + " is incorrect.");
		
		return false;       //unsuccessful feedback
	}
	
	public int getSize() {
		
		return taskList.size(); //getting the size of the tasks list
		
	}
	
	public void displayTask(){
		
		if(taskList.isEmpty()) {
			System.out.println("No tasks updated to display!");	
		}else {
			System.out.println("Here are the list of tasks: ");
			
			for(Task task : taskList) {
				task.displayID();
			}
		}
	}

}
