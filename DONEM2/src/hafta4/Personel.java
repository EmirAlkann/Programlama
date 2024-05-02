package hafta4;

public class Personel extends Kisi {
private int cocukSayisi;
private int burutMaas;
private String medeniDurum;

public Personel(String tcNo, String ad, String soyad, int cocukSayisi, int burutMaas, String medeniDurum) {
	super(tcNo, ad, soyad);
	this.cocukSayisi = cocukSayisi;
	this.burutMaas = burutMaas;
	this.medeniDurum = medeniDurum;

}
public int getCocukSayisi() {
	return cocukSayisi;
}
public void setCocukSayisi(int cocukSayisi) {
	this.cocukSayisi = cocukSayisi;
}
public int getBurutMaas() {
	return burutMaas;
}
public void setBurutMaas(int burutMaas) {
	this.burutMaas = burutMaas;
}
public String getMedeniDurum() {
	return medeniDurum;
}
public void setMedeniDurum(String medeniDurum) {
	this.medeniDurum = medeniDurum;
}

@Override
public String toString() {
	return cocukSayisi + "\t" + burutMaas + "\t" + medeniDurum
			+ "\t" + NetMaasHesapla();
}
public void Yazdir() {
	System.out.println("Çocuk sayısısı: "+this.cocukSayisi);
	System.out.println("Medeni durum: "+this.medeniDurum);
	System.out.println("Brüt maaş: "+this.burutMaas);
	System.out.println("Net maaş: "+this.NetMaasHesapla());
}
public int NetMaasHesapla() {
	return this.cocukSayisi*250+burutMaas;
}
}
