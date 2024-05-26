import org.junit.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import org.json.JSONException;
import Class.*;

public class ParentTest {

    @Test
    public void testDefaultConstructor() {
        Parent parent = new Parent();
        assertNotNull(parent);
    }

    @Test
    public void testConstructorWithID() {
        Parent parent = new Parent("user1");
        assertEquals("user1", parent.getID());
    }

    @Test
    public void testConstructorWithIDAndPassword() throws IOException, JSONException {
        // 这里假设 "correctPassword" 是预设的正确密码
        Parent parent = new Parent("user1", "12");
        assertEquals("user1", parent.getID());
        assertNotNull(parent.getTasks());  // 假设构造器里初始化了 tasks
    }

    @Test
    public void testConstructorWithWrongPassword() throws IOException, JSONException {
        // 这里假设 "wrongPassword" 是错误的密码
        new Parent("user1", "wrongPassword");
    }

    @Test
    public void testDumpTaskList() throws IOException {
        Parent parent = new Parent("user1", "12");
        parent.dumpTaskList();
        // 验证文件是否包含预期数据
        File file = new File("src/main/java/Class/TaskList.jsonl");
        assertTrue(file.exists());
        // 读取内容并验证是否正确修改
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
