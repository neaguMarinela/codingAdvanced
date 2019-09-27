package colections.demos.sort;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class CollectUsers {
	
	private HashSet<User> userHs = new HashSet<User>();

	public static void main(String[] args) {
		CollectUsers cUsers = new CollectUsers();
        User user1 = new User(1, "John", "Doe", "jdoe@mail.com");
        User user2 = new User(2, "Mary", "Jane", "mjane@mail.com");
        User user3 = new User(3, "Cal", "Dale", "cdale@mail.com");
        User user4 = new User(1, "John", "Doe", "jdoe@mail.com"); // user4 is duplicate of user1
        
        // add 4 users
        cUsers.addUser(user1);
        cUsers.addUser(user2);
        cUsers.addUser(user3);
        cUsers.addUser(user4);
       
        // print 4 hashCodes: they are are different
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());
        System.out.println(user4.hashCode()); // notice hashCodes are different for user1/4 since hashCode() is overridden
        
        System.out.println(user1.equals(user4)); // must be true since equals() is overridden
        
        // size and contains test: hashCode not overridden yet
        System.out.println(cUsers.getUserHs().size()); // since it is hashset it stores unique values, size should be 4 without overriding hashCode()
        
        // hashCode returns unique numbers unless overridden
        // override hashCode now: Uncomment it in User.java, print size again, it will be 3
        
	}
	
	public void addUser(User user) {
		userHs.add(user);
	}

	public HashSet<User> getUserHs() {
		return userHs;
	}

	public void setUserHs(HashSet<User> userHs) {
		this.userHs = userHs;
	}





}
