package emir;

import java.util.Scanner;

public class SatisMiktari {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		String iller[] = {"Edirne  ","İstanbul","Ankara  ","Çanakkale"};
		String aylar[] = {"Ocak" , "Şubat"};
		int sa=iller.length;
		int su=aylar.length;
		int toplam[] = new int[sa];
		int min[] = new int[sa];
		int max[] = new int[sa];
		int sm[][] = new int[sa][su];
		for(int i=0; i<sa; i++) {
			for(int j=0; j<su; j++) {
				System.out.print(iller[i]+" İlinin "+aylar[j]+" satışı gir: ");
			 sm[i][j]=giris.nextInt();
			}
		}//veri girişi sonu
		for(int i=0; i<sa; i++) {
			for(int j=0; j<su;j++) {
				toplam[i]+=sm[i][j];
			}
		}
		for(int i=0; i<sa;i++) {
			//max[i]=sm[i][0];
			//min[i]=sm[i][0];
			max[0] = Integer.MIN_VALUE;
			min[0] = Integer.MAX_VALUE;
			for(int j=0; j<su; j++) {
				if(sm[i][j] > max[i])
					max[i] = sm[i][j];
				if(sm[i][j] < max[i])
					min[i] = sm[i][j];
			}
		}
		int gtop=0,gmin=Integer.MAX_VALUE,gmax=Integer.MIN_VALUE;
		for(int i=0; i<sa;i++) {
			for(int j = 0; j< su; j++) {
				gtop+=sm[i][j];
				if(sm[i][j]>gmax)
					gmax=sm[i][j];	
				if(sm[i][j]<gmin)
					gmin=sm[i][j];
			}
		}
		
		for(int i=0; i<sa; i++)
        System.out.print("İller   \t");
        for(int i=0; i<su; i++) {
        	System.out.print(aylar[i]+"\t");    	
        }
        System.out.println("Toplam\tort\tMin\tMax");
        for(int i=0; i<sa; i++) {
        	System.out.print(iller[i]+"\t");
        	for(int j=0; j<su; j++) {
        		System.out.print(sm[i][j]+"\t");
        	}
        	System.out.println(toplam[i]+"\t"+(toplam[i]/su) + "\t" +min[i] + "\t" + max[i]);
        }
		System.out.println("Genel orltalama ="+(gtop/(sa*su)));
		System.out.println("Minimum: "+gmin);
	}

}
