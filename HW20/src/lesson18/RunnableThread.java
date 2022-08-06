package lesson18;

public class RunnableThread implements Runnable {

	int number;
	private Thread thread;
	
	public RunnableThread (int number) {
		this.number = number;
		this.thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		
		int i0=0;
		int i1=1;
		int i2;
		
		if (number < 1) {
			System.out.println("The number entered is negative or zero");
		}
		else if (number == 1) {
			System.out.println(i0);
		}
		else {
			Integer [] fibonacci = new Integer [number];
			fibonacci[0] = i0;
			fibonacci[1] = i1;
			
			System.out.print("Series of Fibonacci numbers in descending order:");
		for( int i = 2; i<fibonacci.length; i++) {
			i2 = i0 + i1;
			fibonacci[i] = i2;
			
			i0 = i1;
			i1 = i2;
		}
		
		for (int i =fibonacci.length -1; i>=2; i--) {
			System.out.print(fibonacci[i] + "");
		}
		
		System.out.print(fibonacci[1] + " " + fibonacci[0]);
		System.out.println();
		
		}
		

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
