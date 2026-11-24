package Patterns;

public class LeftAlignedTraingale {

	public static void main(String[] args) {
		
//		System.out.println("--------------LEFT ALIGNED TRAINGLE------------");
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		System.out.println("-------------");
//		System.out.println(-------------------"Right aligned traingle"------------------);
//		int n=5;
//        for(int i=1;i<=n;i++)
//        {
//        	for(int j=1;j<=n-i;j++) {
//        		System.out.print(" ");
//        	}
//        	for(int j=1;j<=i;j++) {
//        		System.out.print("*");
//        	}
//        	System.out.println();
//        	
//        }
		
//		System.out.println("=================inverted right angle triangle=======");
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//        
//       System.out.println("=====================PYRAMMID");
//       int n=5;
//       for(int i=1;i<=n;i++) {
//    	   for(int j=1;j<=n-i;j++) {
//    		   System.out.print(" ");
//    	   }
//    	   for(int j=1;j<=(2*i)-1;j++) {
//    		   System.out.print("*");
//    	   }
//    	   System.out.println();
//        }
		
//		System.out.println("===================INVERTED PYRAMMID");
//		int n=4;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i-1;j++) {
//				System.out.print("");
//			}
//			for(int j=1;j<=2*(n-i)+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		System.out.println("============INCREASING NUMBER TRAINGALE");
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		System.out.println("=============REPEATED NUMBER TRIANGLE");
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
//		System.out.println("=================Inverted number triangle");
//		int n=5;
//		for(int i=1;i<=n;i++)
//		{ 
//			for(int j=1;j<=(n-i)+1;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		System.out.println("================continuous number triangle=====");
//		int n=5;
//		int k=1;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				
//				System.out.print(k+" ");
//				k++;
//				
//			}
//			System.out.println();
//		}
		
//		System.out.println("==================ALPHABET TRAINGALE");
//		
//		for(int i=65;i<=69;i++) {
//			for(int j=65;j<=i;j++) {
//				System.out.print((char)j+" ");
//				
//			}
//			System.out.println();
//		}
		
		System.out.println("=================INVERTED REPEATED TRIANGLE");
		int n=5;
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		}

}
