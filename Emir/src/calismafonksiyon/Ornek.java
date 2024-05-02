package calismafonksiyon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ornek {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		List<String> ad = new ArrayList<String>();
		List<Byte> sms = new ArrayList<Byte>();
		List<Byte> internet = new ArrayList<Byte>();
		List<Byte> dk = new ArrayList<Byte>();
		List<Byte> fatura = new ArrayList<Byte>();
		byte menu;
		for(;;) {
			CalismaFonksiyon.menu();
			menu = giris.nextByte();
		switch(menu) {
		case 1:
			CalismaFonksiyon.VeriGiris(ad,sms,internet,dk,fatura);
			break;
		case 2:
			CalismaFonksiyon.Liste(ad,sms,internet,dk,fatura);
			break;
		case 3:
			System.out.println("En küçük sms: "+CalismaFonksiyon.EnKucuk(sms));
			System.out.println("En küçük internet: "+CalismaFonksiyon.EnKucuk(internet));
			System.out.println("En küçük dakika: "+CalismaFonksiyon.EnKucuk(dk));
			System.out.println("En küçük fatura: "+CalismaFonksiyon.EnKucuk(fatura));
			break;
		case 4:
			System.out.println("En büyük sms: "+CalismaFonksiyon.EnBuyuk(sms));
			System.out.println("En büyük internet: "+CalismaFonksiyon.EnBuyuk(internet));
			System.out.println("En büyük dakika: "+CalismaFonksiyon.EnBuyuk(dk));
			System.out.println("En büyük fatura: "+CalismaFonksiyon.EnBuyuk(fatura));
			break;
		case 5:
			System.out.println("Sms ortalaması: "+CalismaFonksiyon.Ortalama(sms));
			System.out.println("İnternet ortalaması: "+CalismaFonksiyon.Ortalama(internet));
			System.out.println("Dakika ortalaması: "+CalismaFonksiyon.Ortalama(dk));
			System.out.println("Fatura ortalaması: "+CalismaFonksiyon.Ortalama(fatura));
			break;
		case 6:
			System.out.println("Aranacak isim giriniz: ");
			String arananAd = giris.next();
		    CalismaFonksiyon.adArama(ad, sms, internet, dk, fatura, arananAd);
		case 7: 
			System.out.println("Silincek isim giriniz: ");
			String silinenAd = giris.next();
			CalismaFonksiyon.adSilme(ad, sms, internet, dk, fatura, silinenAd);
		    break;
		case 8:
			System.out.println("Düzeltilecek adı giriniz: ");
			String duzeltAd = giris.next();
			CalismaFonksiyon.adDuzelt(ad, sms, internet, dk, fatura,duzeltAd);
			break;
		case 9:
		    CalismaFonksiyon.Toplam(ad,sms,internet,dk,fatura);
		    break;
		case 10: 
			System.out.println("Çıkış yapılıyor..");
			System.exit(0);
			break;
		default:
			System.out.println("Yanlış seçim tekrar deneyin");
			
		}
		}
	}

}
