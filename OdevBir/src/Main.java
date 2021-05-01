import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course("C#","Engin Demiro�",12,3.11);
		Course course2 = new Course("Java","Berat �elik",35,22.4);
		Course course3 = new Course ("Python","Emre Parmaks�z",40,45.1);
		
		Course[] courses = {course1,course2,course3};
		
		for (Course course : courses) {
			System.out.println("Kursun ad: "+course.adi);
			System.out.println("�zlenme Oran�: "+course.izlenmeOrani);
			System.out.println("Kursun Tamamlanma Oran�: "+course.tamamlanmaOrani);
			
		}
		System.out.println("************************************************");
		
		Egitmen egitmen1 = new Egitmen("Engin Demiro�",32,3,2000);
		Egitmen egitmen2 = new Egitmen("Berat �elik",20,2,25);
		Egitmen egitmen3 = new Egitmen("Emre Parmaks�z",22,5,150);
		
		Egitmen[] egitmenler = {egitmen1, egitmen2, egitmen3};
		
		for (Egitmen egitmen : egitmenler) {
			System.out.println("E�timen Ad�: "+ egitmen.adi);
			System.out.println("E�itmenin Ya�� : "+ egitmen.yas);
			System.out.println("Kurs Say�s�: "+ egitmen.kursSayisi);
			System.out.println("��renci Say�s�: "+ egitmen.ogrenciSayisi);
			
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
