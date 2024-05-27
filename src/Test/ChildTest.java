import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import Class.*;
import Model.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import java.io.*;

class ChildTest {

    @Test
    void testLoadTaskList() throws Exception {
        Child child = new Child("test", "12");
        child.loadTaskList();
        assertEquals(1, child.getTasks().size());
    }
}
