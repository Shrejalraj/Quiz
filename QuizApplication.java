package Quiz;

	import java.util.HashMap;
	import java.util.Map;

	public class QuizApplication {
	    private Map<String, String> users = new HashMap<>();

	    public void registerUser(String username, String password) {
	        users.put(username, password);
	    }

	    public boolean login(String username, String password) {
	        String storedPassword = users.get(username);
	        return storedPassword != null && storedPassword.equals(password);
	    }
	}
