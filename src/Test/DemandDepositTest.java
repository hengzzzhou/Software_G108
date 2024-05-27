import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import Model.DepositWithdraw.*;
import View.DepositWithdraw.*;
import Class.*;
import java.util.ArrayList;

public class DemandDepositTest {
    private DemandDeposit_m demandDepositModel;
    private DemandDeposit mockDemandDeposit;
    private Child mockChild;
    private JFrame mockFrame;

    @BeforeEach
    public void setUp() {
        mockDemandDeposit = mock(DemandDeposit.class);
        demandDepositModel = new DemandDeposit_m(mockDemandDeposit);
        mockFrame = mock(JFrame.class);
        mockChild = mock(Child.class);

        // Mocking text fields
        JTextField textField = new JTextField();
        when(mockDemandDeposit.getTextField1()).thenReturn(textField);

        // Setup default behaviors for mock objects
        when(mockChild.getCharge()).thenReturn(500.0);
        when(mockChild.getDemandDeposit()).thenReturn(200.0);
        when(mockChild.getLogList()).thenReturn(new ArrayList<>());
    }

    @Test
    public void testCheckValidDeposit() {
        assertTrue(demandDepositModel.checkValidDeposit(mockChild, 100));
        assertFalse(demandDepositModel.checkValidDeposit(mockChild, 600));
        assertFalse(demandDepositModel.checkValidDeposit(mockChild, -10));
    }

    @Test
    public void testCheckInput() {
        mockDemandDeposit.getTextField1().setText("100.00");
        assertTrue(demandDepositModel.checkInput());

        mockDemandDeposit.getTextField1().setText("invalid");
        assertFalse(demandDepositModel.checkInput());
    }

}
