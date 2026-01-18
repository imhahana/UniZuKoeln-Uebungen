package hausaufgabe3;

public class If_Else {
	public static void main (String[] args) {
		
		int i, j, k;
		i = -3;
		j = 10;
		k = 100;
		
		if (i > j  &&  i > 200  &&  j > 100) {
			k = 3;
			
		} else if (i > 200  &&  j > 100) {
			k = -10;
			
		} else if (i > j  &&  i > 200) {
			k = 2;
			
		} else if (i > j) {
			k = 1;
			
		} else if (i > 200) {
			k = -10;
			
		} else if (j > 100) {
			k = -10;
			
		} else {
			k = 4;
		}
		
		System.out.println(k);
	}

}
