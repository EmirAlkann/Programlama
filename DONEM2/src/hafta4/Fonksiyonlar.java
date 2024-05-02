package hafta4;

import java.util.ArrayList;
import java.util.Scanner;

public class Fonksiyonlar {

	public static void main(String[] args) {
		

	}

	public static void KisiEkle(Scanner giris, ArrayList<Kisi> kisiListesi) {
		System.out.println("Tc no giriniz: ");
		String tc=giris.next();
		System.out.println("İsim giriniz: ");
		String ad= giris.next();
		System.out.println("Soyad giriniz: ");
		String soyad=giris.next();
		Kisi kisi = new Kisi(tc,ad,soyad);
		kisiListesi.add(kisi);
		System.out.println(ad+" Kaydı yapıldı");
	}

	public static void OgrenciEkle(Scanner giris, ArrayList<Ogrenci> ogrenciListesi) {
		System.out.print("Tc no giriniz: ");
		String tc=giris.next();
		System.out.print("İsim giriniz: ");
		String ad= giris.next();
		System.out.print("Soyad giriniz: ");
		String soyad=giris.next();
		System.out.print("Vize notu giriniz : ");
		int vn=giris.nextInt();
		System.out.println("Final notu giriniz: ");
		int fn=giris.nextInt();
		Ogrenci ogrenci = new Ogrenci(tc,ad,soyad,vn,fn);
		ogrenciListesi.add(ogrenci);
		System.out.println(ad+" Kaydı yapıldı");
	}

	public static void KisiListele(ArrayList<Kisi> kisiListesi) {
		if(kisiListesi.isEmpty()) {
			System.out.println("Kişi listesi boş");
			return;
		}
		System.out.println("tc\tAd\tSoyad");
		for (Kisi kisi : kisiListesi) {
			System.out.println(kisi);
		}
	}

	public static void OgrenciListele(ArrayList<Ogrenci> ogrenciListesi) {
		if(ogrenciListesi.isEmpty()) {
			System.out.println("Kişi listesi boş");
			return;
		}
		System.out.println("tc\tAd\tSoyad\tvn\tfn");
		for (Ogrenci ogrenci : ogrenciListesi) {
			System.out.println(ogrenci);
		}
		
	}

	public static void KisiAra(Scanner giris, ArrayList<Kisi> kisiListesi) {
		if(kisiListesi.isEmpty()) {
			System.out.println("Kişi listesi boş");
			return;
		}
		boolean yokmu =true;
		System.out.println("Aranacak tc no giriniz: ");
		String tcAra=giris.next();
		for (Kisi kisi : kisiListesi) {
			if(kisi.getTcNo().equalsIgnoreCase(tcAra));{
				kisi.Yazdir();
				yokmu =false;
			}
		}
		if(yokmu==true) {
			System.out.println("Aranan kayıt listede yok");
		}
	}

	public static void OgrenciAra(Scanner giris, ArrayList<Ogrenci> ogrenciListesi) {
		if(ogrenciListesi.isEmpty()) {
			System.out.println("Kişi listesi boş");
			return;
		}
		boolean yokmu = true;
		System.out.println("Aranan Öğrenci Adı : ");
		String adAra = giris.next();
		for (Ogrenci ogrenci : ogrenciListesi) {
			if(ogrenci.getAd().equalsIgnoreCase(adAra));
			ogrenci.Yazdir();
			yokmu= false;
		}
		if(yokmu)
			System.out.println("Aranan kayıt listede yok");
	}

	public static void Enb(ArrayList<Ogrenci> ogrenciListesi) {
		if(ogrenciListesi.isEmpty()) {
			System.out.println("Kişi listesi boş");
			return;
		}
		int enb=ogrenciListesi.get(0).getVizeNotu();
		for (Ogrenci ogrenci : ogrenciListesi) {
			if(ogrenci.getVizeNotu()>enb) {
				enb=ogrenci.getVizeNotu();
			}
		}
		for (Ogrenci ogrenci : ogrenciListesi) {
			if(ogrenci.getVizeNotu()==enb) {
				ogrenci.Yazdir();
			}
		}
	}

	public static void PersonelEkle(Scanner giris, ArrayList<Personel> personelListesi) {
		System.out.println("Personel Tc no giriniz: ");
		String tc = giris.next();
		System.out.println("Personel ad giriniz: ");
		String ad = giris.next();
		System.out.println("Personel soyad giriniz: ");
		String soyad = giris.next();
		System.out.println("Personel çocuk sayısı giriniz: ");
		int cocuks = giris.nextInt();
		System.out.println("Personel bürüt maaş giriniz :");
		int bMaas = giris.nextInt();
		System.out.println("Personel medeni durum giriniz: ");
		String medeni = giris.next();
		Personel personel = new Personel(tc,ad,soyad,cocuks,bMaas,medeni);
		personelListesi.add(personel);
		System.out.println(ad+" Kaydı yapıldı");
		
	}

	public static void PersonelListele(Scanner giris, ArrayList<Personel> personelListesi) {
		if(personelListesi.isEmpty()) {
			System.out.println("Personel listesi boş");
			return;
		}
		System.out.println("Tc\tAd\tSoyad\tÇocukSayısı\tBütürMaaş\tMedeniDurum");
		for (Personel personel : personelListesi) {
			System.out.println(personel);
		}
	}

	public static void EnbMaas(ArrayList<Personel> personelListesi) {
		if(personelListesi.isEmpty()) {
			System.out.println("Personel listesi boş");
			return;
		}
		int enb = personelListesi.get(0).getBurutMaas();
		for (Personel personel : personelListesi) {
			if(personel.getBurutMaas()>enb) {
				enb=personel.getBurutMaas();
			}	
		}
		for (Personel personel : personelListesi) {
			if(personel.getBurutMaas()==enb) {
				personel.Yazdir();
			}
		}
	}

	public static void CalisanEkle(Scanner giris, ArrayList<Kisi> kisiListesi) {
		System.out.println("Tc no giriniz: ");
		String tc=giris.next();
		while(!tc.matches("\\d+")) {
			System.out.println("Tc kimlik boş ya da sayı dışında olamaz tekrar girin");
			tc = giris.next();
		}
		System.out.println("İsim giriniz: ");
		String ad= giris.next();
		System.out.println("Soyad giriniz: ");
		String soyad=giris.next();
		System.out.println("Çalışan mısınız ? (E/H): ");
		String calisanKontrol = giris.next();
		if(calisanKontrol.equalsIgnoreCase("e")) {
			System.out.println("Medeni durumu giriniz: ");
			String mDurum = giris.next();
			System.out.println("Çocuk sayısı giriniz: ");
			int cSayisi = giris.nextInt();
			System.out.println("Bürüt maaş giriniz: ");
			double bMaas=giris.nextDouble();
			Calisan calisan = new Calisan(tc,ad,soyad,mDurum,cSayisi,bMaas);
			System.out.println(ad+" Çalışan kaydını giriniz");
			kisiListesi.add(calisan);
		}else if(calisanKontrol.equalsIgnoreCase("h")) {
				Kisi kisi = new Kisi(tc,ad,soyad);
				System.out.println(ad+" Kişi kaydını giriniz");
				kisiListesi.add(kisi);
		}else {
			System.out.println("Yanlış değer girdiniz.");
		}
		}
	

	public static void CalisanListele(ArrayList<Kisi> kisiListesi) {
		System.out.println("Kişi listesi");
		if(kisiListesi.isEmpty()) {
			System.out.println("Kişi listesi boş");
			return;
		}
		for (Kisi kisi : kisiListesi) {
			System.out.println(kisi);
		}
	}

	public static void CalisanAra(Scanner scanner, ArrayList<Kisi> kisiListesi) {
		if(kisiListesi.isEmpty()) {
			System.out.println("Kişi listesi boş");
			return;
		}
		System.out.println("Aranacak kişinin tcsini giriniz: ");
		String arananTcNo = scanner.next();
		while(!arananTcNo.matches("\\d+")) {
			System.out.println("Tc kimlik no sayı dışında olamaz tekrar girin");
			arananTcNo = scanner.next();
		}
		for (Kisi kisi : kisiListesi) {
			if(kisi.getTcNo().equalsIgnoreCase(arananTcNo)) {
				kisi.Yazdir();
				return;
			}
		}
		System.out.println("Aranan kişi bulunamadı");
	}

	public static void Maas(ArrayList<Kisi> kisiListesi) {
		System.out.println("\nMaaş Görüntüleme");
		System.out.println("Kişi listesi");
		if(kisiListesi.isEmpty()) {
			System.out.println("Kişi listesi boş");
			return;
		}
		for (Kisi kisi : kisiListesi) {
			if(kisi instanceof Calisan) {
				kisi.Yazdir();
			}
		}
	}

	public static void Kisi1Listele(ArrayList<Kisi> kisiListesi) {
		System.out.println("Sadece Kişileri Görüntüler");
		for (Kisi kisi : kisiListesi) {
			if(kisi instanceof Calisan) {
				kisi.Yazdir();
			}
		}
	}
	
}
