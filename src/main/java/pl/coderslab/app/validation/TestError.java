package pl.coderslab.app.validation;

public class TestError {

    private String path;
    private String message;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public TestError(String path, String message) {
        this.path = path;
        this.message = message;
    }
}
