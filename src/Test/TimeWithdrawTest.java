import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import Model.DepositWithdraw.*;
import View.DepositWithdraw.*;
import Class.*;

public class TimeWithdrawTest {
    private TimeDeposit2_m model;
    private TimeDeposit2 mockView;
    private JFrame mockFrame;
    private Child mockChild;

    @BeforeEach
    public void setUp() {
        mockView = mock(TimeDeposit2.class);
        model = new TimeDeposit2_m(mockView);
        mockFrame = mock(JFrame.class);
        mockChild = mock(Child.class);

        // Mocking the text field to simulate user input
        JTextField textField = new JTextField();
        when(mockView.getTextField1()).thenReturn(textField);

        // Setting up mock child properties
        when(mockChild.getTimeDeposit()).thenReturn(1000.0);
        when(mockChild.getCharge()).thenReturn(500.0);
        when(mockChild.getLogList()).thenReturn(new java.util.ArrayList<>());
    }


    @Test
    public void testCheckValidDeposit() {
        assertTrue(model.checkValidDeposit(mockChild, 100));  // Valid deposit
        assertFalse(model.checkValidDeposit(mockChild, 1100)); // Insufficient balance
        assertFalse(model.checkValidDeposit(mockChild, -100)); // Negative amount
    }

    @Test
    public void testCheckInput() {
        mockView.getTextField1().setText("500.00");
        assertTrue(model.checkInput());

        mockView.getTextField1().setText("invalid input");
        assertFalse(model.checkInput());
    }

}
