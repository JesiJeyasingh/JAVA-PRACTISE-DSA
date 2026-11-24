package Patterns;

public class InterviewPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //BUTTERFLY PATTERN
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(j==1||j==7||i==j||i+j==8) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
