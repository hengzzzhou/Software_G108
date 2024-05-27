import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import Model.*;
import View.*;
import Class.*;

public class SignUpParentTest {
    private SignupParent mockSignupParent;
    private SignupParent_m signupParentModel;
    private JFrame mockFrame;

    @BeforeEach
    public void setUp() {
        mockSignupParent = mock(SignupParent.class);
        signupParentModel = new SignupParent_m(mockSignupParent);
        mockFrame = mock(JFrame.class);


        JTextField idField = new JTextField();
        JPasswordField passwordField1 = new JPasswordField();
        JPasswordField passwordField2 = new JPasswordField();

        when(mockSignupParent.getTextField1()).thenReturn(idField);
        when(mockSignupParent.getPasswordField1()).thenReturn(passwordField1);
        when(mockSignupParent.getPasswordField2()).thenReturn(passwordField2);
    }


    @Test
    public void testCheckID() {
        mockSignupParent.getTextField1().setText("uniqueID");
        assertTrue(signupParentModel.checkID());
        mockSignupParent.getTextField1().setText("user1");
        assertFalse(signupParentModel.checkID());
    }

    @Test
    public void testCheckPasswordMatching() {
        mockSignupParent.getPasswordField1().setText("password");
        mockSignupParent.getPasswordField2().setText("password");
        assertTrue(signupParentModel.checkPassword());
    }

    @Test
    public void testCheckPasswordNotMatching() {
        mockSignupParent.getPasswordField1().setText("password");
        mockSignupParent.getPasswordField2().setText("different");
        assertFalse(signupParentModel.checkPassword());
    }

    @Test
    public void testCheckNull() {
        mockSignupParent.getTextField1().setText("userID");
        mockSignupParent.getPasswordField1().setText("password");
        mockSignupParent.getPasswordField2().setText("password");
        assertTrue(signupParentModel.checkNull());
        mockSignupParent.getTextField1().setText("");
        assertFalse(signupParentModel.checkNull());
    }

    @Test
    public void testClear() {
        signupParentModel.clear();
        assertEquals("", mockSignupParent.getTextField1().getText());
        assertEquals("", mockSignupParent.getPasswordField1().getText());
        assertEquals("", mockSignupParent.getPasswordField2().getText());
    }
}
