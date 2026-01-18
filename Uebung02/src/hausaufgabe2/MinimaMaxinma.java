package hausaufgabe2;

public class MinimaMaxinma {

	public static void main(String[] args) {
		
		int i = -1;
		int j = -2;
		int k = -3;
		
		int min = 0;
		int max = -2;
		
	//Find Maxima
		if (i > j  &&  i > k) {
			max = i;
			
		} else if (j > k  &&  j > i) {
			max = j;
			
		} else {
			max = k;
		}
		System.out.println("max = " + max);
		
	System.out.println();
	
	//Find Minima
		if (i < j  &&  i < k) {
			min = i;
			
		} else if (j < k  &&  j < i) {
			min = j;
			
		} else {
			min = k;
		}
		System.out.println("min = " + min);		
	}

}

//Chấm điểm dựa vào Testfälle:
//-1: vergessen, min & max einen beliebigen Wert zuzuweisen

//This version is the best one that I made, which was corrected by ChatGPT
//1.Problem: i didn't use the && to combine method (logically mistake)
//2.Problem: Assuming all values are different (what if they're the same => cannot print)
//3.Problem: I cannot "den minimalen Wert an min zuweisen" & "den maximalen Wert an max zuweisen"
//4.Problem: The task want me to find min (max) first than print. Not at the same time
//5.Problem: When typing ein beliebige Nummer, shouldn't type 07 instead of 7 => In Java, numbers with a leading 0 are interpreted as octal (base-8)

//Explanation of "den minimalen Wert an min zuweisen": Store the smallest number in the variable min (Not print it, but Store it in memory)
