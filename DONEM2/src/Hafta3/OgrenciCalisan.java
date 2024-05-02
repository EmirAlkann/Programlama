package Hafta3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciCalisan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Ogrenci> ogrenciler=new ArrayList<Ogrenci>();
		byte menu;
		for(;;) {
			System.out.println("0-.Çıkış\n1-Kayıt ekle\n2-Listele\n3-İsim arama\n4-Ortalama");
			menu = scanner.nextByte();
			switch(menu) {
			case 0:
				System.out.println("Program bitti");
			System.exit(0);
			    break;
			case 1:Fonksiyonlar.KayitEkle(scanner,ogrenciler);			
			    break;
			case 2:
				Fonksiyonlar.Listele(ogrenciler);				
			    break;
			case 3:
				System.out.println("Aranacak adı giriniz: ");
				String arananAd = scanner.next();
				Fonksiyonlar.AdArama(arananAd,ogrenciler);
			    break;
			case 4:
				Fonksiyonlar.Ortalama(ogrenciler);
			    break;
			default:
				System.out.println("Yanlış Menü Değeri");
				break;
			}
		}
		

	}

}
