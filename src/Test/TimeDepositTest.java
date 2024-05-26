import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import Model.DepositWithdraw.*;
import View.DepositWithdraw.*;
import Class.*;


public class TimeDepositTest {
    private TimeDeposit_m model;
    private TimeDeposit mockTimeDeposit;
    private JFrame mockFrame;
    private Child mockChild;

    @BeforeEach
    public void setUp() {
        mockTimeDeposit = mock(TimeDeposit.class);
        model = new TimeDeposit_m(mockTimeDeposit);
        mockFrame = mock(JFrame.class);
        mockChild = mock(Child.class);

        // Mocking the text field to simulate user input
        JTextField textField = new JTextField();
        when(mockTimeDeposit.getTextField1()).thenReturn(textField);

        // Setup default behaviors for mock objects
        when(mockChild.getCharge()).thenReturn(1000.0);
        when(mockChild.getTimeDeposit()).thenReturn(200.0);
        when(mockChild.getLogList()).thenReturn(new java.util.ArrayList<>());
    }

    @Test
    public void testCheckValidDeposit() {
        assertTrue(model.checkValidDeposit(mockChild, 100));  // Valid deposit
        assertFalse(model.checkValidDeposit(mockChild, 1100)); // Insufficient balance
        assertFalse(model.checkValidDeposit(mockChild, -10)); // Negative value
    }

    @Test
    public void testCheckInput() {
        mockTimeDeposit.getTextField1().setText("500.00");
        assertTrue(model.checkInput());

        mockTimeDeposit.getTextField1().setText("invalid input");
        assertFalse(model.checkInput());
    }

}
