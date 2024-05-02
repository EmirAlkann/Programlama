package hafta4;

import java.util.ArrayList;
import java.util.Scanner;

public class CalisanIslem {

	public static void main(String[] args) {
		ArrayList<Kisi> kisiListesi = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		byte menu;
		while(true) {
			System.out.println("0-Çıkış");
			System.out.println("1-Kayıt girişi");
			System.out.println("2-Listeleme\n3-Arama\n4-Net maaş hesaplama\n5-Kişi görüntüleme");
			menu = scanner.nextByte();
			switch(menu) {
			case 0:
				System.out.println("Program bitti");
				System.exit(0);
				break;
			case 1:
				Fonksiyonlar.CalisanEkle(scanner,kisiListesi);
				break;
			case 2:
				Fonksiyonlar.CalisanListele(kisiListesi);
				break;
			case 3:
				Fonksiyonlar.CalisanAra(scanner,kisiListesi);
				break;
			case 4:
				Fonksiyonlar.Maas(kisiListesi);
				break;
			case 5:
				Fonksiyonlar.Kisi1Listele(kisiListesi);
				break;
			default:System.out.println("Yanlış menü değeri");
				
				break;
			}
		}

	}

}
