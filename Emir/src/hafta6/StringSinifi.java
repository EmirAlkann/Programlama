package hafta6;

import java.util.Arrays;

public class StringSinifi {

	public static void main(String[] args) {
		String ad1="Ali",ad2="ali",ad3="Zeynep";
		System.out.println(ad1+ "ad1.compareTo("+ad2+"ad2) :" +ad1.compareTo(ad2));
		System.out.println(ad1+ "ad1.compareTo("+ad3+"ad1) :" +ad1.compareTo(ad3));
		System.out.println(ad3+ "ad1.compareTo("+ad2+"ad3) :" +ad3.compareTo(ad2));
		System.out.println(ad3+ "ad1.compareTo("+ad1+"ad1) :" +ad3.compareTo(ad1));
		System.out.println(ad1+ "ad1.compareTo("+ad1+"ad1) :" +ad1.compareTo(ad1));
		
		
		System.out.println(ad1+ "ad1.compareTo("+ad2+"ad2) :" +ad1.compareToIgnoreCase(ad2));
		System.out.println(ad1+ "ad1.compareTo("+ad3+"ad1) :" +ad1.compareToIgnoreCase(ad3));
		System.out.println(ad3+ "ad1.compareTo("+ad2+"ad3) :" +ad3.compareToIgnoreCase(ad2));
		System.out.println(ad3+ "ad1.compareTo("+ad1+"ad1) :" +ad3.compareToIgnoreCase(ad1));
		System.out.println(ad1+ "ad1.compareTo("+ad1+"ad1) :" +ad1.compareToIgnoreCase(ad1));
		
		
		System.out.println(ad3.toLowerCase());
		System.out.println(ad3.toUpperCase());
		String veri="           Deneme         ";
		System.out.println("|"+veri+"|");
		System.out.println("|"+veri.trim()+"|");
		System.out.println(ad3.charAt(0));
		System.out.println(ad3.charAt(2));
		System.out.println(ad3.codePointAt(0));
		System.out.println(ad3.codePointAt(2));
		System.out.println(ad3.codePointBefore(2));
		System.out.println(ad3.contains("Ze"));
		System.out.println(ad3.contains("eZ"));
		String birlesenIsim=ad1+" "+ad3;
		System.out.println(birlesenIsim);
		String birlesen=ad1.concat(" ");
		System.out.println(birlesen.concat(ad3));
		String isim="Nurşen";
		System.out.println(isim.startsWith("Nu"));
		System.out.println(isim.startsWith("ur"));
		System.out.println(isim.endsWith("en"));
		System.out.println(isim.endsWith("ur"));
		System.out.println(isim.indexOf("e"));
		String sehir ="ankara";
		System.out.println(sehir.indexOf("a"));
		System.out.println(sehir.lastIndexOf("a",1));
		System.out.println(sehir.replace("a", "A"));
		String iller="edirne İstanbul İzmir Ankara Bursa";
		String illerDizi[]=iller.split(" ");
		System.out.println("---------------");
		for(String ilAdi : illerDizi ) {
			System.out.println(ilAdi);
		}
	    System.out.println(iller.length());
	    Arrays.sort(illerDizi);
	    System.out.println("--------------------------");
	    for(String ilAdi : illerDizi) {
	    	System.out.println(ilAdi);
	    }
	    int sayilar[]= {3,66,12,0,-5,24};
	    Arrays.sort(sayilar);
	    System.out.println("--------------------------");
	    for(int i : sayilar) {
	    	System.out.println(i);
	    
	    }
	    System.out.println(isim.isEmpty());
	    String ad5="";
	    System.out.println(ad5.isEmpty());
	}

}
