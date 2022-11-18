package Assingment1;

public class pattern4 {

	public static void main(String[] args) {
		int i,j;
		int n=14;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(j==0 && i>5 || j==n-1 && i>5 || i==n-1 || i==n-2 
						|| 5+j<i || i+j>=(n-1) + (n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
