package hafta4;

public class Ogrenci extends Kisi{
       

private int vizeNotu;
private int finalNotu;

public Ogrenci(String tcNo, String ad, String soyad,int vizeNotu, int finalNotu) {
		super(tcNo, ad, soyad);
		this.vizeNotu=vizeNotu;
		this.finalNotu=finalNotu;
	}

public int getVizeNotu() {
	return vizeNotu;
}

public void setVizeNotu(int vizeNotu) {
	this.vizeNotu = vizeNotu;
}

public int getFinalNotu() {
	return finalNotu;
}

public void setFinalNotu(int finalNotu) {
	this.finalNotu = finalNotu;
}

@Override
public String toString() {
	return super.toString()+"\t" + vizeNotu + "\t" + finalNotu +"\t"+BasariNotHesapla();
}
public void Yazdir() {
	super.Yazdir();
	System.out.println("Vize notu : "+this.vizeNotu);
	System.out.println("Final notu : "+this.finalNotu);
	System.out.println("Başarı notu : "+this.BasariNotHesapla());
}
public int BasariNotHesapla() {
	return (int) (this.vizeNotu*0.4+this.finalNotu*0.6);
}
	}


