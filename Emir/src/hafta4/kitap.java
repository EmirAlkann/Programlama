package hafta4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kitap {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		List<String> ad =new ArrayList<String>();
		List<Byte> sayfas =new ArrayList<Byte>();
		List<Byte> tarih=new ArrayList<Byte>();
		List<Byte> fiyat=new ArrayList<Byte>();
		List<String> yazar=new ArrayList<String>();
		List <String> tur=new ArrayList<String>();
		byte menu;
		for(;;) {
			kitapfonksiyon.Menu();
			menu = giris.nextByte();
			switch(menu) {
			case 1:
				kitapfonksiyon.veriGiris(ad, sayfas, tarih, fiyat,yazar,tur);
			break;
			case 2:
				kitapfonksiyon.Listeleme(ad, sayfas, tarih, fiyat,yazar,tur);
			break;	
			case 3:
				System.out.println("Sayfa  sayısı ortalaması: "+kitapfonksiyon.Ortalama(sayfas));
				System.out.println("Çıkış tarihi ortalaması: "+kitapfonksiyon.Ortalama(tarih));
				System.out.println("Fiyatlar ortalaması: "+kitapfonksiyon.Ortalama(fiyat));
				break;
			case 4:
				System.out.println("En küçük sayfa sayısı: "+kitapfonksiyon.enk(sayfas));
				System.out.println("En küçük çıkış tarihi: "+kitapfonksiyon.enk(tarih));
				System.out.println("En küçük fiyat: "+kitapfonksiyon.enk(fiyat));
				break;
			case 5:
				System.out.println("En büyük sayfa sayısı: "+kitapfonksiyon.enb(sayfas));
				System.out.println("En büyük çıkış tarihi: "+kitapfonksiyon.enb(tarih));
				System.out.println("En büyük fiyat: "+kitapfonksiyon.enb(fiyat));
				break;
			case 6:
				System.out.println("Aranacak adı giriniz: ");
				String arananAd = giris.next();
				kitapfonksiyon.arananAd(ad, sayfas, tarih, fiyat,yazar,tur,arananAd);
				break;
			case 7:
				System.out.println("Silinecek adı giriniz: ");
				String silinenAd = giris.next();
				kitapfonksiyon.silAd(ad, sayfas, tarih, fiyat,yazar,tur,silinenAd);
				break;
			case 8:
				System.out.println("Düzeltilecek adı giriniz: ");
				String duzeltAd= giris.next();
				kitapfonksiyon.duzelt(ad, sayfas, tarih, fiyat,yazar,tur,duzeltAd);
				break;
			case 9:
				System.out.println("Çıkış yapılıyor..");
				System.exit(0);
				break;
			default:
				System.out.println("Yanlış işlem seçimi.");
			}
		}
	}

}
