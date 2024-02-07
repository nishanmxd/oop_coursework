import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestClass {
	
	@Test
	public void addTask() {
		TaskManager taskmanager = new TaskManager();
		Task task = new Task(1, "xyz", "abc");
		
		assertTrue(taskmanager.addTask(task));
		assertEquals(1, taskmanager.getSize());
	}
	
	@Test
	public void removeTask() {
		TaskManager taskmanager = new TaskManager();
		Task task = new Task(1, "xyz", "abc");
		
		assertTrue(taskmanager.addTask(task));
		assertTrue(taskmanager.removeTask(1));
		assertEquals(0, taskmanager.getSize());
		
		
	}
	
	@Test
	public void addDuplicate()  {
		TaskManager taskmanager = new TaskManager();
		Task task1 = new Task(1, "xyz", "abc");
		Task task2 = new Task(1, "lmn", "def");
		
		assertTrue(taskmanager.addTask(task1));
		assertFalse(taskmanager.addTask(task2));
		assertEquals(1, taskmanager.getSize());
		
	}

}
