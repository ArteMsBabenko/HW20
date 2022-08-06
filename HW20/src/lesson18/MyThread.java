package lesson18;

public class MyThread extends Thread {
	
	int number;
	
	public MyThread(int number) {
		this.number = number;
	}
	
	public void run() {
		
		int i0 = 0;
		int i1 = 1;
		int i2;
		
		if(number < 1) {
			System.out.println("The entered number is negative or equal to zero");
		}
		
		else if (number ==0) {
			System.out.println(i0);
		}
		else {
			System.out.print("A series of Fibonacci numbers in ascending order: " + i0 + " " + i1 + " ");
		
			for (int i = 2; i<= number -1; i++) {
				i2 = i0 + i1;
				
				System.out.print(i2 + "");
				
				i0=i1;
				i1=i2;
				
			}
		
			System.out.println();
			
		}
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
