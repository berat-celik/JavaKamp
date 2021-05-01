package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//camelCase
		// do not repeat yourself
		/*String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.21;
		double dolarBugun = 8.23;
		int vade = 36;
		boolean dustuMu = false;
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü resmi");
			
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi");
			
		}
		else 
		{
			System.out.println("Dolar eþittir resmi");
			
		}	
		
		String kredi1 = "Hýzlý kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "Çiftçi kredisi";
		String kredi5 = "Msb kredisi";
		String kredi6 = "Meb kredisi";
		String kredi7 = "Kültür bakanlýðý kredisi";
		
		System.out.print(kredi1);
		System.out.print(kredi2);
		System.out.print(kredi3);
		System.out.print(kredi4);
		System.out.print(kredi5);
		System.out.print(kredi6);
		System.out.println(kredi7);
		
		
		
		String[] krediler = {"Hýzlý kredi","Mutlu emekli kredisi"
				,"Konut kredisi","Çiftçi kredisi","Msb kredisi",
				"Meb kredisi","Kültür bakanlýðý kredisi"};
		//foreach
		System.out.println("Foreach döngüsü");
		for(String kredi : krediler) {
			System.out.println(kredi);
			
			
		}
		
		System.out.println("For döngüsü");
		
		
		for (int i =0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
			
			
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		String sehir1 = "Ankara";
		String sehir2 = "Istanbul";
		sehir1 = sehir2;
		sehir2 = "Izmir";
		System.out.println(sehir1);
		
		*/
		
		int number = 2;
		boolean isPrime = true;
		
		if(number==1) {
			System.out.print("Sayi asal degildir");
			return;
		}
		
		if(number<1) {
			System.out.println("0 ve negatif sayilar zaten asal olamazlar");
			return;
		}
		
		
		for(int i = 2; i<number;i++) {
			if(number % i == 0) {
				isPrime = false;
			}
			
			
		}
		if(isPrime == true) {
			System.out.print("Sayi asaldir");	
			
		}
		else {
			System.out.print("Sayi asal degildir");
			
		}
		
		
	/*	int number = 6;
		int total =0;
		for (int i = 1; i<number;i++) {
			if(number%i==0) {
				total = total + i;	
					}	
		}
		
		if(total==number) {
			System.out.println("Bu sayi mükemmel sayidir: "+number);
			
		}
		else {
			System.out.println("Bu sayi mükemmel deðildir");
		}
		*/
		
		
	  /* int number1 = 220;
		int number2 = 284;
		int total =0;
		int total2 =0;
		
		for(int i=1;i<number1;i++){
			if(number1%i==0){
				total = total +i;
			
			}	
		}
		for(int i = 1; i<number2;i++) {
			if(number2%i==0) {
				total2 = total2 +i;
				
				
			}
		}
		if(total==number2 && total2==number1) {
			System.out.println("Bu iki sayi arkadastir");
			
			
		}
		
		else {
			System.out.println("Bu iki sayi arkadas degildir");
			
		}
		
		*/
		
		
		
	/*	int [] sayilar = new int [] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi = false;
		
		for(int i =0;i<sayilar.length;i++){
			if(sayilar[i]==aranacak){
				varMi = true;
				break;
				
			}
			
		}
		if(varMi){
			System.out.print("Sayi vardýr");
			
		}
		else {
			System.out.print("Sayi yoktur");
		}
		
		*/
		
		
		
		
		
	}

}
