package practice;

/*
 * 
 * The scope of a nested class is bounded by the scope of its enclosing class. Thus in below example, class NestedClass does not exist independently of class OuterClass.
A nested class has access to the members, including private members, of the class in which it is nested. But the enclosing class does not have access to the member of the nested class.
A nested class is also a member of its enclosing class.
As a member of its enclosing class, a nested class can be declared private, public, protected, or package private(default).
 */


class topClass{// top class can only be public,abstract,final.
	 int a;
	static class baseClass{
		 int b; //private fields
		
	}
	class baseClass2{
		
	}
	final int c;
	{c=3;	}
	/*
	 * A blank instance level final variable cannot be left uninitialized.

The blank Instance level final variable must be initialized in each constructor.

The blank Instance level final variable cannot be initialized in class methods.

A blank static final variable cannot be left uninitialized.

The static final variable must be initialized in a static block.

A static final variable cannot be initialized in constructor or class methods.


	 */
}
	
	
public class NestedClass {

	public static void main(String[] args) {
		topClass o=new topClass();
	
//		baseClass p=o.new baseClass();  //cann't access like that.
		topClass.baseClass p=new topClass.baseClass(); //static class can be accessed like this
		topClass.baseClass2 q=o.new baseClass2(); //public class
		System.out.println(p.b); ///a is not accessible
		System.out.println(o); //cann't access b
	}

}
