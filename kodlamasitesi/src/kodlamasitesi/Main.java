package kodlamasitesi;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setFirstName("Berat");
		student1.setLastName("�elik");
		student1.setUserName("beratcelik");
		student1.setPassword("123456");
		student1.setCompletionRate(3.45);
		student1.setSchool("�skenderun Teknik");
		
		
		Student student2 = new Student();
		student2.setFirstName("Aleyna");
		student2.setLastName("Teke");
		student2.setUserName("tekealeyna");
		student2.setPassword("32141");
		student2.setCompletionRate(4.78);
		student2.setSchool("�stanbul Teknik");
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiro�");
		instructor1.setPassword("78945");
		instructor1.setUserName("engindemirog");
		instructor1.setBiography("Odt� mezunuyum");
		
		
		
		UserManager userManager = new UserManager();
		User[] users = {student1,student2,instructor1};
		
		userManager.addMultiple(users);
	//	userManager.add(student1);
	//	userManager.add(instructor1);
		
		
		
		
		
		

	}

}
