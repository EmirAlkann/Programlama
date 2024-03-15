package hafta5;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		String kisiler[] = {"Ali","Ahmet","Ayşe"};
		String notlar[] = {"Vize","Final","Başarı"};
		byte k= (byte) kisiler.length;
		byte n= (byte) notlar.length;
		int min[] = new int[k];
		int max[] = new int[k];
		int toplam[] = new int[k];
		int basari[] = new int[k];
		int not[][] = new int[k][n];
		for(int i=0; i<k; i++) {
			for(int j=0; j<n; i++) {
				System.out.println(kisiler[i]+" kişisinin "+notlar[j]+" notunu giriniz: ");
				not[i][j] = giris.nextInt();
				
			}
		}
		//not ortalamaları 

	}

}
