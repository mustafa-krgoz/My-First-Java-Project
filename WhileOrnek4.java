import java.util.Scanner;

public class WhileOrnek4 {

	public static void main(String[] args) {
		// Faktöriyel Hesaplama
		
	Scanner input = new Scanner(System.in);
		System.out.print("Faktöriyeli hesaplanacak sayıyı giriniz:");
			int sayi = input.nextInt();
			int sonuc = 1;
		while(sayi>0) {
			sonuc = sonuc*sayi;
			sayi--;		
		}
		System.out.print("Faktöriyelin sonucu:" + sonuc);
	}

}
