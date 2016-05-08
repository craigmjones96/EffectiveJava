package com.nestedclasses;

public class AnonymousAndLocalClasses {
	
	interface HelloWorld {
		public void greet();
		public void greetSomeone(String name);
	}

	private class MySuperClass {
		private String name = "super";
		
		public void superGreet() {
			superGreetSomeone(name);
		}
		
		public void superGreetSomeone(String name) {
			System.out.println("Super hello " + name);
		}
	}
	
	public void sayHello() {

		// this is a local class as it is defined and given a name
		// that can be used. It can be instantiated multiple times
		// (See below where englishGreeting1 and englishGreeting2 
		// are instantiated).
		class EnglishGreeting implements HelloWorld {
			private String name = "world";

			public void greet() {
				greetSomeone(name);
			}

			public void greetSomeone(String name) {
				System.out.println("Hello " + name);
			}
		}

		// an anonymous class can only be instantiated as part of
		// its creation so cant be instantiated multiple times.
		// In this case we create a class based on the HelloWorld interface
		// so we must implement all the methods.
		HelloWorld spanishGreeting = new HelloWorld() {
			private String name = "mundo";

			public void greet() {
				greetSomeone(name);
			}

			public void greetSomeone(String name) {
				System.out.println("Hola " + name);
			}
		};
		
		MySuperClass myAnonymousClass = new MySuperClass() {
			
			public void anonymousGreet() {
				superGreetSomeone("Anon Craig");
			}
			
			@Override
			public void superGreet() {
				anonymousGreet();
			}
		};
		
		// local classes have a name and can be instantiated multiple times
		EnglishGreeting englishGreeting1 = new EnglishGreeting();
		EnglishGreeting englishGreeting2 = new EnglishGreeting();
		
		englishGreeting1.greet();
		englishGreeting2.greetSomeone("Jones");
		spanishGreeting.greetSomeone("Craig");
		
		// cant do this as you cant see methods define within an anonymous class
		// the only method you can see are methods from the interface it implements
		// or methods from the superclass
//		myAnonymousClass.anonymousGreet();
		
		// can call the super class methods directly
		myAnonymousClass.superGreetSomeone("Super Craig");
		
		// or can have the anonymous class override the super class methods
		// to add specific logic
		myAnonymousClass.superGreet();
	}
}