package Patterns;

public class NamePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1&&j<=5||j==3||i==5&&j<=3) {
					System.out.println("* ");
				}
			}
			System.out.println();
		}

	}

}
