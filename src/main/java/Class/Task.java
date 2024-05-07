package Class;

public class Task {
    private String id;
    private String target;
    private String date;

    public Task(String id, String target, String date) {
        this.id = id;
        this.target = target;
        this.date = date;
    }

    // getters and setters...
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
    public String getUsername() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}