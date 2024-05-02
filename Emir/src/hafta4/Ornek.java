package hafta4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ornek {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		List<String> isim=new ArrayList<String>();
        List <Byte> vNot = new ArrayList<Byte>();
        List <Byte> fNot = new ArrayList<Byte>();
        List <Byte> bNot = new ArrayList<Byte>();
        byte menu;
        for(;;) {
        	Fonksiyonlar.Menu();
        	menu = giris.nextByte();
        	switch (menu) {
        	case 1:
        		Fonksiyonlar.veriGiris(isim, vNot, fNot, bNot);
        		break;
        	case 2:
        		Fonksiyonlar.Listele(isim, vNot, fNot, bNot);
        		break;
        	case 3:
        		System.out.println("Vize not ortalaması: "+Fonksiyonlar.Ortalama(vNot));
        		System.out.println("Final not ortalaması: "+Fonksiyonlar.Ortalama(fNot));
        		System.out.println("Başarı not ortalaması: "+Fonksiyonlar.Ortalama(bNot));	
        		break;
        	case 4:
        		System.out.println("Vize not en küçüğü: "+Fonksiyonlar.EnKucuk(vNot));
        		System.out.println("Final not en küçüğü: "+Fonksiyonlar.EnKucuk(fNot));
        		System.out.println("Başarı not en küçüğü: "+Fonksiyonlar.EnKucuk(bNot));
        		break;
        	case 5:
        		System.out.println("Vize not en büyüğü: "+Fonksiyonlar.EnBuyuk(vNot));
        		System.out.println("Final not en büyüğü: "+Fonksiyonlar.EnBuyuk(fNot));
        		System.out.println("Başarı not en büyüğü: "+Fonksiyonlar.EnBuyuk(bNot));
        		break;
        	case 6:
        		System.out.println("Aranacak adı giriniz: ");
        		String arananAd=giris.next();
        		Fonksiyonlar.IsimArama(isim, vNot,fNot,bNot,arananAd);
        		
        	case 7:
        		System.out.println("Silinecek ad giriniz: ");
        		String silinenAd=giris.next();
        		Fonksiyonlar.IsımSilme(isim, vNot,fNot,bNot,silinenAd);
        		
        	case 8:
        		System.out.println("Düzeltilecek adı giriniz: ");
        		String duzeltAd=giris.next();
        		Fonksiyonlar.IsimDuzeltme(isim,vNot,fNot,bNot,duzeltAd);
        	case 9:
        		System.out.println("Çıkış yapılıyor..");
        		System.exit(0);
        		break;
        	default:
        		System.out.println("Yanlış menü değeri");
        	}
        }
	}

}
