import Class.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    private Task task;

    @BeforeEach
    void setUp() {
        task = new Task("1", "Homework", 100, 1, "Complete your homework.", "2021-01-01", "Pending");
    }

    @Test
    void testGetters() {
        assertEquals("1", task.getId());
        assertEquals("Homework", task.getName());
        assertEquals(100, task.getReward());
        assertEquals(1, task.getPriority());
        assertEquals("Complete your homework.", task.getDescription());
        assertEquals("2021-01-01", task.getDate());
        assertEquals("Pending", task.getStatus());
    }

    @Test
    void testSetStatus() {
        task.setStatus("Completed");
        assertEquals("Completed", task.getStatus());
    }

}
