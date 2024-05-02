package hafta7;

import java.util.List;
import java.util.Scanner;

public class Fonksiyon {

	public static void main(String[] args) {
		

	}

	public static void menu() {
		System.out.println("1-Kayıt giriş\n"
				+ "2-Listeleme\n"
				+ "3-Çeşit ile arama\n"
				+ "4-Toplam fiyat\n"
				+ "5-Ürün adı ile satış\n"
				+ "6-En düşük miktarlı ürün\n"
				+ "7-Düzeltme\n"
				+ "8-Silme\n"
				+ "9-Çıkış");
		
	}

	public static void veriGiris(List<String> isim, List<Byte> fiyat, List<Byte> miktar, List<String> cesit) {
		Scanner giris = new Scanner(System.in);
		System.out.println("İsim giriniz: ");
		isim.add(giris.next());
		System.out.println("Fiyat giriniz: ");
		fiyat.add(giris.nextByte());
		System.out.println("Miktar giriniz: ");
		miktar.add(giris.nextByte());
		System.out.println("Çeşit giriniz: ");
		cesit.add(giris.next());
		
	}

	public static void Listeleme(List<String> isim, List<Byte> fiyat, List<Byte> miktar, List<String> cesit) {
		for(int i=0; i<isim.size(); i++) {
			System.out.println("İsim giriniz: "+isim.get(i));
			System.out.println("Fiyat giriniz :"+fiyat.get(i));
			System.out.println("Miktar giriniz : "+miktar.get(i));
			System.out.println("Çeşit giriniz : "+cesit.get(i));
		}
		
	}

	public static void cesitArama(List<String> isim, List<Byte> fiyat, List<Byte> miktar, List<String> cesit,String cesitAra) {
		int indis = isim.indexOf(cesitAra);
		if(indis>=0) {
			System.out.println("İsim giriniz: "+isim.get(indis));
			System.out.println("Fiyat giriniz :"+fiyat.get(indis));
			System.out.println("Miktar giriniz : "+miktar.get(indis));
			System.out.println("Çeşit giriniz : "+cesit.get(indis));
		}
		
	}

	public static int toplamFiyat(List<String> isim, List<Byte> fiyat, List<Byte> miktar, List<String> cesit) {
		int toplam=0;
		for(int i=0; i<isim.size(); i++) {			
		toplam=(fiyat.get(i)*miktar.get(i));

				}		
		return toplam;
	}

	public static void urunAdi(List<String> isim, List<Byte> fiyat, List<Byte> miktar, List<String> cesit, String urunAra) {
		int indis = isim.indexOf(urunAra);
		if(indis>=0) {
			System.out.println("İsim giriniz: "+isim.get(indis));
			System.out.println("Fiyat giriniz :"+fiyat.get(indis));
			System.out.println("Miktar giriniz : "+miktar.get(indis));
			System.out.println("Çeşit giriniz : "+cesit.get(indis));
		}
	}

	public static int enD(List<Byte> enDusuk) {
		byte enD=enDusuk.get(0);
		for(int i=0; i<enDusuk.size(); i++) {
			if(enDusuk.get(i)<enD)
				enD=enDusuk.get(i);
		}
		return enD;
	}

	public static void duzeltme(List<String> isim, List<Byte> fiyat, List<Byte> miktar, List<String> cesit,String duzeltAd) {
		int indis =isim.indexOf(duzeltAd);
		if(indis>=0) {
			Scanner giris = new Scanner(System.in);
			System.out.println("Yeni isim giriniz: ");
			isim.set(indis,giris.next());
			System.out.println("Yeni fiyat giriniz: ");
			fiyat.set(indis, giris.nextByte());
			System.out.println("Yeni miktar giriniz: ");
			miktar.set(indis, giris.nextByte());
			System.out.println("Yeni çeşit giriniz: ");
			cesit.set(indis, giris.next());
			
		}
		
	}

	public static void silme(List<String> isim, List<Byte> fiyat, List<String> cesit, List<Byte> miktar, String silinenAd) {
		int indis = isim.indexOf(silinenAd);
		if(indis>=0) {
		   isim.remove(indis);
		   fiyat.remove(indis);
		   miktar.remove(indis);
		   cesit.remove(indis);
		}
		
	}

}
