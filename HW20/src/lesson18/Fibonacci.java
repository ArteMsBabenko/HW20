package lesson18;


public class Fibonacci {
	
	public static synchronized void getFibonacci (int number, boolean order) {
		int i0 = 0;
		int i1 = 1;
		int i2;
		
		if(number < 1) {
			System.out.println("The entered number is negative or equal to zero");
		}
		else if (number == 1) {
			System.out.println(i0);
		}
		else if (order == true) {
			System.out.print("A series of Fibonacci numbers in ascending order: " + i0 + " " + i1 + " " );
			
			for (int i =2; i <= number -1; i++) {
				i2 = i0 + i1;
				
				System.out.print(i2 + "");
				
				i0 = i1;
				i1 = i2;
			}
			
			System.out.println();
		}
		
		else {
			Integer[] fibonacci = new Integer [number];
			fibonacci[0] = i0;
			fibonacci[1] = i1;
			
			System.out.print("A series of Fibonacci numbers in descending order:");
			
			for(int i =2; i<fibonacci.length; i++) {
				i2 = i0 + i1;
				fibonacci[i] = i2;
				
				i0 = i1;
				i1 = i2;
			}
			
			for(int i =fibonacci.length -1; i >= 2; i--) {
			System.out.print(fibonacci[i] + "");
			}
			
			System.out.print(fibonacci[1] + " " + fibonacci[0]);
			System.out.println();
		}
		
		try {
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	
}
