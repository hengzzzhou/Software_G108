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

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;

public class AddTaskTest {
    private AddTask mockAddTask;
    private AddTask_m addTaskModel;
    private JFrame mockFrame;

    @BeforeEach
    public void setUp() {
        mockAddTask = mock(AddTask.class);
        addTaskModel = new AddTask_m(mockAddTask);
        mockFrame = mock(JFrame.class);


        JTextField itemField = new JTextField();
        JTextField rewardField = new JTextField();
        JTextField priorityField = new JTextField();
        JTextField descriptionField = new JTextField();
        JTextField dateField = new JTextField();
        when(mockAddTask.getItemField()).thenReturn(itemField);
        when(mockAddTask.getRewardField()).thenReturn(rewardField);
        when(mockAddTask.getPriorityField()).thenReturn(priorityField);
        when(mockAddTask.getDescriptionField()).thenReturn(descriptionField);
        when(mockAddTask.getDateField()).thenReturn(dateField);
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
    public void testSetTaskValidData() {
        mockAddTask.getItemField().setText("Task");
        mockAddTask.getRewardField().setText("100");
        mockAddTask.getPriorityField().setText("1");
        mockAddTask.getDescriptionField().setText("Description");
        mockAddTask.getDateField().setText("2024-05-27");

        Task task = addTaskModel.setTask("123");
        assertNotNull(task);
        assertEquals("Task", task.getName());
        assertEquals(100, task.getReward());
        assertEquals(1, task.getPriority());
        assertEquals("Description", task.getDescription());
        assertEquals("2024-05-27", task.getDate());
        assertEquals("Incomplete", task.getStatus());
    }

    @Test
    public void testSetTaskInvalidData() {
        mockAddTask.getItemField().setText("");
        mockAddTask.getRewardField().setText("100");
        mockAddTask.getPriorityField().setText("1");
        mockAddTask.getDescriptionField().setText("Description");
        mockAddTask.getDateField().setText("2024-05-27");

        Task task = addTaskModel.setTask("123");
        assertNull(task);

    }

    @Test
    public void testCheckValidTaskInvalidInput() {
        mockAddTask.getItemField().setText("");
        mockAddTask.getRewardField().setText("not a number");
        mockAddTask.getPriorityField().setText("-1");
        mockAddTask.getDescriptionField().setText("Description");
        mockAddTask.getDateField().setText("2010-01-01");

        assertFalse(addTaskModel.checkValidTask());
    }
}
