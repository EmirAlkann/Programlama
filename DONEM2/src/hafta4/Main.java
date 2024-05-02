package hafta4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		ArrayList<Kisi> kisiListesi = new ArrayList<Kisi>();
		ArrayList<Ogrenci> ogrenciListesi = new ArrayList<Ogrenci>();
		ArrayList<Personel> personelListesi = new ArrayList<Personel>();
		byte menu;
		while(true) {
			System.out.println("0-Çıkış\n1-Kisi Kayıt\n2-Ogrenci Kayıt\n3-Kişi Listele\n4-Öğrenci Listele");
			System.out.println("5-Kişi Ara\n6-Öğrenci Ara\n7-En büyük vize\n8-Personel Kayıt\n9-Personel Listele\n10-En fazla brüt maaş : ");
			menu=giris.nextByte();
			switch(menu) {
			case 0:
				System.out.println("Program bitti");
				System.exit(0);
				break;
			case 1:
				Fonksiyonlar.KisiEkle(giris,kisiListesi);
				break;
			case 2:
				Fonksiyonlar.OgrenciEkle(giris,ogrenciListesi);
				break;
			case 3:
				Fonksiyonlar.KisiListele(kisiListesi);
				break;
			case 4:
				Fonksiyonlar.OgrenciListele(ogrenciListesi);
				break;
			case 5:
				Fonksiyonlar.KisiAra(giris,kisiListesi);
				break;
			case 6:
				Fonksiyonlar.OgrenciAra(giris,ogrenciListesi);
				break;
			case 7:
				Fonksiyonlar.Enb(ogrenciListesi);
				break;
			case 8:
				Fonksiyonlar.PersonelEkle(giris,personelListesi);
				break;
			case 9:
				Fonksiyonlar.PersonelListele(giris,personelListesi);
				break;
			case 10:
				Fonksiyonlar.EnbMaas(personelListesi);
				break;
			default:
				System.out.println("Yanlış menü değeri");
				break;
			}
		}

	}

}
