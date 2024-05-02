package Hafta3;

public class Calisan {

	public static void main(String[] args) {
		Ogrenci ogr1=new Ogrenci();//sınıftna nesne üretti
		ogr1.setAd("Ali");
		System.out.println(ogr1.getAd());
		ogr1.setVn(45);
		ogr1.setFn(65);
		ogr1.setBn((byte) (ogr1.getVn()*0.4+ogr1.getFn()*0.6));
		/*System.out.println("Vize Notu: "+ogr1.vn);
		System.out.println("Final Notu: "+ogr1.fn);
		System.out.println("Başarı Notu: "+ogr1.bn);*/
		ogr1.Yazdir();
		System.out.println("---------------------------------------------------");
		
			Ogrenci ogr2=new Ogrenci("Ayşe",50,60);
			/*System.out.println("Öğrenci adı: "+ogr2.ad);
			System.out.println("Vize Notu: "+ogr2.vn);
			System.out.println("Final Notu: "+ogr2.fn);
			System.out.println("Başarı Notu: "+ogr2.bn);*/
		     ogr2.Yazdir();
		     System.out.println("---------------------------------------------------");
		     System.out.println(ogr2.toString());
	}

}
