import java.util.Scanner;
public class TextGUI {

	String choice;
	int taskId;
	String taskName;
	String taskDescription;
	
	public TextGUI() {
		
	}
	
	Scanner scan = new Scanner(System.in);
	
	TaskManager taskManager = new TaskManager();
	
	public boolean Welcome() {
	System.out.println("Welcome to the Task Manager!");
	System.out.println("Please select an option from below to continue: ");
	
	return true;
	}
	
	public boolean taskLoop() {
	do {
	System.out.println("(a) Show all current Task  (b) Add a new task  (c) Remove an existing task  (d) Exit the program");
	choice = scan.next();
	
		if(choice.equalsIgnoreCase("a")) {	 	
			taskManager.displayTask();
		
		}else if(choice.equalsIgnoreCase("b")) {
			
			System.out.println("Would you like to: 1) Add personal task  2) Add Work Task  3) Add Team Work Task");
			choice = scan.next();
			
			if(choice.equals("1")) {
				addPersonalTask(scan, taskManager);
				
			}else if(choice.equals("2")) {
				addWorkTask(scan, taskManager);
				
			}else if(choice.equals("3")) {
				addTeamWorkTask(scan, taskManager);
				
			}
			
				
			
		}else if(choice.equalsIgnoreCase("c")) {
			
			System.out.print("Enter the task ID that you wish to remove: ");
			taskId = scan.nextInt();
			taskManager.removeTask(taskId);	
			
		}
	
	}while(!choice.equalsIgnoreCase("d"));
	
	System.out.println("Thank you for using the Task Manager!");
	
	return true;
	
	}
	
	public static void addPersonalTask(Scanner scan, TaskManager taskManager) {
		
		System.out.print("Enter the task ID: ");
		int taskId = scan.nextInt();
		
		System.out.print("Enter the task name: ");
		String taskName = scan.next();
		scan.nextLine();
		
		System.out.println("Enter the task description: ");
		String taskDescription = scan.next();
		scan.nextLine();
		
		PersonalTask  personalTask = new PersonalTask(taskId, taskName, taskDescription);
		taskManager.addTask(personalTask);
		
		}

	public static void addWorkTask(Scanner scan, TaskManager taskManager) {
		
		System.out.print("Enter work task ID: ");
		int taskId = scan.nextInt();
		
		System.out.print("Enter work task name: ");
		String taskName = scan.next();
		scan.nextLine();
		
		System.out.println("Enter the task description: ");
		String taskDescription = scan.next();
		scan.nextLine();
		
		WorkTask workTask = new WorkTask(taskId, taskName, taskDescription);
		taskManager.add(workTask);
		
	}
	
	public static void addTeamWorkTask(Scanner scan, TaskManager taskManager) {
		
		System.out.print("Enter teamwork task ID: ");
		int taskId = scan.nextInt();
		
		System.out.print("Enter teamwork task name: ");
		String taskName = scan.next();
		scan.nextLine();
		
		System.out.println("Enter the task description: ");
		String taskDescription = scan.next();
		scan.nextLine();
		
		System.out.println("Enter Team name: ");
		String teamName = scan.next();
		scan.nextLine();
		
		
		TeamWorkTask teamWorkTask = new TeamWorkTask(taskId, taskName, taskDescription, teamName);
		taskManager.add(teamWorkTask);
		
	}

}

