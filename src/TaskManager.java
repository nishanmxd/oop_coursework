import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class TaskManager extends HashSet <Task> {
	
//private HashSet<Task> taskList = new HashSet<>(); //using HashSet to prevent duplication
	
	public boolean addTask(Task newTask) {
		for (int i =0; i<this.toArray().length; i++){
			Task taskInList = (Task) this.toArray()[i];
			
			if (taskInList.getId() == newTask.getId()){
				return false;
			}
		}
		
		return this.add(newTask); //successfully adding a new task
		
	}
	
	public Boolean removeTask(int taskId) {
		
		for(Task taskEntered : this) {			
			if (taskEntered.getId() == taskId) {					
				this.remove(taskEntered);
				System.out.println("Removed " + taskId);
				
				return true;   //successfully removing a task
			}		
			
		}		
			System.out.println("Entered ID " + taskId + " is incorrect.");
			
			return false;       //unsuccessful feedback
		
		}
		
		
	
	public int getSize() {
		
		return this.size(); //getting the size of the tasks list
		
	}
	
	public void displayTask(){
		
		
		if(this.isEmpty()) {
			System.out.println("No tasks updated to display!");	
			System.out.println();
		}else {
			System.out.println("Here are the list of tasks: ");
			System.out.println();
			
			for(Task task : this) {
				System.out.println(task);
				
				if (task instanceof WorkTask || task instanceof TeamWorkTask) {
	                ((Remindable) task).remindUser();
				}
			}
		}
	}
	
	public void toFile() throws IOException {
		
		BufferedWriter out = new BufferedWriter(new FileWriter("tasks.txt"));
		
		for(Task task: this) {
			
			out.write(task.toString() + "\n");
			
		}
			
			out.close();
		
	}
		
	
}


