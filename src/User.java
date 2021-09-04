
public class User {
	private String username,password;
	private boolean remmember;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, boolean remmember) {
		super();
		this.username = username;
		this.password = password;
		this.remmember = remmember;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isRemmember() {
		return remmember;
	}
	public void setRemmember(boolean remmember) {
		this.remmember = remmember;
	}
	
}
