package model;

public class user {
	private int idu;
    private String username;
    private String password;
    private String email;
    
    
    public user() {
    }
    public user(int idu, String username, String password, String email ) {
    	this.idu = idu;
    	this.username = username;
    	this.password = password;
    	this.email = email;
    }
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdu() {
		return idu;
	}
	public void setIdu(int idu) {
		this.idu = idu;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "user [idu=" + idu + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
}
