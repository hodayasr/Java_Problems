package myProject;

public class printInOrder {
	
	/*
	 * LeetCode 1114
	 * 
	 * Thread A will call first(), thread B will call second(), and thread C will call third(). 
	 * Design a mechanism and modify the program to ensure that second() is executed after first(), and third() is executed after second().
	 */

	    static int state; // 2 or 3


	    public static void first(Runnable printFirst) throws InterruptedException {
	        
	        // printFirst.run() outputs "first". Do not change or remove this line.
	        printFirst.run();
	        state=2;
	    }

	    public static void second(Runnable printSecond) throws InterruptedException {
	        while(state!=2)
	        {
	            Thread.sleep(0);
	        }
	        // printSecond.run() outputs "second". Do not change or remove this line.
	        printSecond.run();
	        state=3;
	    }

	    public static void third(Runnable printThird) throws InterruptedException {
	        while(state!=3)
	        {
	            Thread.sleep(0);
	        }
	        // printThird.run() outputs "third". Do not change or remove this line.
	        printThird.run();
	    }
	    
		
		public static void printInOrder() {
			printInOrder printInOrder = new printInOrder();
			Thread thread1 = new Thread(new Runnable() {
				public void run() {
					System.out.println("first");
				}
					});
				
			Thread thread2 = new Thread(new Runnable() {
				public void run() {
					System.out.println("second");	
				}});
				

			Thread thread3 = new Thread(new Runnable() {
				public void run() {
					System.out.println("third");	
				}});
			

			
			try {
				first(thread1);
				second(thread2);
				third(thread3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	public static void main(String[] args) {
		printInOrder.printInOrder();
	}

}
