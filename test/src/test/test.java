package test;

public class test {
	public static void main(String[] args) {
//	for (int nummber = 1; nummber <= 10; nummber++) {
//		if (nummber%2==0) {
//			System.out.println("For01 = " + nummber);
//		}
//	  }
//		int count = 0;
//		int sum = 0;
//	for (int nummber = 1; nummber <= 20; nummber++) {
//		if (nummber%2==0) {
//			count++;
//			sum +=  nummber;
//		}
//	  }
//	System.out.print("For01 = " + count);
//	System.out.println("For01 = " + sum);
//		for (int nummber = 1; nummber <= 10; nummber++) {
//			if (nummber != 10) {
//				System.out.print(nummber + ",");
//			} else {
//				System.out.print(nummber);
//			}
//		}
		int[] array2 = new int[20];
		int before2 = 0;
        for(int i=0; i<array2.length; i++){
        	array2[i] = before2;
        	before2 += 5;
        	System.out.print(array2[i] + ",");
       }
        System.out.println("");
		
		int[] array1 = new int[20];
		int before = 0;
        for(int i=0; i<array1.length; i++){
        	array1[i] = before;
        	before += 5;
            if (i<= 10 && array1[i]%2 !=0 ) {
            	System.out.print(array1[i] + ",");
            } 
            else if (i> 10 && array1[i]%2==0 ) {
            	System.out.print(array1[i] + ",");
            }
       }
	}
}
