import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.json.JSONObject;
import org.json.JSONException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import Class.*;
import org.junit.jupiter.api.*;

public class UserTest {
    User user;

    @BeforeEach
    public void setUp() throws IOException, JSONException {
        user = new User("test", "12");
    }

    @Test
    public void testUserConstructor() {
        assertEquals("test", user.getID());
    }

    @Test
    public void testLoadTaskList() {
        user.loadTaskList();
        assertNotNull(user.getTasks());
    }

    @Test
    public void testFileNotFound() throws JSONException, IOException {
        new User("invalidID", "wrongPassword");  // 应抛出 IOException
    }
}
