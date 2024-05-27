import Model.*;
import Class.*;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import View.Login;
import javax.swing.*;
import org.json.JSONException;
import org.json.JSONObject;

class LoginTest {

    @Mock
    private Login login;
    @Mock
    private JFrame frame;

    private Login_m loginManager;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        loginManager = new Login_m(login);
    }

    @Test
    void testCheckValidCredentials() throws Exception {

        when(login.getTextField1()).thenReturn(new JTextField("test"));
        when(login.getPasswordField1()).thenReturn(new JPasswordField("12"));


        Child result = loginManager.check();


        assertNotNull(result);
        assertEquals("test", result.getID());
    }

    @Test
    void testCheckInvalidCredentials() throws Exception {

        when(login.getTextField1()).thenReturn(new JTextField("user"));
        when(login.getPasswordField1()).thenReturn(new JPasswordField("wrong_password"));


        Child result = loginManager.check();


        assertNull(result);
    }

    @Test
    void testCheckParentValidCredentials() throws Exception {

        when(login.getTextField1()).thenReturn(new JTextField("user1"));
        when(login.getPasswordField1()).thenReturn(new JPasswordField("12"));


        Parent result = loginManager.checkParent();


        assertNotNull(result);
        assertEquals("user1", result.getID());
    }

    @Test
    void testCheckParentInvalidCredentials() throws Exception {

        when(login.getTextField1()).thenReturn(new JTextField("user"));
        when(login.getPasswordField1()).thenReturn(new JPasswordField("wrong_password"));


        Parent result = loginManager.checkParent();

        assertNull(result);
    }

}
