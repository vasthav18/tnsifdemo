package com.tnsif.lambda;

@FunctionalInterface
interface Greeting {
    void sayHello();
}
public class LambdaBasic {

	public static void main(String[] args) {
		Greeting greet = () -> System.out.println("Hello, vasthav!");
        greet.sayHello();
	}

}
