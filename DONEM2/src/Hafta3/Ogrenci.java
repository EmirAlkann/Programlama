package Hafta3;

public class Ogrenci {	
		private String ad;
		private int vn;
		private int fn;
		private int bn;
		public Ogrenci(String ad, int i, int j) {
			super();
			//System.out.println("Verili kurucu fonksiyon");
			this.ad = ad;
			this.vn = i;
			this.fn = j;
			basariHesap();
		}
		
		public String getAd() {
			return ad;
		}

		public void setAd(String ad) {
			this.ad = ad;
		}

		public int getVn() {
			return vn;
		}

		public void setVn(int vn) {
			this.vn = vn;
		}

		public int getFn() {
			return fn;
		}

		public void setFn(int fn) {
			this.fn = fn;
		}

		public int getBn() {
			return bn;
		}

		public void setBn(int bn) {
			this.bn = bn;
		}

		private void basariHesap() {
			this.bn=(int) (this.vn*0.4+this.fn*0.6);
			
		}
		public Ogrenci() {
			System.out.println("Boş kurucu fonksiyon");
		}
        public void Yazdir() {
        	System.out.println("Öğrenci adı: "+this.ad);
			System.out.println("Vize Notu: "+this.vn);
			System.out.println("Final Notu: "+this.fn);
			System.out.println("Başarı Notu: "+this.bn);
			System.out.println("-------------------------------");
        }
		@Override
		public String toString() {
			String donen="ad : " + ad + ", \tvn : " + vn + ", \tfn : " + fn + ", \tbn : " + bn ;
			return donen;
		}
        
	}


