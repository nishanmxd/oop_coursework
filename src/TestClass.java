import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestClass {
	
	
	
	@Test
	public void addWorkTask() {
		TaskManager taskManager = new TaskManager();
		WorkTask workTask = new WorkTask(1, "xyz", "abc");
		
		assertTrue(taskManager.add(workTask));
		assertEquals(1, taskManager.getSize());
		
	}
	
	@Test
	public void addPersonalTask() {
		TaskManager taskManager = new TaskManager();
		PersonalTask personalTask = new PersonalTask(1, "xyz", "abc");
		
		assertTrue(taskManager.add(personalTask));
		assertEquals(1, taskManager.getSize());
		
	}
	
	@Test
	public void addTeamWorkTask() {
		TaskManager taskManager = new TaskManager();
		TeamWorkTask teamWorkTask = new TeamWorkTask(1, "xyz", "abc", "def");
		
		assertTrue(taskManager.add(teamWorkTask));
		assertEquals(1, taskManager.getSize());
		
	}
	
	
	@Test
	public void removeTask() {
		TaskManager taskManager = new TaskManager();
		Task task = new PersonalTask(1, "xyz", "abc");
		
		assertTrue(taskManager.addTask(task));
		assertTrue(taskManager.removeTask(1));
		assertEquals(0, taskManager.getSize());
		
		
	}
	
	@Test
	public void addDuplicate()  {
		TaskManager taskManager = new TaskManager();
		Task task1 = new PersonalTask(1, "xyz", "abc");
		Task task2 = new PersonalTask(1, "lmn", "def");
		
		assertTrue(taskManager.addTask(task1));
		assertFalse(taskManager.addTask(task2));
		assertEquals(1, taskManager.getSize());
		
	}

}
