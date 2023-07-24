import java.util.*;

public class Faktoriyel {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Faktöriyeli hesaplanacak sayıyı giriniz: ");
		int sayi = scan.nextInt();
		int sonuc = 1;
		
		for(int i = 1; i<= sayi; i++) {
			sonuc = sonuc * i;
		}
		System.out.print("Faktöriyel = " + sonuc);
	}
}