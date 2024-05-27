import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import Model.*;
import Class.*;
import View.*;

public class SetGoalTest {
    private SetGoal mockSetGoal;
    private SetGoal_m setGoalModel;
    private JFrame mockParentFrame;
    private JTextField mockTextField;

    @BeforeEach
    public void setUp() {
        mockSetGoal = mock(SetGoal.class);
        mockParentFrame = mock(JFrame.class);
        mockTextField = mock(JTextField.class);

        when(mockSetGoal.getTextField1()).thenReturn(mockTextField);

        setGoalModel = new SetGoal_m(mockSetGoal);
    }

    @Test
    public void testConfirmButtonValidGoal() {
        Child mockChild = new Child();
        mockChild.setTotal(100);
        when(mockTextField.getText()).thenReturn("200");

        Child resultChild = setGoalModel.confirmButton(mockChild);

        assertEquals(200, resultChild.getProgress());
    }

    @Test
    public void testConfirmButtonInvalidGoal() {
        Child mockChild = new Child();
        mockChild.setTotal(300);
        when(mockTextField.getText()).thenReturn("200");

        Child resultChild = setGoalModel.confirmButton(mockChild);

        assertEquals(0, resultChild.getProgress()); // Assuming initial progress is 0
        assertFalse(setGoalModel.checkValidGoal(mockChild, 200));
    }

    @Test
    public void testCheckValidGoal() {
        Child user = new Child();
        user.setTotal(500);

        assertFalse(setGoalModel.checkValidGoal(user, -1));
        assertFalse(setGoalModel.checkValidGoal(user, 0));
        assertFalse(setGoalModel.checkValidGoal(user, 500));
        assertTrue(setGoalModel.checkValidGoal(user, 501));
    }
}
