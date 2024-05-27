import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.util.ArrayList;
import Model.*;
import View.*;
import Class.*;
import Model.DepositWithdraw.*;
import View.DepositWithdraw.*;

public class DemandWithdrawTest {
    private DemandDeposit2_m demandDepositModel;
    private DemandDeposit2 mockDemandDeposit2;
    private Child mockChild;
    private JFrame mockFrame;

    @BeforeEach
    public void setUp() {
        mockDemandDeposit2 = mock(DemandDeposit2.class);
        demandDepositModel = new DemandDeposit2_m(mockDemandDeposit2);
        mockFrame = mock(JFrame.class);
        mockChild = mock(Child.class);

        // Mocking text fields
        JTextField textField = new JTextField();
        when(mockDemandDeposit2.getTextField1()).thenReturn(textField);
    }


    @Test
    public void testCheckValidDeposit() {
        when(mockChild.getDemandDeposit()).thenReturn(200.0);
        assertTrue(demandDepositModel.checkValidDeposit(mockChild, 100));
        assertFalse(demandDepositModel.checkValidDeposit(mockChild, 300));
        assertFalse(demandDepositModel.checkValidDeposit(mockChild, -10));
    }

    @Test
    public void testCheckInput() {
        mockDemandDeposit2.getTextField1().setText("100.00");
        assertTrue(demandDepositModel.checkInput());

        mockDemandDeposit2.getTextField1().setText("invalid");
        assertFalse(demandDepositModel.checkInput());
    }

}
