package hafta7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ornek {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		List<String> isim = new ArrayList<String>();
		List<Byte> fiyat = new ArrayList<Byte>();
		List<Byte> miktar = new ArrayList<Byte>();
		List<String> cesit = new ArrayList<String>();
		byte menu;
		for(;;) {
			Fonksiyon.menu();
				System.out.println("Seçim yapınız: ");
				menu=giris.nextByte();
				switch(menu) {
				case 1:
					Fonksiyon.veriGiris(isim,fiyat,miktar,cesit);
				break;
				case 2:
					Fonksiyon.Listeleme(isim,fiyat,miktar,cesit);
					break;
				case 3:	
					System.out.println("Aranacak çeşit giriniz: ");
					String cesitAra = giris.next();
					Fonksiyon.cesitArama(isim,fiyat,miktar,cesit,cesitAra);
				    break;
				case 4:
					System.out.println("Toplam fiyat: "+Fonksiyon.toplamFiyat(cesit, fiyat, miktar, cesit));
					break;
				case 5:
					System.out.println("Aranacak ürün giriniz: ");
					String urunAra = giris.next();
					Fonksiyon.urunAdi(isim,fiyat,miktar,cesit,urunAra);
					break;
				case 6:
					System.out.println("En düşük miktarlı ürün: "+Fonksiyon.enD(fiyat));
					break;
				case 7:
					System.out.println("Düzeltilecek adı giriniz: ");
					String duzeltAd = giris.next();
					Fonksiyon.duzeltme(isim,fiyat,miktar,cesit,duzeltAd);
					break;
				case 8:
					System.out.println("Silinecek adı giriniz: ");
					String silinenAd = giris.next();
					Fonksiyon.silme(isim,fiyat,cesit,miktar,silinenAd);					
					break;
				case 9:
					System.out.println("Çıkış yapılıyor..");
					System.exit(0);
					break;
				default:
					System.out.println("Yanlış işlem seçimi tekrar deneyin.");
					break;
					}

	}
}}