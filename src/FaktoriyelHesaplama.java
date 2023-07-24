import java.util.Scanner;

public class FaktoriyelHesaplama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Faktöriyeli hesaplanacak sayıyı giriniz: ");
		int sayi = scan.nextInt();
		int faktoriyel  = 1;
		
		for(int i = 1; i <= sayi; sayi++) {
			faktoriyel = faktoriyel * i;
		}
		System.out.println("Sonuç= " + faktoriyel);
	}
}
	