package hafta6;

public class Matematikislemler {

	public static void main(String[] args) {
		System.out.println(Math.PI);
        System.out.println("Math.sqrt(25): "+Math.sqrt(25));
        System.out.println("Math.ceil(2.3): "+Math.ceil(2.3));
        System.out.println("Math.floor(2.6): "+Math.floor(2.6));
        System.out.println("Math.round(2.3): "+ Math.round(2.3));
        System.out.println("Math.round(2.7): "+Math.round(2.7));
        System.out.println("Math.min(5, 7): " +Math.min(5, 7));
        System.out.println("Math.max(5, 7): " +Math.max(5, 7));
        
        
        System.out.println("benimCeil(2.3): "+benimCeil(2.3));
        System.out.println("benimFloor(2.6): "+benimFloor(2.6));
        System.out.println("benimRound(2.3): "+benimRound(2.3));
        System.out.println("benimRound(2.7): "+benimRound(2.7));
        System.out.println("benimMin(5, 7): " +benimMin(5, 7));
        System.out.println("benimMax(5, 7): " +benimMax(5, 7));
        
	}

	private static int benimMax(int i, int j) { 
		int max;
		if(i>j) max=i;
		else max=j;
		return max;
			
		
	}

	private static int benimMin(int i, int j) {
			int min;
			if(i<j) min=i;
			else min=j;
		return min;
	}

	private static double benimRound(double d) {
		//double ondalik=d%1;
		double ondalik=d-(int) d;
		int yuvarlanmis;
		if(ondalik>=0.5) 
			yuvarlanmis=(int)++d;				
		else 
			yuvarlanmis=(int)d; 
			
		return yuvarlanmis;
	}

	private static double benimFloor(double d) {

								
		return (int)d;
	}

	private static double benimCeil(double d) {
		
		return (int)++d;
	}
	

}
