package hafta4;

import java.util.List;
import java.util.Scanner;

public class Fonksiyonlar {

	public static void main(String[] args) {
		

	}

	public static void Menu() {
		System.out.println("1.Veri girişi\n"
				+ "2.Listeleme\n"
				+ "3.Ortalama\n"
				+ "4.En büyük değer\n"
				+ "5.En küçük değer\n"
				+ "6.Ad arama\n"
				+ "7.İsim silme\n"
				+ "8.İsim Düzeltme\n"
				+ "9.Çıkış");
		
	}

	public static void veriGiris(List<String> isim, List<Byte> vNot, List<Byte> fNot, List<Byte> bNot) {
		Scanner giris = new Scanner(System.in);
		System.out.print("İsim giriniz: ");
		isim.add(giris.next());
		System.out.println("Vize notu: ");
		byte vn=giris.nextByte();
		vNot.add(vn);
		System.out.println("Final notu: ");
		byte fn=giris.nextByte();
		fNot.add(fn);
		bNot.add((byte) (vn*0.4+fn*0.6));
		
	}

	public static void Listele(List<String> isim, List<Byte> vNot, List<Byte> fNot, List<Byte> bNot) {
		for(int i= 0; i<isim.size(); i++) {
			System.out.println("İsim: "+isim.get(i));
			System.out.println("Vize notu: "+vNot.get(i));
			System.out.println("Final notu: "+fNot.get(i));
			System.out.println("Başarı notu: "+bNot.get(i));
			System.out.println("-----------------------------------------------------------");

		}
		
	}

	public static byte EnKucuk(List<Byte> sinavNot) {
		byte enk=sinavNot.get(0);
		for(int i=1; i < sinavNot.size(); i++) {
			if(sinavNot.get(i)<enk) 
				enk = sinavNot.get(i);
		
		}
		return enk;
	}

	public static byte Ortalama(List<Byte> sinavNot) {
		int toplam=0;
		for(Byte sn : sinavNot) {
			toplam +=sn;
		}
		return (byte) (toplam/sinavNot.size());
	}

	public static byte EnBuyuk(List<Byte> sinavNot) {
		byte enb=sinavNot.get(0);
		for(int i=1; i < sinavNot.size(); i++) {
			if(sinavNot.get(i)>enb) 
				enb = sinavNot.get(i);
		}
		return enb;
	}

	public static void IsimArama(List<String> isim, List<Byte> vNot, List<Byte> fNot, List<Byte> bNot,
			String arananAd) {
		int indis= isim.indexOf(arananAd);
		if(indis>=0) {
			System.out.println("İsim: "+isim.get(indis));
			System.out.println("Vize notu: "+vNot.get(indis));
			System.out.println("Final notu: "+fNot.get(indis));
			System.out.println("Başarı notu: "+bNot.get(indis));
			System.out.println("-----------------------------------------------------------");
		}
		else
		System.out.println("Aranan isim listede yok");
		
	}

	public static void IsımSilme(List<String> isim, List<Byte> vNot, List<Byte> fNot, List<Byte> bNot,
			String silinenAd) {
		int indis= isim.indexOf(silinenAd);
		if(indis>=0) {
			isim.remove(indis);
			vNot.remove(indis);
			fNot.remove(indis);
			bNot.remove(indis);
		}
		else
		System.out.println("Aranan isim listede yok");
		
	}

	public static void IsimDuzeltme(List<String> isim, List<Byte> vNot, List<Byte> fNot, List<Byte> bNot,
			String duzeltAd) {
		int indis= isim.indexOf(duzeltAd);
		if(indis>=0) {
			Scanner giris = new Scanner(System.in);
			System.out.print("Yeni isim giriniz: ");
			isim.set(indis,giris.next());
			System.out.println("Yeni vize notu: ");
			byte vn=giris.nextByte();
			vNot.set(indis,vn);
			System.out.println("Yeni final notu: ");
			byte fn=giris.nextByte();
			fNot.set(indis,fn);
			bNot.set(indis,(byte) (vn*0.4+fn*0.6));
		
	}
		else
			System.out.println("Düzeltilecek isim listede yok");

}
}
