package Ornek;

public class Kitap {
    private String kitapAdi;
    private String yazarAdi;
    private int sayfaSayisi;
    private int fiyat;
    private String yayinEvi;
	public Kitap(String kitapAdi, String yazarAdi, int sayfaSayisi, int fiyat, String yayinEvi) {
		super();
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.sayfaSayisi = sayfaSayisi;
		this.fiyat = fiyat;
		this.yayinEvi = yayinEvi;
	}
	public String getKitapAdi() {
		return kitapAdi;
	}
	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}
	public String getYazarAdi() {
		return yazarAdi;
	}
	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}
	public int getSayfaSayisi() {
		return sayfaSayisi;
	}
	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}
	public int getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	public String getYayinEvi() {
		return yayinEvi;
	}
	public void setYayinEvi(String yayinEvi) {
		this.yayinEvi = yayinEvi;
	}
	@Override
	public String toString() {
		return "kitapAdi=" + kitapAdi + ", yazarAdi=" + yazarAdi + ", sayfaSayisi=" + sayfaSayisi + ", fiyat="
				+ fiyat + ", yayinEvi=" + yayinEvi ;
	}
    

	}


