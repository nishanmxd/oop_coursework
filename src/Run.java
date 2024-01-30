import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		
		//Variables
		String choice;
		int taskId;
		String taskName;
		String taskDescription;
		
		Scanner scan = new Scanner(System.in);
		
		TaskManager taskManager = new TaskManager();
		
		System.out.println("Welcome to the Task Manager!");
		System.out.println("Please select an option from below to continue: ");
		
		do {
		System.out.println("(a) Show all current Task  (b) Add a new task  (c) Remove an existing task  (d) Exit the program");
		choice = scan.next();
		
			if(choice.equalsIgnoreCase("a")) {	 	
				taskManager.displayTask();
			
			}else if(choice.equalsIgnoreCase("b")) {
				
				System.out.print("Enter the task ID: ");
				taskId = scan.nextInt();
				
				System.out.print("Enter the task name: ");
				taskName = scan.next();
				scan.nextLine();
				
				System.out.println("Enter the task description: ");
				taskDescription = scan.next();
				scan.nextLine();
				System.out.println();
				
				Task newTask = new Task(taskId, taskName, taskDescription);
				taskManager.addTask(newTask);
				
			}else if(choice.equalsIgnoreCase("c")) {
				
				System.out.print("Enter the task ID that you wish to remove: ");
				taskId = scan.nextInt();
				taskManager.removeTask(taskId);	
			}
		
		}while(!choice.equalsIgnoreCase("d"));
		
		System.out.println("Thank you for using the Task Manager!");

	}

}
