import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course("C#","Engin Demiroð",12,3.11);
		Course course2 = new Course("Java","Berat Çelik",35,22.4);
		Course course3 = new Course ("Python","Emre Parmaksýz",40,45.1);
		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			System.out.println("Kursun ad: "+course.adi);
			System.out.println("Ýzlenme Oraný: "+course.izlenmeOrani);
			System.out.println("Kursun Tamamlanma Oraný: "+course.tamamlanmaOrani);
			
		}
		System.out.println("************************************************");
		
		Egitmen egitmen1 = new Egitmen("Engin Demiroð",32,3,2000);
		Egitmen egitmen2 = new Egitmen("Berat Çelik",20,2,25);
		Egitmen egitmen3 = new Egitmen("Emre Parmaksýz",22,5,150);
		
		Egitmen[] egitmenler = {egitmen1, egitmen2, egitmen3};
		
		for (Egitmen egitmen : egitmenler) {
			System.out.println("Eðtimen Adý: "+ egitmen.adi);
			System.out.println("Eðitmenin Yaþý : "+ egitmen.yas);
			System.out.println("Kurs Sayýsý: "+ egitmen.kursSayisi);
			System.out.println("Öðrenci Sayýsý: "+ egitmen.ogrenciSayisi);
			
		}
		
		KursManager kursManager = new KursManager();
		kursManager.addToCourse(course1);
		kursManager.addToCourse(course2);
		kursManager.addToCourse(course3);
		kursManager.deleteToCourse(course1);
		kursManager.deleteToCourse(course2);
		kursManager.deleteToCourse(course3);
		
		
		

	}

}
