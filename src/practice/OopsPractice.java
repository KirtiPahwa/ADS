package practice;
class A{
	protected static void run() {
	System.out.println("runA");
	}
}
class B extends A{
	public static void run() {
		System.out.println("runB");
	}
}
 class OopsPractice {
public static void main(String args[]) {
	B a=new B();
	B.run();
}
}

/*
 If a top-level class is declared as private the compiler will complain that the modifier private is not allowed here. This means that a top-level class cannot be a private, the same can be applied to protected access specifier also.
 Protected means that the member can be accessed by any class in the same package and by subclasses even if they are in another package.
 The top-level classes can only have public, abstract and final modifiers, and it is also possible to not define any class modifiers at all. This is called default/package accessibility.
 We can declare the inner classes as private or protected, but it is not allowed in outer classes.
 More than one top-level class can be defined in a Java source file, but there can be at most one public top-level class declaration. The file name must match the name of the public class.
*/