package NumberProgram;

import java.util.Scanner;

class Pat1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size:");
		int size = sc.nextInt();

		
		for(int row=1; row<=size; row++){
			for(int col=1; col<=row; col++){
				System.out.print("* ");
			}
			System.out.println();
		}
				
	}
} 


/*

Enter size:5
*
* *
* * *
* * * *
* * * * *

*/