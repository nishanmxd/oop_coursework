
public class TeamWorkTask extends WorkTask{
	
	private String teamName;

	public TeamWorkTask(int id, String name, String description, String teamName) {
		
		super(id, name, description);
		this.teamName = teamName;
		
	}
	
	public String getTeamName() {
		return teamName;
		
	}
	
	public void displayID() {
		System.out.println("Team Work Task ID: " + getId() + ", Name: " + getName() + ", Description: " + getDescription() + ", Team Name: " + getTeamName() );
		System.out.println();
	}

}
