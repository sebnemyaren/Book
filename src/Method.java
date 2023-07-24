import java.util.Scanner;

public class Method {
	public static void main(String[] args) {
		
		System.out.println("Yapılmasını istediğiniz işlem türünü seçiniz: ");
		System.out.println("1: Toplama");
		System.out.println("2: Çıkarma");
		System.out.println("3: Çarpma");
		System.out.println("4: Bölme");
		System.out.println("İşleminizi seçiniz: ");
			
	}
	
	static void toplamaIslemi() {
			Scanner scan = new Scanner(System.in);
			System.out.print("Birinci sayıyı giriniz:");
			int birinciSayi = scan.nextInt();
			System.out.print("İkinci sayıyı giriniz:");
			int ikinciSayi = scan.nextInt();
			System.out.print("Sonuç =" + (birinciSayi + ikinciSayi));
	}
	
	static void cıkarmaIslemi() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz:");
		int birinciSayi = scan.nextInt();
		System.out.print("İkinci sayıyı giriniz:");
		int ikinciSayi = scan.nextInt();
		System.out.print("Sonuç =" + (birinciSayi - ikinciSayi)); 
	}
		
	static void carpmaIslemi() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz:");
		int birinciSayi = scan.nextInt();
		System.out.print("İkinci sayıyı giriniz:");
		int ikinciSayi = scan.nextInt();
		System.out.print("Sonuç =" + (birinciSayi * ikinciSayi));
	}
	
	static void bolmeIslemi() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz:");
		int birinciSayi = scan.nextInt();
		System.out.print("İkinci sayıyı giriniz:");
		int ikinciSayi = scan.nextInt();
		System.out.print("Sonuç =" + (birinciSayi / ikinciSayi));
	}
	
		
	
}
	
	
	
	
	
	