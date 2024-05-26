import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import Model.AddTask_m;
import View.AddTask;
import Class.Task;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AddTaskTest {
    private JFrame mockFrame;
    private AddTask mockAddTask;
    private AddTask_m addTaskModel;

    @BeforeEach
    public void setUp() {
        mockFrame = mock(JFrame.class);
        mockAddTask = mock(AddTask.class);
        addTaskModel = new AddTask_m(mockAddTask);
        when(mockAddTask.getItemField()).thenReturn(new JTextField());
        when(mockAddTask.getRewardField()).thenReturn(new JTextField());
        when(mockAddTask.getPriorityField()).thenReturn(new JTextField());
        when(mockAddTask.getDescriptionField()).thenReturn(new JTextField());
        when(mockAddTask.getDateField()).thenReturn(new JTextField());
    }

    @Test
    public void testClearFields() {
        addTaskModel.clearFields();
        assertEquals("", mockAddTask.getItemField().getText());
        assertEquals("", mockAddTask.getRewardField().getText());
        assertEquals("", mockAddTask.getPriorityField().getText());
        assertEquals("", mockAddTask.getDescriptionField().getText());
        assertEquals("", mockAddTask.getDateField().getText());
    }

    @Test
    public void testSetTask() {
        JTextField itemField = mockAddTask.getItemField();
        JTextField rewardField = mockAddTask.getRewardField();
        JTextField priorityField = mockAddTask.getPriorityField();
        JTextField descriptionField = mockAddTask.getDescriptionField();
        JTextField dateField = mockAddTask.getDateField();

        itemField.setText("Task1");
        rewardField.setText("100");
        priorityField.setText("1");
        descriptionField.setText("Test description");
        dateField.setText("2023-01-01");

        Task task = addTaskModel.setTask("123");
        assertNotNull(task);
        assertEquals("Task1", task.getName());
        assertEquals(100, task.getReward());
        assertEquals(1, task.getPriority());
        assertEquals("Test description", task.getDescription());
        assertEquals("2023-01-01", task.getDate());
        assertEquals("Incomplete", task.getStatus());
    }

    @Test
    public void testSetTaskValidData() {
        mockAddTask.getItemField().setText("Task1");
        mockAddTask.getRewardField().setText("100");
        mockAddTask.getPriorityField().setText("1");
        mockAddTask.getDescriptionField().setText("Description");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        mockAddTask.getDateField().setText(df.format(new Date(System.currentTimeMillis() + 86400000))); // Tomorrow

        assertTrue(addTaskModel.checkValidTask());
        assertNotNull(addTaskModel.setTask("123"));
    }

    @Test
    public void testSetTaskInvalidData() {
        mockAddTask.getItemField().setText("");
        mockAddTask.getRewardField().setText("100");
        mockAddTask.getPriorityField().setText("1");
        mockAddTask.getDescriptionField().setText("Description");
        mockAddTask.getDateField().setText("2020-01-01");

        assertFalse(addTaskModel.checkValidTask());
        assertNull(addTaskModel.setTask("123"));
    }
}
