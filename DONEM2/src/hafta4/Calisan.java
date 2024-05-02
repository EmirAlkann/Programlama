package hafta4;

public class Calisan extends Kisi {
	
public Calisan(String tcNo, String ad, String soyad, String medeniDurum, int cocukSayisi, double maas) {
		super(tcNo, ad, soyad);
		this.medeniDurum = medeniDurum;
		this.cocukSayisi = cocukSayisi;
		this.brutMaas = brutMaas;
	}
private String medeniDurum; 
private int cocukSayisi;
private double brutMaas;

public String getMedeniDurum() {
	return medeniDurum;
}

public int getCocukSayisi() {
	return cocukSayisi;
}

public double getBrutMaas() {
	return brutMaas;
}
public double getNetMaas() {
	if(medeniDurum.equalsIgnoreCase("evli")) {
		brutMaas+=1000;
	}
	double netMaas = cocukSayisi*500;
	if(netMaas<10000)
		netMaas-=netMaas*0.3;
	else if (netMaas < 20000)
		netMaas -= netMaas*0.2;
	else
		netMaas -= netMaas*0.3;
	return netMaas;
}

@Override
public String toString() {
	return super.toString()+"\t" + medeniDurum + "\t" + cocukSayisi + "\t" + brutMaas;
}
public void Yazdir() {
	super.Yazdir();
	System.out.println("Medeni durum : "+medeniDurum);
	System.out.println("Çocuk sayısı : "+cocukSayisi);
	System.out.println("Net maas: "+getNetMaas());
}
}
