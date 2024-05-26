import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import Model.DepositWithdraw.*;
import View.DepositWithdraw.*;
import Class.*;

public class ChangeWithdrawTest {
    private Withdrawal_m model;
    private WithDrawal mockWithDrawal;
    private JFrame mockFrame;
    private Child mockChild;

    @BeforeEach
    public void setUp() {
        mockWithDrawal = mock(WithDrawal.class);
        model = new Withdrawal_m(mockWithDrawal);
        mockFrame = mock(JFrame.class);
        mockChild = mock(Child.class);

        // Mocking the text field to simulate user input
        JTextField textField = new JTextField();
        when(mockWithDrawal.getTextField1()).thenReturn(textField);

        // Setting up mock child properties
        when(mockChild.getCharge()).thenReturn(1000.0);
        when(mockChild.getLogList()).thenReturn(new java.util.ArrayList<>());
    }

    @Test
    public void testCheckValidWithdrawal() {
        assertTrue(model.checkValidWithdrawal(mockChild, 100));  // Valid withdrawal
        assertFalse(model.checkValidWithdrawal(mockChild, 1100)); // Insufficient balance
        assertFalse(model.checkValidWithdrawal(mockChild, -10)); // Negative value
    }

    @Test
    public void testCheckInput() {
        mockWithDrawal.getTextField1().setText("500.00");
        assertTrue(model.checkInput());

        mockWithDrawal.getTextField1().setText("invalid input");
        assertFalse(model.checkInput());
    }
}
