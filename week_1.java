package lecture_notes;

public class week_1 {
	
	public static void main(String[] args) {
	
	//Week 1- From C to Java
		
			//Programming paradigms:  	
		
			// Structured programming- data lives in function or variable, control flow defined by loops, conditionals, function calls
		
		 	// Object-oriented programming (OOP)- running program made up of objects that have state (information) and behaviour (methods) 
				// -objects interact with one another by passing messages (calling methods) 
				// -"method" is like a function that belongs to an object 
				// -don't have to manage and store data
		
			//Java Booleans - data type that can only have one of two values (TRUE or FALSE) 
				// Boolean values: declared with the boolean keyword and can only take the values T or F 
				// Boolean expression: returns a boolean value T or F
	
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);
		System.out.println(isFishTasty);
		
			// Methods - must belong to a class!
				// Main method: a Java program starts running from a main method 
					// a) public static void main(String... args) {
					// b) public static void main(String[] args) {
		
			// Class - starts with upper case letter and has no underscores (by convention)
		
			// Syntax
				// End statements with a semi-colon (except for compound statements- for, while,...)
				// {} seperates blocks of code ie. to delimit bodies of classes, methods, if statements and loops
		
			// Strings
				// Has a type class for string and we can assign them to an array even once its been declared
		
		String s = "Hello, world!";
		s = "Hej verden!";
		s = "Molo lizwe!"; //can be double quoted 
		
		String p = "Hello";
		String t = ", world!";
		String u = p + t; //can be concatenated using the + operator
		
		System.out.print(p + "" + t); //can concatenate in print arguments- println only accepts one argument
		
				//print and println can handle any Java type
				//print does not go to the next line after printing
		
			// Variables & Types
				// type is declared along with variable name + can hold any values if the declared type
				// type cannot be changed

			
		String h = "Hello, world!"; //string type
		int z =123; //int type- written with no decimal and not ending in L
		double y = 1.0; //double literal type- written using a decimal not ending with F
		float f = 1.5F; //float type
		char x = 'a'; //char type
		List<integer> aList = new ArrayList<>(); //list 
		aList.add(1);
		aList.add(2);
		aList.add(3);
		int[] arr = new int[3]; //note bracket is after type, not after name
		arr[0] = 0; //same indexing as C
		arr[1] = 1;
		int[2] = 2;
		f = 1.5e1F; //scientific notation
		d = 1e100;
				
			// Reference Types
				// any type that begins with a capital letter
				// classes are user-defined reference types- which is why they must start with a capital
				// Reference variable: store references to objects
				// Reference: some value that allows the JVM to find on object in memory
		
		String q = "hello"; // q is a reference to a string object ie. it stores the memory address of the object that represents the String
		
			// Primitive Types
				// any type that begins with a lower case
				// boolean, byte, char, short, int, long, float, double
		
			//Commenting
		//single line
		/* multiple 
		 * lines
		 */
		
			//Math expressions
				// Math.pow(exponent, base)
				// For int, float types: +, -, *, /
					// Integer.MAX_VALUE, Double.MAX_VALUE, Integer.MIN_VALUE, Double.MIN_VALUE
					// if the calculation produces a value higher or lower than int max or min- it wraps around the other end of the range
					// for floats, the values saturate at positive or nagative infinity (Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY)
		
			// Classes + Methods
				// don't exist in Java, so the closest analog is a public static method
				// Method: similar to function but must be defined inside of a class 
				// "public" access modifier on a method means it is callable from within any class
					// so you must use the class name AND method name when calling a public method
				// method is allowed to return zero or one value
					// if it returns a value: it must declare the type immediately before the method name
					// if it returns nothing, it must declare that its return type is void and have no return statement
						// BUT it can have an empty return (return;) with no statement
		
		public class Lecture2 { // here Lecture2 is the class and max2 is the method
			
			public static int max2(int a, int b) { // int return type is specified so it MUST have a return statement in body
				int Twicemax = a + b +Math.abs(a - b);
				return twiceMax / 2; // twiceMax and 2 must both be in specified return type 
			}
		}
		
				// to call max2 method, a method in another class must import Lecture 2 and then call max2 method using the syntax:
				//import Lecture2; and int x = Lecture2.max2(5, -3);
		
		
			// If statements
				// similar to C
		public static double max3(double a, double b, double c) { //scope of these variables is inside the method- no global variables
			double result;
			if (a >= b && a >= C) {
				result = a;
			}
			else if (b >= a && b>= c) {
				result = b;
			}
			return result;			
		}
		
			// Logical Operators
				//&&- AND, ||- OR, !- NOT		
		
		}
	
	}	

}
