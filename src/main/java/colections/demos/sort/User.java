package colections.demos.sort;

public class User {
	private int userId;
    private String fname;
    private String lname;
    private String email;
    
    public User(int userId, String fname, String lname, String email) {
        this.userId = userId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
    
/*    @Override
    public boolean equals(Object obj) {
    	if (obj instanceof User) {
			User userObj = (User) obj;
			if (this.getFname().equals(userObj.getFname()) && 
					this.getLname().equals(userObj.getLname()) && 
					this.getEmail().equals(userObj.getEmail())
					) {
				System.out.println("matches: return true");
				return true;
			}
		}
		System.out.println("does not match: return false");
		return false;
    }*/
    
    @Override
    public boolean equals(Object obj) {
    	if (obj instanceof User) {
			User userObj = (User) obj;
			if (this.getUserId() == userObj.getUserId()) {
				return true;
			}
    	}
    	return false;
    }
    
/*    @Override
    public int hashCode() {
    	return this.getUserId();
    }*/

    
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
    
    
}
