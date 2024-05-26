import org.junit.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import org.json.JSONException;
import Class.*;

public class ParentTest {

    @Test
    public void testDumpTaskList() throws IOException {
        Parent parent = new Parent("user1", "12");
        parent.dumpTaskList();

        File file = new File("src/main/java/Class/TaskList.jsonl");
        assertTrue(file.exists());

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null && !found) {
                if (line.contains("\"ID\":\"user1\"")) {
                    found = true;
                    assertTrue(line.contains("\"Tasks\""));
                }
            }
            assertTrue(found);
        }
    }
}
