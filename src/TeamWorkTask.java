
public class TeamWorkTask extends WorkTask implements Remindable{
	
	private String teamName;

	public TeamWorkTask(int id, String name, String description, String teamName) {
		
		super(id, name, description);
		this.teamName = teamName;
		
	}
	
	public String getTeamName() {
		return teamName;
		
	}
	
	@Override
	public String toString() {
		
		return "Team Work Task ID: " + getId() + ", Name: " + getName() + ", Description: " + getDescription() + ", Team Name: " + getTeamName();

	}
	
	public void remindUser() {
		System.out.println("Reminder for Team Work Task: " + getName() + " | This task is important!");
		System.out.println();
	}

}
