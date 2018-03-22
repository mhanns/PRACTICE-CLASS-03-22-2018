//Maurice Hanns CSC 242 03/21/2018

import java.util.Scanner;
import java.util.Random;

public class floatArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Random rand1 = new Random();
			
		int [] eRay = new int[10];
					
			for (int i = 1; i < eRay.length; i++){
					
				eRay[i] = rand1.nextInt(50);
				
				//System.out.println("i = " + eRay[i]);				
				
				if (eRay[i % 2] == 0){
					System.out.println(eRay[i]);
				}
	}
			
	}

}
