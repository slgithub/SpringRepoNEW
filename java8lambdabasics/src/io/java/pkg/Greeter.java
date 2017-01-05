/**
 * 
 */
package io.java.pkg;

/**
 * @author SU828791
 *
 */
public class Greeter {
	
	public void greet(Greeting greeting){
		greeting.perform();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter gGreeter= new Greeter();
		//Greeting hHelloWorldGreeting= new HelloWorldGreeting();
		//gGreeter.greet(hHelloWorldGreeting);
		Greeting myLambdaGreeting = () -> System.out.println("hello Lambda");
		//myLambdaGreeting.perform();
		gGreeter.greet(myLambdaGreeting);
	}

}

/*interface MyLambda{
	void foo();
}*/

