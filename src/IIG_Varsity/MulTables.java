package IIG_Varsity;

public class MulTables {

	
	public static void main(String[] x) {
		System.out.println();
		for(int h=2; h<=10; h+=5) {
			for(int i=1; i<=10; i++) {
				for(int j=h; j<=(h+4); j++) {
					System.out.print(padL(j,2)+" x "+padL(i,2)+" = "+padL((j*i),3)+"  ");
					if(j>=10) break;
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public static String padL(int n, int len) {
		String retVal = ""+n;
		for(int i=retVal.length(); i<len; i++) {
			retVal = " "+retVal;
		}
		return retVal;
	}
}