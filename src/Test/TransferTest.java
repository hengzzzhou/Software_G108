import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import Model.*;
import View.*;
import Class.*;
import java.util.ArrayList;

public class TransferTest {
    private TransferOfMoney_m transferModel;
    private TansferofMoney mockTransferOfMoney;
    private JFrame mockFrame;
    private Parent mockParent;

    @BeforeEach
    public void setUp() {
        mockTransferOfMoney = mock(TansferofMoney.class);
        mockParent = mock(Parent.class);
        transferModel = new TransferOfMoney_m(mockTransferOfMoney);
        mockFrame = mock(JFrame.class);

        JTextField demandField = new JTextField("100.00");
        JTextField timeField = new JTextField("200.00");
        JTextField changeField = new JTextField("150.00");
        JTextField totalField = new JTextField("350.00");
        JTextField transferField = new JTextField();


        when(mockTransferOfMoney.getDemandField4()).thenReturn(demandField);
        when(mockTransferOfMoney.getTimeField3()).thenReturn(timeField);
        when(mockTransferOfMoney.getChangeField2()).thenReturn(changeField);
        when(mockTransferOfMoney.getTotalField1()).thenReturn(totalField);
        when(mockTransferOfMoney.getTransferField5()).thenReturn(transferField);
        when(mockParent.getID()).thenReturn("parentID");
        when(mockParent.getLogList()).thenReturn(new ArrayList<>());
    }


    @Test
    public void testValidTransfer() {
        mockTransferOfMoney.getTransferField5().setText("100.00");
        assertTrue(transferModel.validTransfer());
    }

    @Test
    public void testInvalidTransferEmpty() {
        mockTransferOfMoney.getTransferField5().setText("");
        assertFalse(transferModel.validTransfer());
    }

    @Test
    public void testInvalidTransferNonNumeric() {
        mockTransferOfMoney.getTransferField5().setText("abc");
        assertFalse(transferModel.validTransfer());
    }

    @Test
    public void testTransferMoney() {
        mockTransferOfMoney.getTransferField5().setText("100.00");
        when(mockParent.getLogList()).thenReturn(new ArrayList<>());
        transferModel.transferMoney(mockParent);
        assertEquals("100.0", mockTransferOfMoney.getChangeField2().getText());
        assertEquals("100.0", mockTransferOfMoney.getTotalField1().getText());
    }

}
