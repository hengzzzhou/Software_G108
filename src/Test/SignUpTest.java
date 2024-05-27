import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import Model.*;
import View.*;
import Class.*;


public class SignUpTest {
    private Signup mockSignup;
    private Signup_m signupModel;
    private JFrame mockFrame;

    @BeforeEach
    public void setUp() {
        mockSignup = mock(Signup.class);
        signupModel = new Signup_m(mockSignup);
        mockFrame = mock(JFrame.class);

        JTextField idField = new JTextField();
        JPasswordField passwordField1 = new JPasswordField();
        JPasswordField passwordField2 = new JPasswordField();
        JTextField parentIDField = new JTextField();

        when(mockSignup.getTextField1()).thenReturn(idField);
        when(mockSignup.getPasswordField1()).thenReturn(passwordField1);
        when(mockSignup.getPasswordField2()).thenReturn(passwordField2);
        when(mockSignup.getParentID()).thenReturn(parentIDField);
    }

    @Test
    public void testCheckID() {

        mockSignup.getTextField1().setText("newID");
        assertTrue(signupModel.checkID());


        mockSignup.getTextField1().setText("test");
        assertFalse(signupModel.checkID());
    }

    @Test
    public void testCheckPassword() {

        mockSignup.getPasswordField1().setText("password");
        mockSignup.getPasswordField2().setText("password");
        assertTrue(signupModel.checkPassword());


        mockSignup.getPasswordField2().setText("different");
        assertFalse(signupModel.checkPassword());
    }

    @Test
    public void testCheckNull() {

        mockSignup.getTextField1().setText("userID");
        mockSignup.getPasswordField1().setText("password");
        mockSignup.getPasswordField2().setText("password");
        mockSignup.getParentID().setText("parentID");
        assertTrue(signupModel.checkNull());


        mockSignup.getParentID().setText("");
        assertFalse(signupModel.checkNull());
    }

    @Test
    public void testCheckParentID() {

        mockSignup.getParentID().setText("newParentID");
        assertFalse(signupModel.checkParentID());
        mockSignup.getParentID().setText("user1");
        assertTrue(signupModel.checkParentID());
    }

    @Test
    public void testRegister() {

        mockSignup.getTextField1().setText("userID");
        mockSignup.getPasswordField1().setText("password");
        mockSignup.getParentID().setText("parentID");
        signupModel.register();
        verify(mockSignup, atLeastOnce()).getTextField1();

    }


    @Test
    public void testClear() {
        signupModel.clear();
        assertEquals("", mockSignup.getTextField1().getText());
        assertEquals("", mockSignup.getPasswordField1().getText());
        assertEquals("", mockSignup.getPasswordField2().getText());
        assertEquals("", mockSignup.getParentID().getText());
    }
}
