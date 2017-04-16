package io.java.pkg;

public class RunnableExample {

	public static void main(String[] arg){
		/*Thread myThread= new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("NEW Runnable thread running.................");
				
			}});*/
		Runnable myRunnable = () -> System.out.println("NEW Runnable thread running.................");
		Thread myThread= new Thread(myRunnable);
		myThread.start();
		/* it works because runnable has only one method in the interface i.e. run method..if there is more than one method then it would not work  */
	}

}


