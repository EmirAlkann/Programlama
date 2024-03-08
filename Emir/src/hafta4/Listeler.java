package hafta4;

import java.util.ArrayList;
import java.util.List;

public class Listeler {

	public static void main(String[] args) {
		ArrayList<String> ad=new ArrayList<String>();
        ad.add("Ali");
        ad.add("Veli");
        ad.add("Ayşe");
        ad.add("Fatma");
        ad.add("Ahmet");
        ad.add("Mehmet");
        System.out.println(ad);
        ad.add(3,"Nurşen");
        System.out.println(ad);
        System.out.println("ad listesi boş mu : "+ad.isEmpty());
        ad.set(0,"Zeynep");
        System.out.println(ad);
        System.out.println("liste zeynep ismi içeriyor mu : "+ad.contains("Zeynep"));
        System.out.println("liste zeynep ismi içeriyor mu : "+ad.contains("Merve"));
        System.out.println("ad listesinin uzunluğu :"+ad.size());
        System.out.println("Ayşenin indis değeri : "+ad.indexOf("Ayşe"));
        System.out.println("Cemalin indis değeri: "+ad.indexOf("Cemal"));
        List<Integer> sayilar=new ArrayList<Integer>();
        sayilar.add(5);
        sayilar.add(0);
        System.out.println(sayilar);
       /* System.out.println(ad.get(1));
        for(int i=0; i<ad.size(); i++) {
        	System.out.println(i+". ad : "+ad.get(1));
        }
        String silinen=ad.remove(0);
        System.out.println(silinen);
        System.out.println(ad);
        String silinen1=ad.removeFirst();
        System.out.println(silinen1);
        System.out.println(ad);
        String silinen2=ad.removeLast();
        System.out.println(silinen2);
        System.out.println(ad);
        boolean silinen3.ad.remove("Fatma");
        System.out.println(silinen3);
        System.out.println(ad);
        ad.clear();
        System.out.println(ad);*/
        
	}

}
