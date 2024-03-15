package hafta5;

import java.util.Scanner;

public class HarcamaMaasOrnek {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		String kisiler[] = {"Ali" ,"Ayşe","Fatma"};
        String aylar[] = {"Ocak", "Şubat" ,"Mart"};
        byte k=(byte)kisiler.length;
        byte a=(byte)aylar.length;
        int ort[]= new int[k];
        int min[]=new int[k];
        int max[]=new int[k];
        int hrcort[]=new int[k];
        int hrcmin[]=new int[k];
        int hrcmax[]=new int[k];
        int maas[][]=new int[k][a];
        int harcama[][]= new int[k][a];
        for(int i=0; i<k; i++) {
        	for(int j=0; j<a; j++) {
        		System.out.println(kisiler[i]+" kişisinin "+aylar[j]+" ayındaki maaşını gir: ");
        		maas[i][j] = giris.nextInt();
        		System.out.println(kisiler[i]+" kişisinin "+aylar[j]+" ayındaki harcamasını gir:");
        		harcama[i][j] = giris.nextInt();
        		
        	}
        }
        //maas ortalama
        for(int i=0; i<k; i++) {
        	for(int j=0; j<a; j++) {
        		ort[i]+=maas[i][j];       		
        	}
        }
        //harcama ortalama
        for(int i=0; i<k; i++) {
        	for(int j=0; j<a; j++) {
        		hrcort[i]+=harcama[i][j];       		
        	}
        }
        //maas max
        for(int i=0; i<k; i++) {
        	max[i]=Integer.MIN_VALUE;
        for(int j=0; j<a; j++) {
        	if(maas[i][j]>max[i])
        		max[i]=maas[i][j];
        }
        }
        
      //maas min
        for(int i=0; i<k; i++) {
        	min[i]=Integer.MAX_VALUE;
        for(int j=0; j<a; j++) {
        	if(maas[i][j]<min[i])
        		min[i]=maas[i][j];
	}
    }
        //harcama max
        for(int i=0; i<k; i++) {
        	hrcmax[i]=Integer.MIN_VALUE;
        for(int j=0; j<a; j++) {
        	if(harcama[i][j]>hrcmax[i])
        		hrcmax[i]=harcama[i][j];
        }
       }
        //harcama min
        for(int i=0; i<k; i++) {
        	hrcmin[i]=Integer.MAX_VALUE;
        for(int j=0; j<a; j++) {
        	if(harcama[i][j]<hrcmin[i])
        		hrcmin[i]=harcama[i][j];
	}
    }
        //maas tablosu
        System.out.print("Kişiler\t");
        for(int i=0; i<a; i++) {
        	System.out.print(aylar[i]+"\t");
        }
        System.out.println("ort\tMin\tMax");
        for(int i=0; i<k; i++) {
        	System.out.print(kisiler[i]+"\t");
        	for(int j=0; j<a; j++) {
        		System.out.print(maas[i][j]+"\t");
        	}
        	System.out.print(ort[i]/a+"\t"+min[i]+"\t"+max[i]);
        }
        //harcama tablosu
        System.out.print("Kişiler\t");
        for(int i=0; i<a; i++) {
        	System.out.print(aylar[i]+"H\t");
        }
        System.out.println("ortH\tMinH\tMaxH");
        for(int i=0; i<k; i++) {
        	System.out.print(kisiler[i]+"\t");
        for(int j=0; j<a; j++) {
        	System.out.print(harcama[i][j]+"\t");
        }
        System.out.println(hrcort[i]/a+"\t"+hrcmin[i]+"\t"+hrcmax[i]);
        }
        
}
}