

		
		// File name: JavaClass.java

		// Parent class
		class Animal {
		    String name;

		    // Constructor
		    Animal(String name) {
		        this.name = name;
		    }

		    // Method
		    void sound() {
		        System.out.println(name + " makes a sound");
		    }
		}

		// Child class (Inheritance + Polymorphism)
		class Dog extends Animal {
		    Dog(String name) {
		        super(name);
		    }

		    // Overriding (Polymorphism)
		    @Override
		    void sound() {
		        System.out.println(name + " barks");
		    }
		}

		// Main class
		public class JavaClass {
		    public static void main(String[] args) {
		        Animal a = new Animal("Generic Animal");
		        Dog d = new Dog("Buddy");

		        a.sound();  // Output: Generic Animal makes a sound
		        d.sound();  // Output: Buddy barks
		    }
		

		
		
	}


