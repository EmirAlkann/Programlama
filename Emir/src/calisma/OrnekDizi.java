package calisma;

import java.util.Scanner;

public class OrnekDizi {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		String kisiler[] = {"Ali","Efe","Ece"};
		String notlar[] = {"Vize ","Final"};
		int sa = kisiler.length;
		int su = notlar.length;
		int toplam[] = new int[sa];
		int min[] = new int[sa];
		int max[] = new int[sa];
		int basari[] = new int[sa];
		int not[][] = new int[sa][su];
		for(int i=0; i<sa; i++) {
			for(int j=0; j<su; j++) {
				System.out.println(kisiler[i]+" kişisinin "+notlar[j]+" notunu gir :");
				not[i][j] =giris.nextInt();
				
			}
		}
		//veri giriş sonu
		for(int i=0; i<sa; i++) {
			for(int j=0; j<su; j++) {
				toplam[i]+=not[i][j];
			}
		}//min
		for(int i=0; i<sa; i++) {
			min[i]=Integer.MAX_VALUE;
			for(int j=0; j<su; j++) {
             if(not[i][j]<min[i])
            	 not[i][j]=min[i];
			}	
			}//max
		for(int i=0; i<sa; i++) {
			max[i] = Integer.MIN_VALUE;
			for(int j=0; j<su;j++) {
				if(not[i][j]>max[i])
					not[i][j]=max[i];
			}		
		}
		System.out.println("Kişiler\t");
		for(int i=0; i<su; su++) {
			System.out.println(notlar[i]+"H\t");
		}
		
	}

}
