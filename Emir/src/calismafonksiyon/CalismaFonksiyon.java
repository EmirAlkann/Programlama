package calismafonksiyon;

import java.util.List;
import java.util.Scanner;

public class CalismaFonksiyon {

	public static void main(String[] args) {
		

	}

	public static void menu() {
		System.out.println("1.Veri girişi\n"
				+ "2.Listeleme\n"
				+ "3.En küçük\n"
				+ "4.En büyük\n"
				+ "5.Ortalama\n"
				+ "6.Aranan ad\n"
				+ "7.Silinen ad\n"
				+ "8.Düzeltilen ad\n"
				+ "9.Toplam\n"
				+ "10.Çıkış");
		
	}

	public static void VeriGiris(List<String> ad, List<Byte> sms, List<Byte> internet, List<Byte> dk,
			List<Byte> fatura) {
		Scanner giris = new Scanner(System.in);
		System.out.println("İsim giriniz: ");
		ad.add(giris.next());
		System.out.println("Sms miktarı giriniz: ");
		byte smss= giris.nextByte();
	    sms.add(smss);
		System.out.println("İnternet miktarı giriniz: ");
		byte intt = giris.nextByte();
		internet.add(intt);
		System.out.println("Dakika miktarı giriniz: ");
		byte dkk = giris.nextByte();
		dk.add(dkk);
		fatura.add((byte) (dkk*0.5+smss*0.45+intt*10));
		
	}

	public static void Liste(List<String> ad, List<Byte> sms, List<Byte> internet, List<Byte> dk, List<Byte> fatura) {
		for(int i=0; i<ad.size(); i++) {
			System.out.println("İsim: "+ad.get(i));
			System.out.println("Sms: "+sms.get(i));
			System.out.println("İnternet: "+internet.get(i));
			System.out.println("Dakika: "+dk.get(i));
			System.out.println("Fatura: "+fatura.get(i));
		}
		
	}

	public static int EnKucuk(List<Byte> enKCK) {
		byte enk = enKCK.get(0);
		for(int i=0; i<enKCK.size(); i++) {
			if(enKCK.get(i)<enk)
				enk = enKCK.get(i);
		}
		return enk;
	}

	public static int EnBuyuk(List<Byte> enBYK) {
		byte enb = enBYK.get(0);
		for(int i=0; i<enBYK.size(); i++) {
			if(enBYK.get(i)>enb)
				enb = enBYK.get(i);
		}
		return enb;
	}

	public static int Ortalama(List<Byte> Ort) {
		byte toplam = 0;
		for(byte sn: Ort) {
			toplam +=sn;
		}
		return toplam/Ort.size();
	}

	public static void adArama(List<String> ad, List<Byte> sms, List<Byte> internet, List<Byte> dk,
			List<Byte> fatura, String arananAd) {
		Scanner giris = new Scanner(System.in);
		int indis = ad.indexOf(arananAd);
		if(indis>=0) {
			System.out.println("İsim: "+ad.get(indis));
			System.out.println("Sms: "+sms.get(indis));
			System.out.println("İnternet: "+internet.get(indis));
			System.out.println("Fatura: "+fatura.get(indis));
			
		}
			
		
	}

	public static void adSilme(List<String> ad, List<Byte> sms, List<Byte> internet, List<Byte> dk, List<Byte> fatura,String silinenAd) {
		Scanner giris = new Scanner(System.in);
		int indis = ad.indexOf(silinenAd);
		if(indis>=0) {
			ad.remove(indis);
			sms.remove(indis);
			internet.remove(indis);
			fatura.remove(indis);
		}
		
	}

	public static void adDuzelt(List<String> ad, List<Byte> sms, List<Byte> internet, List<Byte> dk,
			List<Byte> fatura,String duzeltAd) {
		Scanner giris = new Scanner(System.in);
		int indis = ad.indexOf(duzeltAd);
		if(indis>=0) {
			System.out.println("Yeni isim giriniz: ");
			ad.set(indis, giris.next());
			System.out.println("Yeni sms giriniz: ");
			byte smss = giris.nextByte();
			sms.set(indis, smss);
			System.out.println("Yeni internet giriniz: ");
			byte intt = giris.nextByte();
			internet.set(indis, intt);
			System.out.println("Yeni dakika giriniz: ");
			byte dkk = giris.nextByte();
			dk.set(indis, dkk);
			fatura.set(indis,(byte) (dkk*0.5+smss*0.45+intt*10));
			
		}
		
	}

	public static int Toplam(List<String> ad, List<Byte> sms, List<Byte> internet, List<Byte> dk, List<Byte> fatura) {
		int toplam=0;
		for(int i=0; i<ad.size(); i++) {
			toplam =(sms.get(i)*dk.get(i)*internet.get(i)*fatura.get(i));
		}
		return toplam;
	}

	
		
	}


