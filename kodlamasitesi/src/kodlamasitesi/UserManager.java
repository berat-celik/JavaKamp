package kodlamasitesi;

public class UserManager {
	public void add(User user) {
		System.out.println("Sisteme giri� yap�ld�: "+ user.getFirstName());
		
			
	}
	
	public void addMultiple(User[] users) {
		
		for (User user : users) {
			add(user);
			
		}
		
		
	}
	

	

}
