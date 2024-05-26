import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.json.JSONObject;
import java.io.*;
import Model.*;
import Class.*;
import View.*;
import org.json.JSONException;
import org.json.JSONObject;

public class UserTest {
    private User user;

    @BeforeEach
    public void setUp() throws IOException, JSONException {
        user = new User("test", "12");
    }

    @Test
    public void testUserInitialization() {
        assertEquals("test", user.getID());
    }


    @Test
    public void testProgressUpdate() {
        user.setProgress(50);
        assertEquals(50, user.getProgress());
    }

    @Test
    public void testLogListHandling() {
        user.getLogList().add("2023-05-10|Logged in|0");
        assertFalse(user.getLogList().isEmpty());
    }
}

