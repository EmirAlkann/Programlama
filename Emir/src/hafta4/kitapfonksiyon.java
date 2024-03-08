package hafta4;

import java.util.List;
import java.util.Scanner;

public class kitapfonksiyon {

	public static void main(String[] args) {
		

	}

	public static void Menu() {
		System.out.println("1.Veri girişi\n"
				+ "2.Listleme\n"
				+ "3.Ortalama\n"
				+ "4.En küçük değer\n"
				+ "5.En büyük değer\n"
				+ "6.Aranacak ad\n"
				+ "7.Silinecek ad\n"
				+ "8.Düzeltilecek ad\n"
				+ "Çıkış");
		
	}

	public static void veriGiris(List<String> ad, List<Byte> sayfas, List<Byte> tarih, List<Byte> fiyat, List<String> yazar, List<String> tur) {
		Scanner giris = new Scanner (System.in);
		System.out.println("Kitap adı giriniz:  ");
		ad.add(giris.next());
		System.out.println("Sayfa sayısı giriniz: ");
		sayfas.add((byte) giris.nextInt());
		System.out.println("Tarih giriniz: ");
		tarih.add((byte) giris.nextInt());
		System.out.println("Fiyat giriniz: ");
		fiyat.add((byte) giris.nextInt());
		System.out.println("Yazar adı giriniz: ");
		yazar.add(giris.next());
		System.out.println("Kitap türü giriniz");
		tur.add(giris.next());
		
	}

	public static void Listeleme(List<String> ad, List<Byte> sayfas, List<Byte> tarih, List<Byte> fiyat, List<String> yazar, List<String> tur) {
		for(int i=0; i<ad.size(); i++) {
			System.out.println("Kitap adı: "+ad.get(i));
			System.out.println("Sayfa sayısı: "+sayfas.get(i));
			System.out.println("Tarih: "+tarih.get(i));
			System.out.println("Fiyat: "+fiyat.get(i));
			System.out.println("Yazar: "+yazar.get(i));
			System.out.println("Tür: "+tur.get(i));
		}
		
	}

	public static byte Ortalama(List<Byte> kitap) {
		byte toplam=0;
		for(Byte or : kitap) {
			toplam+=or;
		}
		return (byte) (toplam/kitap.size());
	}

	public static byte enk(List<Byte> kitap) {
		byte enk=kitap.get(0);
		for(int i=0; i<kitap.size(); i++) {
			if(kitap.get(i)<enk)
				enk=kitap.get(i);
		}
		return enk;
	}

	public static byte enb(List <Byte> kitap) {
		byte enb=kitap.get(0);
		for(int i=0; i<kitap.size(); i++) {
			if(kitap.get(i)>enb)
				enb=kitap.get(i);
		}
		return enb;
	}

	public static void arananAd(List<String> ad, List<Byte> sayfas, List<Byte> tarih, List<Byte> fiyat,
			List<String> yazar, List<String> tur, String arananAd) {
		int indis = ad.indexOf(arananAd);
		if(indis>=0) {
			System.out.println("Kitap adı: "+ad.get(indis));
			System.out.println("Sayfa sayısı: "+sayfas.get(indis));
			System.out.println("Tarih: "+tarih.get(indis));
			System.out.println("Fiyat: "+fiyat.get(indis));
			System.out.println("Yazar: "+yazar.get(indis));
			System.out.println("Tür: "+tur.get(indis));
		}
		else
			System.out.println("Aradığınız ad listede yok");
		
	}

	public static void silAd(List<String> ad, List<Byte> sayfas, List<Byte> tarih, List<Byte> fiyat, List<String> yazar,
			List<String> tur, String silinenAd) {
	int indis = ad.indexOf(silinenAd);
	if(indis>=0) {
		ad.remove(indis);
		sayfas.remove(indis);
		tarih.remove(indis);
		fiyat.remove(indis);
		yazar.remove(indis);
		tur.remove(indis);
	}
	else
		System.out.println("Yanlış isim  seçimi");
	}

	public static void duzelt(List<String> ad, List<Byte> sayfas, List<Byte> tarih, List<Byte> fiyat,
			List<String> yazar, List<String> tur, String duzeltAd) {
		int indis =ad.indexOf(duzeltAd);
		if(indis>=0) {
			Scanner giris = new Scanner(System.in);
			System.out.println("Yeni isim giriniz: ");
			ad.set(indis,giris.next());
			System.out.println("Yeni sayfa sayısı giriniz: ");
			sayfas.set(indis,giris.nextByte());
			System.out.println("Yeni tarih giriniz: ");
			tarih.set(indis, giris.nextByte());
			System.out.println("Yeni fiyat giriniz: ");
			fiyat.set(indis,giris.nextByte());
			System.out.println("Yeni yazar giriniz: ");
			yazar.set(indis,giris.next());
			System.out.println("Yeni tür giriniz: ");
			tur.set(indis,giris.next());
			
			
			
		}
		
	}

}
