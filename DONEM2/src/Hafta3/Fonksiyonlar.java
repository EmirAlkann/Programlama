package Hafta3;

import java.util.List;
import java.util.Scanner;

public class Fonksiyonlar {

	public static void KayitEkle(Scanner scanner, List<Ogrenci> ogrenciler) {
		System.out.println("İsim giriniz: ");
		String isim= scanner.next();
		System.out.println("Vize notu giriniz: ");
		int vizeNot = scanner.nextInt();
		System.out.println("Final notu giriniz: ");
		int finalNot = scanner.nextInt();
		Ogrenci ogr=new Ogrenci(isim,vizeNot,finalNot);
		ogrenciler.add(ogr);
		System.out.println(isim+" Kaydını eklediniz");
	}

	public static void Listele(List<Ogrenci> ogrenciler) {
		for (Ogrenci ogrenci : ogrenciler) {
			System.out.println(ogrenci.toString());
		}
		
	}

	public static void AdArama(String arananAd, List<Ogrenci> ogrenciler) {
		for (Ogrenci ogrenci : ogrenciler) {
			if(ogrenci.getAd().equalsIgnoreCase(arananAd)) {
				ogrenci.Yazdir();
			}
		}	
	}

	public static void Ortalama(List<Ogrenci> ogrenciler) {
		int vnt=0,fnt=0,bnt=0;
		for (Ogrenci ogrenci : ogrenciler) {
			vnt+=ogrenci.getVn();
			fnt+=ogrenci.getFn();
			bnt+=ogrenci.getBn();
		}
		System.out.println("Vize not ortlaması: "+vnt/ogrenciler.size());
		System.out.println("Final not ortlaması: "+fnt/ogrenciler.size());
		System.out.println("Başarı not ortlaması: "+bnt/ogrenciler.size());
	}

	

	}


