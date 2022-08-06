package lesson18;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	
	public static void main(String[] args) {
		
		int number = getNumberFibonacci();
		
		MyThread myThread = new MyThread(number);
		myThread.start();
		
		RunnableThread myRunnable = new RunnableThread(number);
		
		System.out.println();
		
		int number2 = getNumberFibonacci();
		
		ExecutorService executors1 = Executors.newFixedThreadPool(50);
		ExecutorService executors2 = Executors.newScheduledThreadPool(50);
		
		
		executors1.execute(new Runnable() {

			@Override
			public void run() {
				Fibonacci.getFibonacci(number2, true);
			}
		});
		
		executors2.execute(new Runnable() {

			@Override
			public void run() {
				Fibonacci.getFibonacci(number2, false);
			}
		});
		
		executors1.shutdown();
		executors2.shutdown();
		
	}
	
	private static int getNumberFibonacci() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of numbers in the Fibonacci series:");
		int number = sc.nextInt();
		return number;
	}

}
