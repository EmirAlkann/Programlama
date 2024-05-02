package Ornek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kutuphane {
	
	 static List<Kitap> kitapListesi=new ArrayList<Kitap>();
     static Scanner giris = new Scanner(System.in);
     
      private static void KitapEkle() {
		System.out.println("Kitap adı: ");
		String kAdi = giris.next();
		System.out.println("Yazar adı: ");
		String yAdi = giris.next();
		System.out.println("Yayınevi adı: ");
		String yyAdi = giris.next();
		System.out.println("Sayfa sayısı: ");
		int ss= giris.nextInt();
		System.out.println("Fiyat: ");
		int fi= giris.nextInt();
		Kitap eklenecekKitap = new Kitap(kAdi,yAdi,ss,fi,yyAdi);
		kitapListesi.add(eklenecekKitap);
		
	}
      
      private static void Listele() {
		if(kitapListesi.isEmpty()) {
			System.out.println("Kütüphanede hiç kitap yok");
		}else {
			System.out.println("Kütüphanedeki kitaplar\n---------------------------");
			for (Kitap kitap : kitapListesi) {
				System.out.println(kitap.toString());
			}
		}		
	
	}
      private static void KitapArama(String arananKitap) {
		boolean bulundu=false;
		for (Kitap kitap : kitapListesi) {
			if(kitap.getKitapAdi().equalsIgnoreCase(arananKitap)) {
				System.out.println("Bulunan kitap: "+kitap.toString());
				bulundu=true;
			}
		}
		//if(bulundu==false) 
			//System.out.println("Aranan kitap bulunamadı. ");
		if(!bulundu) 
			System.out.println("Aranan kitap bulunamadı. ");
	}
      private static void Duzenle() {
           System.out.println("Düzenlenecek kitap adını giriniz: ");
		String duzenlenecekKitap=giris.next();
		boolean duzenlenen=false;
		for (Kitap kitap : kitapListesi) {
			if(kitap.getKitapAdi().equalsIgnoreCase(duzenlenecekKitap)) {
				System.out.println("Kitap bilgileri: "+kitap);
				System.out.println("Yeni kitap adı: ");
				String ykAdi = giris.next();
				if(ykAdi.isEmpty()) 
					ykAdi=kitap.getKitapAdi();
				kitap.setKitapAdi(ykAdi);
				System.out.println("Yeni yazar adı: ");
				String yzAdi = giris.next();
				if(yzAdi.isEmpty()) 
					yzAdi=kitap.getYazarAdi();
				kitap.setYazarAdi(yzAdi);
				System.out.println("Yeni yayınevi adı: ");
				String yyyAdi = giris.next();
				if(yyyAdi.isEmpty()) 
					yyyAdi=kitap.getYayinEvi();
				kitap.setYayinEvi(yyyAdi);
				System.out.println("Yeni sayfa sayısı: ");
				String yssString=giris.next();
				int yss=kitap.getSayfaSayisi();
				if(!yssString.isEmpty())
					yss=Integer.parseInt(yssString);
			    kitap.setSayfaSayisi(yss);	
				System.out.println("Yeni fiyat: ");
				String yfString=giris.next();
				int yfi=kitap.getFiyat();
				if(!yfString.isEmpty())
					yfi=Integer.parseInt(yfString);
				kitap.setFiyat(yfi);
				duzenlenen=true;
		}
	  }
	  if(!duzenlenen)
		  System.out.println("Düzenlenecek kitap bulunamadı");
	}
      private static void Silme() {
    	  System.out.println("Silinecek kitap adını giriniz: ");
  		String silinecekKitap=giris.next();
  		boolean silinecek=false;
  		for(int i=0; i<kitapListesi.size(); i++) {
  			if(kitapListesi.get(i).getKitapAdi().equalsIgnoreCase(silinecekKitap)) {
  				System.out.println(i+" "+kitapListesi.get(i).toString());
  				silinecek =true;
  			}
  		}//for sonu
  		if(silinecek) {
		System.out.println("Hangi indisteki kitabı sileceksiniz?");
		int indis = giris.nextInt();
		kitapListesi.remove(indis);
  		}else 
  			System.out.println("Silinecek kitap bulunamadı");
	}
      private static void EnKucuk() {
  		int ekFiyat=kitapListesi.get(0).getFiyat();
  		for (Kitap kitap : kitapListesi) {
  			if(kitap.getFiyat()<ekFiyat)
  				ekFiyat+=kitap.getFiyat();
  		}
  		for (Kitap kitap : kitapListesi) {
  			if(kitap.getFiyat()==ekFiyat)
  				System.out.println(kitap.toString());
  		}
  	}

  	private static void Ortalama() {
  		if(kitapListesi.isEmpty()) {
  			System.out.println("Kütüphanede hiç kitap yok");
  		}else {
  		int ssToplam=0;
  		for (Kitap kitap : kitapListesi) {
  			ssToplam+=kitap.getSayfaSayisi();
  		}
  		System.out.println("Sayfa sayısı ortalaması :"+(ssToplam/kitapListesi.size()));
  		}
  	}
	public static void main(String[] args) {
		
		byte menu;
        while(true) {
	    System.out.println("1-Kayıt giriş\n2-Listele\n3-İsim ara\n4-Düzenle\n5-Sil\n6-Ortalama sayfa sayısı\n7-En küçük fiyat\n8-Çıkış");
	    menu = giris.nextByte();
	    switch(menu) {
	    case 1:
	    	KitapEkle();
	    	break;
	    case 2:
	    	Listele();
	    	break;
	    case 3:
	    	System.out.println("Aranacak kitap adı giriniz: ");
	    	String arananKitap = giris.next();
	    	KitapArama(arananKitap);
	    	break;
	    case 4:
	    	Duzenle();
	    	break;
	    case 5:
	    	Silme();
	    	break;
	    case 6:
	    	Ortalama();
	    	break;
	    case 7:
            EnKucuk();
	    	break;
	    case 8:
	    	System.out.println("Program bitti.");
	    	System.exit(0);
	    	break;
	    default:
	    	System.out.println("Yanlış menü değeri");
	    	break;
	    }
}
	}

	
}
