import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int birinciSayi;
		int ikinciSayi;
		int yapilacakIslem;
		
		System.out.println("İşlem yapılacak birinci sayıyı giriniz: ");
		birinciSayi = scan.nextInt();
		System.out.println("İşlem yapılacak ikinci sayıyı giriniz: ");
		ikinciSayi = scan.nextInt();
		System.out.println("Yapılmasını istediğiniz işlem türünü seçiniz: ");
		System.out.println("1: Toplama");
		System.out.println("2: Çıkarma");
		System.out.println("3: Çarpma");
		System.out.println("4: Bölme");
		System.out.println("İşleminizi seçiniz: ");
		yapilacakIslem = scan.nextInt();
		
		if(yapilacakIslem ==1) {
			System.out.println("Sonuç=" + (birinciSayi + ikinciSayi));
		} else if(yapilacakIslem == 2) {
			System.out.println("Sonuç=" + (birinciSayi - ikinciSayi));
		} else if(yapilacakIslem == 3) {
			System.out.println("Sonuç=" + (birinciSayi * ikinciSayi));
		} else {
			System.out.println("Sonuç=" + (birinciSayi / ikinciSayi));
		}
	}
}
