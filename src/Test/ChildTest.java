import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import Class.*;
import Model.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import java.io.*;

class ChildTest {

    @Mock
    private FileReader fileReader;
    @Mock
    private BufferedReader bufferedReader;

    @BeforeEach
    void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        // Mocking FileReader and BufferedReader
    }

    @Test
    void testInitializeTasksFromFile() throws Exception {
        Child child = new Child("test", "12");

        // When
        ArrayList<Task> tasks = child.initializeTasksFromFile();

        // Then
        assertNotNull(tasks);
        assertEquals(1, tasks.size());
        Task task = tasks.get(0);
        assertEquals("clean", task.getName());
        assertEquals(1, task.getReward());
    }

    @Test
    void testLoadTaskList() throws Exception {
        // Arrange
        when(bufferedReader.readLine()).thenReturn(
                "{\"ID\":\"1\", \"Tasks\":[{\"taskID\":\"1\", \"taskName\":\"Homework\", \"taskReward\":50, \"taskPriority\":1, \"taskDescription\":\"Complete math homework\", \"taskDate\":\"2021-01-01\", \"taskStatus\":\"Completed\"}]}",
                (String) null);
        Child child = new Child("test", "12");

        // Act
        child.loadTaskList();

        // Assert
        assertEquals(1, child.getTasks().size());
        assertEquals(55, child.getCharge());
    }
}
